package specBuilder;

import org.testng.annotations.BeforeClass;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationBuilder {
	
public ResponseSpecification responseSpec;
	
	@BeforeClass
	public void ResponseSpecification() {
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectStatusCode(401);
		builder.expectHeader("Content-Type","text/plain; charset=utf-8");
		responseSpec = builder.build();
	}


}
