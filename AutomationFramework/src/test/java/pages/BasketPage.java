package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {
	public void user_add_product_into_the_basket_from_plp_page() {
		WebElement addTocartbtn = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack"));
		addTocartbtn.click();

	}
	public void validateBasketCount() {
WebElement basketcount=driver.findElement(By.cssSelector("a.shopping_cart_link"));
String actualCount=basketcount.getText();
assertEquals("1", actualCount);

	}
	public void clickonCheckoutbtn() {
		WebElement basketIcon = driver.findElement(By.cssSelector("a.shopping_cart_link"));
		basketIcon.click();
		WebElement checkoutBTN = driver.findElement(By.cssSelector("button#checkout"));
		checkoutBTN.click();
}
}