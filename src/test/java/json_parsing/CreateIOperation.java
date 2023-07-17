package json_parsing;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class CreateIOperation {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put( "name", "morpheus");
		obj.put( "job", "leader");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		String res = r.post("/api/users").asString();
		JsonPath path= new JsonPath(res);
		System.out.println(path.getString("job"));
		
		
	}

}
