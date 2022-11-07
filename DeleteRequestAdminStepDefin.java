package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteRequestAdminStepDefin {
	Response res;
	 ValidatableResponse validate;
	 
	@When("user wants to delete the requset by using URI {string}")
	public void user_wants_to_delete_the_requset_by_using_uri(String string) {
	RequestSpecification req = RestAssured.given().contentType("application/json");
	    		  res= req.delete(string);
	}

	@Then("verify the status line as {string}")
	public void verify_the_status_line_as(String string) {
		  validate = res.then().statusLine(string);
	}

	@Then("verify the status code as {int}")
	public void verify_the_status_code_as(Integer int1) {
		validate.assertThat().statusCode(int1)
		.log().all();
	}
}
