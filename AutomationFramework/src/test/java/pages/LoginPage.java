package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Base {


	public void user_launch_site_url() {
		 
	}

	public void user_enter_username_and_pasword() {
		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys(prop.getProperty("usrname"));
		WebElement pwd = driver.findElement(By.xpath(" //input[@id=\"password\"]"));
		pwd.sendKeys(prop.getProperty("pwd"));
	}

	public void user_click_on_login_button() {
		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();

	}

	public void validate_user_logged_in_succesfully() {
		System.out.println("Validation");
	}

}
