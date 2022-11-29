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

public class apiAutomation 
{
		@Test
		public void post() throws JSONException 
		{
			RequestSpecification request= RestAssured.given();
			 String jsonBody = "\"statusCode\": 0,\r\n" + 
			 		"  \"timestamp\": \"2022-11-29T16:15:06.961Z\",\r\n" + 
			 		"  \"message\": \"string\",\r\n" + 
			 		"  \"description\": {\r\n" + 
			 		"    \"additionalProp1\": \"string\",\r\n" + 
			 		"    \"additionalProp2\": \"string\",\r\n" + 
			 		"    \"additionalProp3\": \"string\"\r\n" + 
			 		"  }";
			
			 RestAssured.baseURI ="https://vendor-management-system-kxyaws5ixa-uc.a.run.app/vms/vendor"; 
			    RequestSpecification request1 = RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON).and().body(jsonBody);
				Response response = request1.request(Method.POST, "");
			    ResponseBody body = response.getBody();
			    System.out.println(response.getStatusLine());
			    System.out.println(body.asString());
			    int statusCodePost = response.getStatusCode();

		        
		       Assert.assertEquals(statusCodePost , 400 , 
		         "Correct status code returned");
			
		}

}
