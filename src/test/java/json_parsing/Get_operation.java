package json_parsing;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class Get_operation {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		 String res = r.get("/api/users/2").asString();
		JsonPath json=new JsonPath(res);
		System.out.println(json.getShort("data.id"));
	}

}
