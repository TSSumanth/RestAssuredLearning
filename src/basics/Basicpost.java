package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers;

public class Basicpost {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/api";
		String response = given()
			.log().all() 
			.body("{\r\n"
					+ "    \"name\": \"morpheus\",\r\n"
					+ "    \"job\": \"leader\"\r\n"
					+ "}")
			.header("Content-Type","application/json")
		.when()
			.log().all()
			.post("users")
		.then().log().all()			
			.body("name", Matchers.equalTo("morpheus"))
			.assertThat().statusCode(201)
			.extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String name = js.getString("name");
		System.out.println("Name in response: "+ name);

	}

}
