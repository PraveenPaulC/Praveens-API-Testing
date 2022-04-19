package CURDoperation;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch {
	@Test
	public void post()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("Author", "GitMaster");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.patch("http://localhost:3000/posts/101")
		
		.then()
		.log().all();
	}

}
