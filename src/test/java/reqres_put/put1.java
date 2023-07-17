package reqres_put;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "madhuvinay12");
		obj.put("job", "engg");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response a = req.request(Method.PUT,"/api/users/2");
		System.out.println(a.asString());
		System.out.println(a.statusCode());
		System.out.println(a.statusLine());
	}

}
