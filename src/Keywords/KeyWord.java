package Keywords;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/**
 * This method is useful to open Browser
 * 
 * @param browserName
 */

public class KeyWord {
	public static void openBrowser(String browserName) {
	
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Desktop\\Selenium WebDriver\\chromedriver.exe");
			Constants.driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hi\\Desktop\\Selenium WebDriver\\geckodriver.exe");
			Constants.driver = new FirefoxDriver();
			break;
		case "HTMLUnit":
			break;
		default:
			System.out.println("invalid browser name:" + browserName);

		}
	}
	/**
	 * This method load new web page in current open browser
	 *
	 */

	public static void OpenURL(String url) {
		System.out.println(url + " is loading");
		Constants.driver.get(url);
	
	}
	/**
	 * This method is used to find the web element on web page
	 * 
	 * @param locatorType
	 * @param locatorValue
	 * @return element
	 */

	public static WebElement getWebElement(String locatorType, String locatorValue) {
	    WebElement element = null;
		switch (locatorType) {
		case "XPATH":
			element = Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element = Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element = Constants.driver.findElement(By.id(locatorValue));
			break;
		case "LINKTEXT":
			element = Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element = Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "CLASS_NAME":
			element = Constants.driver.findElement(By.className(locatorValue));
			break;
		default:
			System.err.println("Invalade locator type: " + locatorType
					+ ".Expected:CSS,XPATH,ID,LINKTEXT,PARTIAL_LINK_TEXT,CLASS_NAME");
			break;
		}
		return element;
	}

	public static void clickOnElement(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
		}
	
	public static void enterText(String locatorType, String locatorValue,String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}
	
	public static void getScreenShot() {
		AShot ashot=new AShot();

		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Constants.driver);
		try {
			ImageIO.write(sc.getImage(), "PNG", new File("Screenshot/Chintu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}
	public static void FileReader() {
	try {
		FileInputStream file=new FileInputStream("C:\\Users\\hi\\eclipse-workspace\\EagerCrowFm\\kkkkk.xlsx");
		Workbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=(XSSFSheet) book.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println("Total no of rows:"+rows);
	}catch(IOException e) {
		System.out.println("File not found");
		e.printStackTrace();

	}
	}

	public static void ProductmouseHoverOn(WebElement element) {
		Actions action=new Actions(Constants.driver);
		action.moveToElement(element).build().perform();

	}


	public static void maximizeBrowser() {
		Constants.driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		Constants.driver.close();
	}

	public static void closeAllBrowser() {
		Constants.driver.quit();

}

}




