package pageObjects;

import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="")
    public WebElement usernameTxtFld;

    @FindBy(name="")
    public WebElement passwordTxtFld;

    @FindBy(xpath="")
    public WebElement signInBtn;

    @FindBy(xpath="")
    public WebElement resisterNowButton;

    @FindBy(xpath="")
    public WebElement resetPasswordLink;

    @FindBy(xpath="")
    public WebElement invalidLoginMsg;

    public void enterUsername(String username) throws Exception
    {
        usernameTxtFld.sendKeys(CommonFunctions.readPropertyFile("username"));
    }

    public void enterPassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickSignInBtn()
    {
        signInBtn.click();
    }

    public void clickRegisterNowBtn()
    {
        resisterNowButton.click();
    }

    public void verifyInvalidLogin(String expectedInvalidLoginMsg)
    {
        String actualInvalidLoginMsg = invalidLoginMsg.getText();
        Assert.assertEquals(expectedInvalidLoginMsg, actualInvalidLoginMsg);
    }
}
