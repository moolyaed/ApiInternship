package specBuilder;


import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {
	
	String baseURI = "https://api.trello.com";
	
	public RequestSpecification requestSpec;
	
	@BeforeClass
	public void requestSpecification() {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		
		builder.setBaseUri(baseURI);
		builder.addParam("key", "934b6c23a3ada9e76cfd3f2c691bc27e");
		builder.addParam("token", "ATTA41f1ef639fa266cbb29e6dd80ae8a5a96d2909f6a02722e4a8d5ef2498a7dc4345D3E1E7");
		builder.addHeader("Content-Type", "application/json");
		
		requestSpec = builder.build();
		
	}
}
