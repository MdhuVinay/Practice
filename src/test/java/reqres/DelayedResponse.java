package reqres;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class DelayedResponse {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		System.out.println(req.request(Method.GET,"/api/users?delay=3").prettyPrint());
	}

}
