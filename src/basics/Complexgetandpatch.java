package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Complexgetandpatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://reqres.in/api";
		String response = given()
			.log().all()
			.queryParam("page", 1)
			.header("Content-Type","application/json")
		.when()
			.log().all()
			.get("users")
		.then().log().all().statusCode(200)
		.extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String id0 = js.getString("data[0].id");
		System.out.println("id0 in response: "+ id0);
		
		
		String patchresponse = given()
			.log().all()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		.when()
			.log().all()
			.patch("users/"+id0)
		.then().log().all().statusCode(200)
		.extract().response().asString();
		
		System.out.println(patchresponse);
		
		
	}

}

