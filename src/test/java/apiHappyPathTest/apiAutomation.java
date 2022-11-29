package apiHappyPathTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class apiAutomation
{
	
	@Test(priority = 1)
	public void DemoDetails() { 
		
		
		// using base URL to the RESTful web service 
		RestAssured.baseURI = "https://vendor-management-system-kxyaws5ixa-uc.a.run.app/vms/vendors"; 
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = RestAssured.given(); 
		// using the method type (GET)  
		Response response = httpRequest.request(Method.GET, "");
		// get the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
		int statusCode = response.getStatusCode();

        // check if correct status code is returned.
       Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
         "Correct status code returned");
       
       
       System.out.println("-----------------------------");
    
       
       // https://vendor-management-system-kxyaws5ixa-uc.a.run.app/vms/vendor [ for post ]
       /*  {
  "vendorId": "123",
  "tenantId": "456",
  "vendorName": "789",
  "status": "active"
}
*/
		
		
	}
	@Test(priority = 0)
	public void DemoDetails2() throws JSONException { 
		
		 String jsonBody = "{" +
	                "   \"vendorId\":\"123\",\n" +
	                "   \"tenantId\":\"456\",\n" +
	                "   \"vendorName\":\"789\",\n" +
	                "   \"status\":\"active\"\n" +
	                "}";
		
		 RestAssured.baseURI ="https://vendor-management-system-kxyaws5ixa-uc.a.run.app/vms/vendor"; 
		    RequestSpecification request1 = RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON).and().body(jsonBody);
			Response response = request1.request(Method.POST, "");
		    ResponseBody body = response.getBody();
		    System.out.println(response.getStatusLine());
		    System.out.println(body.asString());
		    int statusCodePost = response.getStatusCode();

	        
	       Assert.assertEquals(statusCodePost /*actual value*/, 200 /*expected value*/, 
	         "Correct status code returned");
		
     
	}

}
