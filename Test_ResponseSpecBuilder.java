package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import specBuilder.ResponseSpecificationBuilder;
import static io.restassured.RestAssured.*;
import java.io.File;

public class Test_ResponseSpecBuilder extends ResponseSpecificationBuilder{
	
	String id = "64894d486c6e3c763c250b60";
	
	@Test
	public void testResponse() {
		
		RestAssured.baseURI="https://api.trello.com";
		when()
			.get("/1/boards/"+id).
		then()
			.spec(responseSpec)
			.assertThat()
	        .body(JsonSchemaValidator.
	         matchesJsonSchema(new File("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.17.1.RELEASE\\apiInternship\\src\\test\\resources\\schema.json")));
	}
}
