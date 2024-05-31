package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"src\\test\\resources\\applicationtest\\LoginWithData.feature"},//only change for feature file name

		glue = {"stepdefinitions"},

		plugin = {"pretty"}


		)



public class LoginWithDataRunner extends AbstractTestNGCucumberTests
{

}
 

	


