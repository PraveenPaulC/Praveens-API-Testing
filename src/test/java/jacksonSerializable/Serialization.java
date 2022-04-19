package jacksonSerializable;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Serialization {
	@Test
	public void demo() throws JsonGenerationException, JsonMappingException, IOException
	{
		Project pogo=new Project("John",20,12.00,5);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("./project.json"),pogo);
				
	}

}
