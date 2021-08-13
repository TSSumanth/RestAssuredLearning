package basics;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Hashmapasbody {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/api";
		
		HashMap mp = new HashMap();
		mp.put("name","morpheus");
		mp.put("job","leader");
		
		String response = given()
			.log().all() 
			.body(mp)
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
