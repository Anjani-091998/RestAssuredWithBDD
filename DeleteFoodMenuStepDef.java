package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteFoodMenuStepDef {
   Response res;
   ValidatableResponse validate;
	@When("User wants to delete  data by using URI as {string}")
public void user_wants_to_delete_data_by_using_uri_as(String string) {
		RequestSpecification req = RestAssured.given().contentType("application/json");
		  res= req.delete(string);
}

@Then("Verfiy the Status line {string}")
public void verfiy_the_status_line(String string) {
	 validate = res.then().statusLine(string);
}

@Then("verfiy the status code as {int}")
public void verfiy_the_status_code_as(Integer int1) {
	validate.assertThat().statusCode(int1)
	.log().all();
}
		
	}
	
