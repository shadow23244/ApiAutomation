package apiInvalidTest;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class apiAutomation_invalidtest 
{
	@Test
	public void post500() throws JSONException 
	{
		RequestSpecification request= RestAssured.given();
		 String jsonBody = "{\r\n" + 
		 		"  \"cause\": {\r\n" + 
		 		"    \"stackTrace\": [\r\n" + 
		 		"      {\r\n" + 
		 		"        \"classLoaderName\": \"string\",\r\n" + 
		 		"        \"moduleName\": \"string\",\r\n" + 
		 		"        \"moduleVersion\": \"string\",\r\n" + 
		 		"        \"methodName\": \"string\",\r\n" + 
		 		"        \"fileName\": \"string\",\r\n" + 
		 		"        \"lineNumber\": 0,\r\n" + 
		 		"        \"nativeMethod\": true,\r\n" + 
		 		"        \"className\": \"string\"\r\n" + 
		 		"      }\r\n" + 
		 		"    ],\r\n" + 
		 		"    \"message\": \"string\",\r\n" + 
		 		"    \"suppressed\": [\r\n" + 
		 		"      {\r\n" + 
		 		"        \"stackTrace\": [\r\n" + 
		 		"          {\r\n" + 
		 		"            \"classLoaderName\": \"string\",\r\n" + 
		 		"            \"moduleName\": \"string\",\r\n" + 
		 		"            \"moduleVersion\": \"string\",\r\n" + 
		 		"            \"methodName\": \"string\",\r\n" + 
		 		"            \"fileName\": \"string\",\r\n" + 
		 		"            \"lineNumber\": 0,\r\n" + 
		 		"            \"nativeMethod\": true,\r\n" + 
		 		"            \"className\": \"string\"\r\n" + 
		 		"          }\r\n" + 
		 		"        ],\r\n" + 
		 		"        \"message\": \"string\",\r\n" + 
		 		"        \"localizedMessage\": \"string\"\r\n" + 
		 		"      }\r\n" + 
		 		"    ],\r\n" + 
		 		"    \"localizedMessage\": \"string\"\r\n" + 
		 		"  },\r\n" + 
		 		"  \"stackTrace\": [\r\n" + 
		 		"    {\r\n" + 
		 		"      \"classLoaderName\": \"string\",\r\n" + 
		 		"      \"moduleName\": \"string\",\r\n" + 
		 		"      \"moduleVersion\": \"string\",\r\n" + 
		 		"      \"methodName\": \"string\",\r\n" + 
		 		"      \"fileName\": \"string\",\r\n" + 
		 		"      \"lineNumber\": 0,\r\n" + 
		 		"      \"nativeMethod\": true,\r\n" + 
		 		"      \"className\": \"string\"\r\n" + 
		 		"    }\r\n" + 
		 		"  ],\r\n" + 
		 		"  \"statusCode\": 0,\r\n" + 
		 		"  \"timestamp\": \"2022-11-29T16:15:06.962Z\",\r\n" + 
		 		"  \"message\": \"string\",\r\n" + 
		 		"  \"description\": \"string\",\r\n" + 
		 		"  \"suppressed\": [\r\n" + 
		 		"    {\r\n" + 
		 		"      \"stackTrace\": [\r\n" + 
		 		"        {\r\n" + 
		 		"          \"classLoaderName\": \"string\",\r\n" + 
		 		"          \"moduleName\": \"string\",\r\n" + 
		 		"          \"moduleVersion\": \"string\",\r\n" + 
		 		"          \"methodName\": \"string\",\r\n" + 
		 		"          \"fileName\": \"string\",\r\n" + 
		 		"          \"lineNumber\": 0,\r\n" + 
		 		"          \"nativeMethod\": true,\r\n" + 
		 		"          \"className\": \"string\"\r\n" + 
		 		"        }\r\n" + 
		 		"      ],\r\n" + 
		 		"      \"message\": \"string\",\r\n" + 
		 		"      \"localizedMessage\": \"string\"\r\n" + 
		 		"    }\r\n" + 
		 		"  ],\r\n" + 
		 		"  \"localizedMessage\": \"string\"\r\n" + 
		 		"}";
		
		 RestAssured.baseURI ="https://vendor-management-system-kxyaws5ixa-uc.a.run.app/vms/vendor"; 
		    RequestSpecification request1 = RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON).and().body(jsonBody);
			Response response = request1.request(Method.POST, "");
		    ResponseBody body = response.getBody();
		    System.out.println(response.getStatusLine());
		    System.out.println(body.asString());
		    int statusCodePost = response.getStatusCode();

	        
	       Assert.assertEquals(statusCodePost , 500 ,"Correct status code returned");
		
	}
}
