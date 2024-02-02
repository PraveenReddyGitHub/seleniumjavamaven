package com.day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//launching browser
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();//alert will open
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();//switching to the alert/popup window
		System.out.println(myalert.getText());
		myalert.sendKeys("praveen");
		Thread.sleep(5000);
		myalert.accept();
		//myalert.dismiss();
		System.out.println("successfully Entered name in text box and click on ok button");
		driver.close();
		

	}

}
