package StepDefinitions;

import Base.testBase;
import Pages.ProductListPage;
import io.cucumber.java.en.When;

public class ProductListPageSteps extends testBase{

	private ProductListPage plp;
	
	@When("^select the product (.*)$")
	public void select_the_product(int index) {
		plp = new ProductListPage();
		plp.selectProduct(index);		
	}
}
