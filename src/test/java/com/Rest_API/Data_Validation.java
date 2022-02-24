package com.Rest_API;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {

@Test
public void validate_Data() {
RestAssured.baseURI="https://reqres.in/";
RequestSpecification request = RestAssured.given();
Response response = request.get("api/users/2");
String response_Body = response.asString();
System.out.println(response_Body);
int Status_code = response.getStatusCode();
System.out.println("Status Code is : "+Status_code);
Assert.assertEquals(200, Status_code);
System.out.println("Data validation success :");
ResponseBody body = response.getBody();
System.out.println(body);
long time = response.getTime();
System.out.println("The time is :"+time);
String sessionId = response.getSessionId();
System.out.println("The Session Id is :"+sessionId);
String statusLine = response.getStatusLine();
System.out.println("the Status Line is:"+statusLine);




}
}
