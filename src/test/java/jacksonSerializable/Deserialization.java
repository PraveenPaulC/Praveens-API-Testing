package jacksonSerializable;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Deserialization {
	@Test
	public void demo() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper=new ObjectMapper();
		Project pojo=mapper.readValue(new File("./project.json"),Project.class);
		System.out.println(pojo.employeeAge);
		System.out.println(pojo.employeeName);
		System.out.println(pojo.empSalary);
		System.out.println(pojo.teamSize);
	}

}
