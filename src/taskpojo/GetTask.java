package taskpojo;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;

public class GetTask {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream fileOutPutStream = new PrintStream(new File("somefile.txt"));
		RestAssured.config = RestAssured.config().logConfig(new LogConfig().defaultStream(fileOutPutStream));
		RestAssured.baseURI="";
			
		Response response = given()
				.log().all() 
				.auth()
				.basic("mary.aberdeen", "Welcome1")
				.header("Content-Type","application/json")
			.when()
				.log().all()
				.get("/projectPlans/300100542946033/child/Tasks/300100543424841");
		
		int statuscode = response.getStatusCode();
		Task responseuser = response.as(Task.class);

		System.out.println("Name in response: "+ responseuser.getName());
		System.out.println("Id in response: "+ responseuser.getTaskId());
		System.out.println("status code: "+ statuscode);

		
		Response response2 = given()
				.log().all() 
				.auth()
				.basic("mary.aberdeen", "Welcome1")
				.header("Content-Type","application/json")
			.when()
				.log().all()
				.get("/projectPlans/300100542946033/child/Tasks/300100543424841");
	}

}
