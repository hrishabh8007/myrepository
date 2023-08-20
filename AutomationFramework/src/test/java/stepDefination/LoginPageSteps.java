package stepDefination;

import helper.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageSteps extends Base {

	LoginPage login = new LoginPage();

	@Given("user launch site url")
	public void user_launch_site_url() {
		setup();
		login.user_launch_site_url();
	}

	@Given("user enter username and pasword")
	public void user_enter_username_and_pasword() {
		login.user_enter_username_and_pasword();
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		login.user_click_on_login_button();
	}

	@Then("validate user logged in succesfully")
	public void validate_user_logged_in_succesfully() {
		login.validate_user_logged_in_succesfully();
	}

}
