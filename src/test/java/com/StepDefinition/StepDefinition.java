package com.StepDefinition;
import com.BaseClass.BaseTest;
import com.Pom_HomePage.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseTest{
	
	Home_Page hp = new Home_Page();
	
	@Given("User enter url {string}")
	public void user_enter_url(String string) {
		launchUrl(string);
	}
	@When("User click on men button")
	public void user_click_on_men_button() {
		hp.getClickButton().click();
	}
	@When("User click on shop men")
	public void user_click_on_shop_men() throws InterruptedException {
		Thread.sleep(3000);
	   moveToElement(hp.getShopmen());
	   Thread.sleep(2000);
	
	}

	@When("User click on Formal shirt")
	public void user_click_on_formal_shirt() throws InterruptedException {
		Thread.sleep(3000);
		clickButton(hp.getFormalShirt());
	}

	@When("User click on FirstShirt")
	public void user_click_on_First_shirt() throws InterruptedException {
		Thread.sleep(3000);
		clickButton(hp.getFirstShirt());
	}

	@When("USer click on size38")
	public void u_ser_click_on_size38() throws InterruptedException {
		Thread.sleep(2000);
		clickButton(hp.getSize38());
	}

	@When("User added to add to cart")
	public void user_added_to_add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		clickButton(hp.getaddToCart());
	}

}
