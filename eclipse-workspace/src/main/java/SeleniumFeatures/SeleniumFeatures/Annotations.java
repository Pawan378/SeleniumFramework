package SeleniumFeatures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixedMethodOrder;
import org.junit.Test;

public class Annotations {
	
	Webdriver driver;
	
	
	@Given("^Customer has API for foreign exchange rates$")
	public void customer_has_API_for_foreign_exchange_rates() throws Throwable {
		
		Response response;
		
		response.baseURI("https://https://api.ratesapi.io/api/latest");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^posted with correct information$")
	public void posted_with_correct_information() throws Throwable {
		
		response.get("/api/latest")
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^validate response code received$")
	public void validate_response_code_received() throws Throwable {
		
		int statusCode = response.getStatuscode();
		Assert.assertEquals(statusCode,200,"Incorrect status code returned");
	    // Write code here that turns the phrase above into concrete actions
		String contentType = response.getContentType();
		Assert.assertTrue(contentType,"application/json");
	}

	

}
