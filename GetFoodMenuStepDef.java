package stepDefination;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetFoodMenuStepDef {
	Response res;
	ValidatableResponse validate;
	@When("user wants to find the data by using URI as {string}")
	public void user_wants_to_find_the_data_by_using_uri_as(String string) {
		  RequestSpecification req = RestAssured.given().contentType("application/json");
		  
 		 res= req.get(string);
	}

	@Then("Verify the status line as {string}")
	public void verify_the_status_line_as(String string) {

	    validate = res.then().statusLine(string);
	}

	@Then("Verify the Status Code is {int}")
	public void verify_the_status_code_is(Integer int1) {
	 
validate.assertThat().statusCode(int1)
		
		.log().all();
	}
	
	}

