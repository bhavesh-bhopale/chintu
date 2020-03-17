package AutoItDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimplepgAutoit{
	@Test
	public void testautoit() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Desktop\\Selenium WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hi/Desktop/fileupload.html");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("input")).getText());
		driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\hi\\eclipse-workspace\\EagerCrowFm\\src\\Sample.txt");
	    Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\hi\\Desktop\\AutoIt\\Fileupload.exe");
	}
}
