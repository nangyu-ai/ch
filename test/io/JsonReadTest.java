package test.io;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class JsonReadTest {
	public JsonReadTest() {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONArray list = (JSONArray)jsonParser.parse(new FileReader("resource/local.json"));
			//System.out.println(list);
			
			for(int i = 0; i < list.size(); i++) {
				JSONObject item = (JSONObject)list.get(i);
				System.out.println(item);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String...args) {
		new JsonReadTest();
	}
}
