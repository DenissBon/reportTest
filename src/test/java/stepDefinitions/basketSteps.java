package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import pageObjects.BasketPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;

public class basketSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    BasketPage basketPage = new BasketPage(driver);


    @Given("^I'm on a homepage '([^']*)'$")
    public void i_m_on_a_homepage(String url) {

        driver.get(url);

    }

    @When("^I hover over menu option$")
    public void i_hover_over_menu_option() {

        homePage.mouseOverMenu();
    }

    @When("^I click on submenu option$")
    public void i_click_on_submenu_option() {
        homePage.clickSubMenu();

    }

    @When("^I choose product$")
    public void i_choose_product() {
        productPage.assertLineProduct("Jeans");

    }

    @When("^click add to basket$")
    public void click_add_to_basket() {
        productPage.AddToCart.click();

    }

    @Then("^I should see product in the basket$")
    public void i_should_see_product_in_the_basket() {


    }

    @When("^I see product in the basket$")
    public void i_see_product_in_the_basket() {


    }

    @When("^I click remove$")
    public void i_click_remove() {
        basketPage.crossPopUp.click();

    }

    @Then("^I should see that product has been canceled$")
    public void i_should_see_that_product_has_been_canceled() {



    }

    @When("^I edit the amount$")
    public void i_edit_the_amount() {
        basketPage.addOneMoreProduct.click();

    }

    @Then("^I should see its being edited$")
    public void i_should_see_its_being_edited() {


    }
}