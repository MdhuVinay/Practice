package hybrid;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Single_user {

	public static void main(String[] args)
	{
		//requestSpecBuilder
		RequestSpecBuilder rb=new RequestSpecBuilder();
//		RequestSpecification req = rb.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
//		given().spec(req).get("/api/users/2").then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
//		System.out.println("done");
		
		//response
//		RequestSpecification req1 = rb.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
//		Response response = given().spec(req1).when().get("/api/users/2").then().extract().response();
//		System.out.println(response.prettyPrint());
		
		//ResponseSpecBuilder
		RequestSpecification req = rb.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		
		ResponseSpecBuilder res_bul=new ResponseSpecBuilder();
		ResponseSpecification res = res_bul.expectContentType(ContentType.JSON).expectStatusCode(200).build();
		Response response = given().spec(req).when().get("/api/users/2").then().spec(res).extract().response();
		System.out.println(response.prettyPrint());
		
	}

}
