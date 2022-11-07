package stepDefination;


import static io.restassured.RestAssured.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetAdmin {
	
	Response res;
	
	 ValidatableResponse validate;
	 
	@When("user wants to fetch the data by using URI as {string}")
	
	public void user_wants_to_fetch_the_data_by_using_uri_as(String string) {
		
      RequestSpecification req = RestAssured.given().contentType("application/json");
    		  
    		 res= req.get(string);
	}

	@Then("verify the status line {string}")
	
	public void verify_the_status_line(String string) {
		
	    validate = res.then().statusLine(string);
	}

	@And("Verify the status code {int}")
	
	public void verify_the_status_code(Integer int1) {
		
		validate.assertThat().statusCode(int1)
		
		.log().all();
	}
	}
