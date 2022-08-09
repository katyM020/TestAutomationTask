package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class LoginPage extends testBase{
	
	public HomePage homePage =new HomePage();

	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")
	WebElement signInlink;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[13]/div[2]/a")
	WebElement signInButton;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@id='nav-logo']/a[@class='nav-logo-link']")
	WebElement img_logo;
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	public boolean validateLogo(){
		return img_logo.isDisplayed();
	}
	
	public String selectsigninlink(){
		signInlink.click();
		return driver.getTitle();
	}
	
	public void enterUserName(String eml){
		email.sendKeys(eml);
		continueButton.click();
	}
	
	public void enterPassword(String pw){
		password.sendKeys(pw);
		loginButton.click();
	}
	
	public HomePage verifyHomePage(){
		
		return homePage;
	}
	
	
}
