package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.testBase;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps extends testBase{

	private HomePage hp;
//	private LoginPage lp;
	private String projectPath = System.getProperty("user.dir") ;

	@Before 
	public void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
        driver.manage().window().maximize();
        
	}
	@Given("user is on home page")
	public void user_is_on_home_page() {
		
		driver.navigate().to("https://www.amazon.com/");

	}

	@When("clicks on the search bar")
	public void clicks_on_the_search_bar() {
		hp = new HomePage();
		hp.clickOnSearchBar();
	}

	@When("^user enters (.*)$")
	public void user_enters_smart_watch(String item) {
		hp.enterProduct(item);
	}

	@When("hits enter")
	public void hits_enter() {
		hp.hitEnter();
	}

	
}
