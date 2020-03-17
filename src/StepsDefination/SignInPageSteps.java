package StepsDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Keywords.KeyWord;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInPageSteps {
	public static WebDriver driver;
	@Given("^Chrome browser is opened$")
	public void OpenChromeBrowser() {
		KeyWord.openBrowser("chrome");
		System.out.println("Opening chrome Browser");
	}
	@And("^Open the <url>$")
	public void OpenUrl(){
		KeyWord.OpenURL("https://eagercrow.com/Home");
		System.out.println("open the url");
	}
	@When("^User enters wrong uname and password$")
	public void enterusernameANDpassword() {
		KeyWord.enterText("XPATH", "(//input[@name='email'])[1]","bhaveshbhopale21bb@gmail.com");
		KeyWord.enterText("XPATH", "//input[@name='password']","9890045076");
		//SignInPageSteps signin=PageFactory.initElements(driver, SignInPageSteps.class);
		//signin.enterusernameANDpassword();
		System.out.println("uname and password is entered susccessfully");
	}
	@Then("^Then  User will get an error message$")
	public void Showerrormessage() {
		System.out.println("then show the error message");
	}
	
	

}
