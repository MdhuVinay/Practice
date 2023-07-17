package pojo_list_user;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Runner1 {

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Listuser s = r.get("/api/users?page=2").as(Listuser.class);
		Support s2 = s.getSupport();
		System.out.println(s2.getUrl());
		List<Data> d = s.getData();
		for (Data d1 : d) 
		{
			System.out.println(d1.getFirst_name()+" "+d1.getLast_name());
		}
	}

}
