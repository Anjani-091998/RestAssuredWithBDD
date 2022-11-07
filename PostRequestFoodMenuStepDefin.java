package stepDefination;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;



public class PostRequestFoodMenuStepDefin {
	RequestSpecification request;
  Response res;
  ValidatableResponse val;
	@Given("user wants to sava  data by using admin id")
	public void user_wants_to_sava_data_by_using_admin_id() {
		
		JSONObject Object = new JSONObject();
		
		//Admin Object
		JSONObject ad1=new JSONObject();
		ad1.put("email","varsha62@gmail.com");
		ad1.put("id", 16 );
		ad1.put("name","varsha");
		ad1.put( "password","varsha@123");
		
		
		// insert the admin values
		Object.put("admin", ad1);
		
		
		//inside array product values
		JSONObject pv1=new JSONObject();
		pv1.put( "cost", 650);				      

		pv1.put ("description","tester");

		pv1.put("name","Fkk");

		pv1.put("type","Veg");
		
		
		//product Array
		JSONArray pA=new JSONArray();
		pA.add(pv1);
		
		//product key
		Object.put("product", pA);
		
		   	
		request = RestAssured.given();
				request.body(Object);
				request.contentType("application/json");
	}
	  

	@When("user wants to save the data by using URI {string}")
	public void user_wants_to_save_the_data_by_using_uri(String string) {
		res=request.post(string);
		
	}

	@Then("verify the statusLine as {string}")
	public void verify_the_status_line_as(String string) {
		val = res.then();
		 val.statusLine(string);
		
		
	}

	@Then("Verify the status code as {int}")
	public void verify_the_status_code_as(Integer int1) {
		
		val.assertThat().statusCode(int1);
		val.log().all();
	}
}
