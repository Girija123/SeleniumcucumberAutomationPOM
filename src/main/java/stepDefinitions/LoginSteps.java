package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

public class LoginSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Given("I'm on HomePage {string}")
    public void i_m_on_home_page(String url) throws Exception {
        driver.get(readPropertyFile("url"));
        takeScreenshot("/homepage.png");
    }

    @When("I click My account link")
    public void i_click_my_account_link() {
        homePage.clickMyAccountLink();
    }
    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) throws Exception {
        myAccountPage.enterUsername(username);
        myAccountPage.enterPassword(password);
    }
    @When("I click Sign in button")
    public void i_click_sign_in_button() {
        myAccountPage.clickSignInBtn();
    }
    @Then("I shouldn't be allowed login instead an error message as {string}")
    public void i_shouldn_t_be_allowed_login_instead_an_error_message_as(String loginErrorMsg) {
        myAccountPage.verifyInvalidLogin(loginErrorMsg);
    }

}
