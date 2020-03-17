package RegressionTestCase;

import org.testng.annotations.Test;

import Pages.ProductListPage;

public class ProductListTest {
	@Test
	public void tc_01() {
		ProductListPage productList=new ProductListPage();
		productList.moveToProductListMenu();
		System.out.println("buuiu");
		
	}

}
