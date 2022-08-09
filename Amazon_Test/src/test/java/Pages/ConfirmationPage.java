package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import junit.framework.Assert;

public class ConfirmationPage extends testBase{
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/span")
	WebElement confirmationText;
	
	public ConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void confirmationMessage() {
		String confirmationTxt = confirmationText.getText();
		Assert.assertEquals("Added to Cart", confirmationTxt);
	}
}
