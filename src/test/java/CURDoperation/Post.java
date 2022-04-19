package CURDoperation;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Post {
	@Test
	
	public void post()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("id",1200);
		jobj.put("title","Priscilla");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.post("http://localhost:3000/posts")
		
		.then()
		.log().all();
	}

}
