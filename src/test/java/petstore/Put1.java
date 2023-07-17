package petstore;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("id", "1");
		obj.put("username", "madhuvinay");
		obj.put("firstName", "madhusb");
		obj.put("lastName", "vinaysb");
		obj.put("email", "mv@gmail.com");
		obj.put("password", "1");
		obj.put("phone", "1");
		obj.put("userStatus", "1");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response a = req.request(Method.PUT,"/user/madhuvinay");
		System.out.println(a.asString());
		System.out.println(a.statusCode());
		System.out.println(a.statusLine());
	}

}
