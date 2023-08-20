package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class  CheckoutPage extends Base {
public void user_enter_information(String fname, String lname, String pcode) {
	
	WebElement firstname=driver.findElement(By.cssSelector("input#first-name"));
	firstname.sendKeys(fname);
	WebElement lastname=driver.findElement(By.cssSelector("[data-test=\"lastName\"]"));
	lastname.sendKeys(lname);
	WebElement postalcode=driver.findElement(By.cssSelector("input#postal-code"));
	postalcode.sendKeys(pcode);
	
}
}
 