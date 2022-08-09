package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.testBase;

public class ProductDetailPage extends testBase{

	private Select dropdownQtn = new Select (driver.findElement(By.xpath("//*[@id=\"quantity\"]")));
	
	@FindBy(id = "add-to-cart-button")
	WebElement AddToCartButton;
	
	public ProductDetailPage(){
		PageFactory.initElements(driver,this);
	}
	
	public void selectProductQuantity(String quantity) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//dropdownQtn.selectByIndex((Integer.parseInt(quantity)));
		//dropdownQtn.selectByVisibleText(quantity);
		dropdownQtn.selectByValue(quantity);
	}
	
	public void addToCartButton() {
		AddToCartButton.click();
	}
}
