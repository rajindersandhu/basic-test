package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	
	@Given("^I navigated to my website$")
	public void navigate() throws Throwable
	{
		System.out.println("This step one");
	}

	@When("^I click on the link$")
	public void selection() throws Throwable
	{
		System.out.println("This step two");
	}
	
	@Then("^I check the status$")
	public void checkStatus() throws Throwable
	{
		System.out.println("This step three");
	}
}
