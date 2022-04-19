package CURDoperation;
import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Xpath {
	@Test
	public void xpath()
	{
		when()
		.get("http://localhost:3000/posts")
		
		.then().log().all()
		.and().body("[1].id",Matchers.is(1200))
		.and().body("[2].title", Matchers.equalTo("GitHub"));
		
		
	}

}
