package StepDefinitions;

import Pages.ProductDetailPage;
import io.cucumber.java.en.When;

public class ProductDetailPageSteps {
	
	ProductDetailPage pdp;
	
	@When("^choose product quantity which is (.*)$")
	public void choose_product_quantity_which_is(String quantity) {
		pdp = new ProductDetailPage();
		pdp.selectProductQuantity(quantity);
	}

	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
		pdp.addToCartButton();
	}

}
