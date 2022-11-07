package stepDefination;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class PostAdminStepDef {
	RequestSpecification request;
Response res;
ValidatableResponse val;

	@Given("user wants to provide the data in admin")
	public void user_wants_to_provide_the_data_in_admin() {
//		baseURI = "http://localhost:8080";
		JSONObject Object = new JSONObject();
		
		Object.put("email","varsha62@gmail.com");
		Object.put("name","varsha");
		Object.put("password","varsha@123");
		
		
		request = RestAssured.given();
				request.contentType("application/json");
				request.body(Object);
	}
 
	@When("user wants to create the data by using URI as {string}")
	public void user_wants_to_create_the_data_by_using_uri_as(String s1) {
		res=request.post(s1);
	}

	@Then("verify the Status code is {int}")
	public void verify_the_status_code_is(Integer int1) {
		val = res.then();
		val.assertThat().statusCode(int1);
		val.log().all();
	}
}
