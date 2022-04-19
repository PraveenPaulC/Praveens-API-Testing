package jacksonSerializable;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class CreateRepoUsingPojo {
	@Test
	
	public void createRepo()
	{
		PostOperation post=new PostOperation(101,"GitHub");
		
		given()
		.contentType(ContentType.JSON)
		.body(post)
		
		.when()
		.post("http://localhost:3000/posts")
		
		.then()
		.log().all();
		
	}

}
