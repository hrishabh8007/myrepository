package stepDefination;

import io.cucumber.java.en.Given;
import pages.CheckoutPage;


public class CheckoutPageSteps {
	CheckoutPage checkout=new CheckoutPage();
	
	@Given("user enter information {string}{string}{string}")
	public void user_enter(String fname, String lname, String pcode) {
		checkout.user_enter_information(fname, lname, pcode);
	}

}
