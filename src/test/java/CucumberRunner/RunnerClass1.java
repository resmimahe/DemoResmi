package CucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "C:\\Users\\Resmi Mahesan\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\features\\AmznLogin.feature",
		glue= "AmznStepDefinition"
		
		)

public class RunnerClass1{
	

}
