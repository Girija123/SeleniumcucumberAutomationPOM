package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="")
    public WebElement searchTxtField;

    @FindBy(xpath="")
    public WebElement searchIcon;

    @FindBy(xpath="")
    public WebElement myAccountLink;

    @FindBy(xpath="")
    public WebElement helpLink;

    @FindBy(xpath="")
    public WebElement storeLocatorLink;

    @FindBy(xpath="")
    public WebElement basketIcon;

    @FindBy(xpath="")
    public WebElement newsletterTxtField;

    public void enterSearchTerm(String searchTerm)
    {
        searchTxtField.sendKeys(searchTerm);
    }

    public void clickSearchIcon()
    {
        searchIcon.click();
    }

    public void clickMyAccountLink()
    {
        myAccountLink.click();
    }

    public void clickHelpLink()
    {
        helpLink.click();
    }



}
