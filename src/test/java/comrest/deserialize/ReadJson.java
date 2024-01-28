package comrest.deserialize;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


public class ReadJson {
	@Test
	public void extractJsonPath() throws IOException, ParseException {
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\rest\\testData\\User.json";
	//	System.out.println(path);
		FileReader reader= new FileReader(path);
		JSONParser parser= new JSONParser();
		Object obj= parser.parse(reader);
		String json=obj.toString();
		JsonPath js = new JsonPath(json);
		System.out.println(js.get("user[0].name"));
		System.out.println(js.get("user[0].friends.name[1]"));
		
	}

}
