package taskpojo;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PatchTask {

	public static void main(String[] args) {
		
		RestAssured.baseURI="";
		Task postpayload = new Task();
		postpayload.setName("SDET3");
		postpayload.setPlannedDuration("20");
		
		
		Response response = given()
				.log().all() 
				.auth()
				.basic("mary.aberdeen", "Welcome1")
				.body(postpayload)
				.header("Content-Type","application/json")
			.when()
				.log().all()
				.patch("/projectPlans/300100542946033/child/Tasks/300100543424841");
		
		int statuscode = response.getStatusCode();
		Task responseuser = response.as(Task.class);

		System.out.println("Name in response: "+ responseuser.getName());
		System.out.println("Id in response: "+ responseuser.getTaskId());
		System.out.println("status code: "+ statuscode);

	}

}
