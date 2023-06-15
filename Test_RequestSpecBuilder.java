package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_RequestSpecBuilder extends specBuilder.RequestSpecificationBuilder{
	
	@Test
	public void createBoard() {
		
		given()
			.queryParam("name", "Hanish")
			.spec(requestSpec).
		when()
			.post("/1/boards/").
		then()
			.statusCode(400).
			log().all();
	}

}
