package AmznStepDefinition;



import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
public class LoginTest {

	@Given("^User is on the Landing Page$")
	public void user_is_on_the_Landing_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("1");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("2");
	}

	@Then("^User reaches the Home Page$")
	public void user_reaches_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("3");
	}

	@Then("^User click on logout button$")
	public void user_click_on_logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("4");
	}


    
}