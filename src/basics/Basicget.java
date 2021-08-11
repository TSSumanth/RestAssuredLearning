package basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basicget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://reqres.in/api";
		given()
			.log().all()
			.queryParam("page", 1)
			.header("Content-Type","application/json")
		.when()
			.log().all()
			.get("users")
		.then().log().all().statusCode(200);

	}

}