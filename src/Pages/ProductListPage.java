package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Keywords.KeyWord;


public class ProductListPage {
	@FindBy(xpath="(//a[@class='color0-hov'])[2]")
	private  WebElement ProductListMenu;
		public ProductListPage moveToProductListMenu() {
			//ProductListMenu=KeyWord.driver.findElement(By.xpath("(//a[@class='color0-hov'])[2]"));
			KeyWord.ProductmouseHoverOn(ProductListMenu);
			return new ProductListPage();
		}
		public String getTextOfProductListMenu() {
			return ProductListMenu.getText();
		

	}
}


