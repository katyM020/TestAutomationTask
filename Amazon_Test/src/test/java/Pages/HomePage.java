package Pages;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import junit.framework.Assert;

public class HomePage extends testBase {
//	
//	@FindBy(xpath="//*[contains(text(),'Hello, ')]")
//	WebElement label_user;
//	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBar;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
//	public boolean verifyUserLabel(){
//		return label_user.isDisplayed();				
//	}
	
	public void clickOnSearchBar(){
		searchBar.click();
	}
	
	public void enterProduct(String item) {
		searchBar.clear();
		searchBar.sendKeys(item);
	}
	
	public void hitEnter() {
		searchBar.sendKeys(Keys.ENTER);
	}
}
