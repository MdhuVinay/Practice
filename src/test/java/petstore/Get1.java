package petstore;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get1 {

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RequestSpecification req = RestAssured.given();
//		JSONObject obj=new JSONObject();
		Response a = req.request(Method.GET,"/user/madhuvinay");
		System.out.println(a.asString());
		System.out.println(a.statusCode());
		System.out.println(a.statusLine());
		
		
	}

}
