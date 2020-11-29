package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.HomePage;

public class searchSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);




    @Given("^I'm on HomePage '([^']*)'$")
    public void i_m_on_HomePage(String url) {

        driver.get(url);


    }

    @When("^I enter search data$")
    public void i_enter_search_data() {
        homePage.searchWindow.sendKeys( "Jeans");



    }

    @When("^I press enter button$")
    public void i_press_enter_button() {
        driver.findElement(By.id("search_site")).sendKeys(Keys.ENTER);

    }

    @Then("^I should see appropriate results$")
    public void i_should_see_appropriate_results() {

    }



    @When("^I enter numbers$")
    public void i_enter_numbers() {

        homePage.searchWindow.sendKeys("12");



    }

    @When("^I press enter$")
    public void i_press_enter() {
        driver.findElement(By.id("search_site")).sendKeys(Keys.ENTER);

    }

    @Then("^I should see appropriate result$")
    public void i_should_see_appropriate_result() {

    }

    @When("^I enter parameters$")
    public void i_enter_parameters() {
        homePage.searchWindow.sendKeys("yellow");

    }
}
