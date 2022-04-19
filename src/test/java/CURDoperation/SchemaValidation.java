package CURDoperation;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;
public class SchemaValidation {
	@Test
	public void tc()
	{
		when()
		.get("http://localhost:3000/posts")
		
		.then().log().all()
		.and().body(matchesJsonSchemaInClasspath("schema.json"));
	}

}
