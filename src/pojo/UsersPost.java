package pojo;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UsersPost {

	public static void uerspost() {
		
		RestAssured.baseURI="https://reqres.in/api";
		Users postpayload = new Users();
		postpayload.setJob("SDET");
		postpayload.setName("Sumanth");
		
		Response response = given()
				.log().all() 
				.body(postpayload)
				.header("Content-Type","application/json")
			.when()
				.log().all()
				.post("users");
		
		int statuscode = response.getStatusCode();
		Users responseuser = response.as(Users.class);
		
			
			System.out.println("Name in response: "+ responseuser.getName());
			System.out.println("status code: "+ statuscode);
			
			
	}

}
