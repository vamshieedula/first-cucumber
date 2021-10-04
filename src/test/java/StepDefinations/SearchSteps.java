package StepDefinations;

import org.junit.Assert;

import Implementations.Product;
import Implementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;
	
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	   System.out.println("Step1: Iam on the search page");
	}

	@When("I search for a product with the name {string} and price {int}")
	public void i_search_for_a_product_with_the_name_and_price(String productName, Integer price) {
		System.out.println("Step2: Search the productName:"+productName+" price: "+price);

		product = new Product(productName, price);
		
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step3: product"+productName+" is displayed");
		
		search = new Search();
		String name = search.displayProduct(product);
		System.out.println("search product is: "+ name);
		
		Assert.assertEquals(product.getProductName(), name);
	}
	
}
