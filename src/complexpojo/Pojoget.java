package complexpojo;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Pojoget {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api";
		Response response = given()
				.log().all() 				
				.header("Content-Type","application/json")
			.when()
				.log().all()
				.get("/unknown");
		
		int statuscode = response.getStatusCode();
		ResourcesList responseuser = response.as(ResourcesList.class);
		
		System.out.println("Support Text: "+ responseuser.getSupport().getText());
		System.out.println("status code: "+ statuscode);
		
	}

}
