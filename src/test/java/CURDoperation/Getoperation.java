package CURDoperation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Getoperation 
{
	@Test
	public void getoperation()
	{
		when()
		.get("http://localhost:3000/posts")
		
		.then()
		.log().all();
	}
}
