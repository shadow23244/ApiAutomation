package apiHappyPathTest;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class apiAutomation2
{
	@Test
	public void post() throws JSONException 
	{
		RequestSpecification request= RestAssured.given();
		
		request.header("Content-Type", "application/json");
		request.header("accept", "application/json");
		JSONObject json=new JSONObject();
		json.put("vendorId", "123");
		json.put("tenantId", "8856");
		json.put("vendorName", "789");
		json.put("status", "active");
		
		request.body(json.toString());
		
		Response response= request.post("https://vendor-management-system-kxyaws5ixa-uc.a.run.app/vms/vendor");
		ResponseBody body = response.body();
		System.out.println(body.asString());
		
		int code = response.getStatusCode();
		
		Assert.assertEquals(code, 200);
		
	}

}
