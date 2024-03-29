package day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


/*
 given()
 	content type, set cookies, add auth, add param, set headers info etc....

when()
	get, post, put, delete

then()
	validate status code, extract response, extract headers cookies & response body....

*/


public class HTTPRequests {
	int id;
	
	@Test(priority=1)
	void getUsers()
	{
		given()
				
		.when()
			.get("https://reqres.in/api/users?page=2")
				
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
			
	}
	

	@Test(priority=2)
	void createUser()
	{
		HashMap data=new HashMap();
		data.put("name","pavan");
		data.put("job","trainer");
		
	}}
