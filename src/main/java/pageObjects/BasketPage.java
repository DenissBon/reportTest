package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public BasketPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@id='checkout_wrap']/div/div/div/section/div/form/div/div/div[1]/div[2]/div[1]/button[2]")
    public WebElement addOneMoreProduct;


    @FindBy(xpath = "//*[@id='checkout_wrap']/div/div/div/section/div/form/div/div/div[1]/div[2]/div[1]/input")
    public WebElement numberOfItems;


    @FindBy(xpath = "//*[@id='cross_pop-up']")
    public WebElement crossPopUp;




}
