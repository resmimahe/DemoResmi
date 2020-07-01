package AmznStepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Amazone.LandinAmznPage;
import Amazone.Login2AmznPage;
import Amazone.LoginAmznPage;
import Utility.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class ValidUserLoginTest extends base {
	
	public WebDriver driver;
	
	
	@Given("User Launches the Amazone Application")
	public void user_Launches_the_Amazone_Application() throws IOException {
		
		driver=IntialSetup();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@Then("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		LandinAmznPage lp = new LandinAmznPage(driver);
		lp.getSignIn();
	}

	
    @When("^User enter (.+) and (.+)$")
    public void user_enter_and(String username, String password) throws Throwable {
    	LoginAmznPage lo=new LoginAmznPage(driver);
		lo.getEmailId().sendKeys(username);
		lo.getContinueBttn().click();
		Login2AmznPage lo1=new Login2AmznPage(driver);
		lo1.getPassword().sendKeys(password);
		lo1.getLoginButton().click();
    }

	@When("User reaches the Amazone Home Page")
	public void user_reaches_the_Amazone_Home_Page() {
		
		LandinAmznPage lp = new LandinAmznPage(driver);
		Assert.assertEquals(lp.getLoginDetails(), "Hello, Resmi");
	    
	}

}
