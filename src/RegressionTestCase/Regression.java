package RegressionTestCase;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Keywords.KeyWord;

public class Regression {
	Logger logger;
	
	@Test
	public void tc_01() throws InterruptedException{
		Logger logger=LogManager.getLogger(Regression.class);
		logger.debug("opening browser");
		KeyWord.openBrowser("chrome");
		KeyWord.OpenURL("https://eagercrow.com/Home");
		logger.info("opening url");
		KeyWord.FileReader();
		logger.info("Read the xlfile");
		KeyWord.getScreenShot();
		logger.info("Take a screenshot");
		System.out.println("dfgg");
	
//		KeyWord.maximizeBrowser();
//		Thread.sleep(5000);
//		KeyWord.clickOnElement("XPATH","(//a[@class='color0-hov'])[1]");
//		KeyWord.clickOnElement("XPATH","(//a[@class='color0-hov'])[2]");
//		KeyWord.clickOnElement("XPATH","(//a[@class='color0-hov'])[3]");
//		KeyWord.clickOnElement("LINKTEXT","Sign In");
//		System.out.println("click on home page element departments,productlist,contactus then signin");
//		
//		Thread.sleep(3000);
//		KeyWord.clickOnElement("XPATH","(//span[@class='firebaseui-idp-text firebaseui-idp-text-long'])[1]");
//		System.out.println("Click on signin with email");
//		KeyWord.enterText("XPATH", "(//input[@name='email'])[1]","bhaveshbhopale21bb@gmail.com");  //Enter the email
//		
//		KeyWord.clickOnElement("XPATH","//button[@class='firebaseui-id-submit firebaseui-button mdl-button mdl-js-button mdl-button--raised mdl-button--colored']");
//		System.out.println("click on next button");
//		Thread.sleep(3000);
//		
//		KeyWord.enterText("XPATH","//input[@name='password']","9890045076"); //Enter the password
//		
//		
//		KeyWord.clickOnElement("XPATH", "//button[@type='submit']");
//		System.out.println("After enter the email and pass then click");
//		Thread.sleep(3000);
//		KeyWord.getScreenShot();
//		KeyWord.closeBrowser();
//		KeyWord.closeAllBrowser();
//		
	}

}


