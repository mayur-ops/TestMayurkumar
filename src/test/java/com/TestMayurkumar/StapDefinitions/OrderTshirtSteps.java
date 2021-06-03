package com.TestMayurkumar.StapDefinitions;

import com.TestMayurkumar.PageObject.OrderTshirts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderTshirtSteps {

    OrderTshirts orderTshirts = new OrderTshirts();

    @Given("user is on home page of the automationpractice website")
    public void user_is_on_home_page_of_the_automationpractice_website() {
    orderTshirts.currentUrl();
    }

    @When("user click on the T-Shirt button")
    public void user_click_on_the_t_shirt_button() {
    orderTshirts.orderTshirts();
    }

    @When("user should able to select the T-Shirt product")
    public void user_should_able_to_select_the_t_shirt_product() {
    orderTshirts.tShirtProduct();
    }
    @When("user add selected product into the cart")
    public void user_add_selected_product_into_the_cart() {
    orderTshirts.serAddToCart();
    }

    @Then("user should able to see product in cart")
    public void user_should_able_to_see_product_in_cart() {
    orderTshirts.cartBox();
    }

}
