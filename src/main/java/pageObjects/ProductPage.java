package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public ProductPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "search_site")
    public WebElement searchResultHeading;

    public void assertLineProduct (String subMenuOption)
    {
        Assert.assertEquals(searchResultHeading.getText().trim(), subMenuOption);
    }

@FindBy(xpath = "/html/body/div[3]/main/div/div[1]/div[3]/div/div[4]/div[2]/div/a")
    public WebElement AddToCart;

}
