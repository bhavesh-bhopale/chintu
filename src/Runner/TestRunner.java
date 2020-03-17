package Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Keywords.KeyWord;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"../C:\\Users\\hi\\eclipse-workspace\\EagerCrowFm\\src\\Features"},glue= {"../C:\\Users\\hi\\eclipse-workspace\\EagerCrowFm\\src\\StepsDefination"})
public class TestRunner {

}
	


//@CucumberOptions(feature),glue..
//format={"pretty","html:target/foldername"}



