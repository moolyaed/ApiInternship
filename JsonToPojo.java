package pojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		PojoSetterGetter pojo = mapper.readValue(new File("C:\\Users\\admin\\Documents\\"
				+ "workspace-spring-tool-suite-4-4.17.1.RELEASE\\apiInternship\\src\\test\\resources\\simple.json"), PojoSetterGetter.class);
		System.out.println(pojo.getId());
		System.out.println(pojo.getFirstName());

	}

}
