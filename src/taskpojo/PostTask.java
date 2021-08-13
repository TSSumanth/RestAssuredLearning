package taskpojo;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.Users;

public class PostTask {

	public static void main(String[] args) {
				
		RestAssured.baseURI="";
		Task postpayload = new Task();
		postpayload.setName("SDET");
		postpayload.setPlannedDuration("10");
		
		
		Response response = given()
				.log().all() 
				.auth()
				.basic("mary.aberdeen", "Welcome1")
				.body(postpayload)
				.header("Content-Type","application/json")
			.when()
				.log().all()
				.post("/projectPlans/300100542946033/child/Tasks");
		
		int statuscode = response.getStatusCode();
		Task responseuser = response.as(Task.class);

		System.out.println("Name in response: "+ responseuser.getName());
		System.out.println("Id in response: "+ responseuser.getTaskId());
		System.out.println("status code: "+ statuscode);
		
	}
	
	

}
