package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class ProductListPage extends testBase{

	@FindBy(xpath = "/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[3]")
	WebElement searchResult;
	
	public ProductListPage() {
		PageFactory.initElements(driver,this);
	}

	public boolean verifyProductListPage(){
		return searchResult.isDisplayed();				
	}
	
	public void selectProduct(int productIndex) {
		String xpath = "//img[@data-image-index='"+productIndex+"']";
		testBase.driver.findElement(By.xpath(xpath)).click();

	}
}
