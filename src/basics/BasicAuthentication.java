package basics;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class BasicAuthentication {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/api";
		given()
			.auth()
			.basic("username", "passward")
			.log().all()
			.queryParam("page", 1)
			.header("Content-Type","application/json")
		.when()
			.log().all()
			.get("users")
		.then().log().all().statusCode(200);

	}

}
