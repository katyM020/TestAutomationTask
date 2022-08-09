package StepDefinitions;

import Base.testBase;
import Pages.ConfirmationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class ConfirmationPageSteps extends testBase {
	
	ConfirmationPage confmPage;

	@Then("confirmation message will be displayed")
	public void confirmation_message_will_be_displayed() {
		confmPage = new ConfirmationPage();
		confmPage.confirmationMessage();
	}

	@After
	public void close_the_browser() {
        driver.close();
        driver.quit();
	}

}
