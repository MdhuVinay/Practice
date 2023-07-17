package pojo;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Get1 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Single_user res = r.get("/api/users/2").as(Single_user.class);
		Data data = res.getData();
		Support support = res.getSupport();
		System.out.println(data.getFirst_name());
		System.out.println(support.getText());
	}
}
