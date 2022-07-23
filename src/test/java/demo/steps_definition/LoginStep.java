package demo.steps_definition;

import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;


public class LoginStep {

    LoginPages loginPage = new LoginPages();

    @And("user input {string} and {string}")
    public void inputUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @And("user click show hidden password")
    public void clickShowHiddenPassword(){
        loginPage.seePassword();
    }

    @And("user click login button")
    public void clickButtonLogin(){
        loginPage.clickButtonLogin();
    }

    @Then("user success login")
    public void isSuccessLogin()  {
        try {
            Assert.assertTrue(loginPage.isSuccessLogin());
            System.out.println("Success Login");
        } catch (NoSuchElementException e) {
            System.out.println("Failed Login");
        }
    }

    @And("user click facebook button")
    public void clickFacebookLogin() {
        loginPage.loginFacebook();
    }

    @Then("user navigate to facebook")
    public void navigateToFacebook() {
        try {
            Assert.assertTrue(loginPage.navigateTofacebook());
            System.out.println("Success Landing Facebook");
        } catch (NoSuchElementException e) {
            System.out.println("Failed Landing Facebook");
        }
    }

    @And("user click google button")
    public void clickGoogleLogin() {
        loginPage.loginGoogle();
    }

    @Then("user navigate to google")
    public void navigateToGoogle() {
        try {
            Assert.assertTrue(loginPage.navigateToGoogle());
            System.out.println("Success Landing Google");
        } catch (NoSuchElementException e) {
            System.out.println("Failed Landing Google");
        }
    }

    @And("user click register button")
    public void clickRegister() {
        loginPage.btnRegister();
    }

    @Then("user navigate to register page")
    public void navigateToRegisterPage() {
        try {
            Assert.assertTrue(loginPage.isSuccessDaftarPage());
            System.out.println("Success Landing Register Page");
        } catch (NoSuchElementException e) {
            System.out.println("Failed Landing Register Page");
        }
    }

    @And("user click forgot password")
    public void clickForgotPassword() {
        loginPage.forgotPassword();
    }

    @Then("user navigate to forgot password")
    public void navigateToForgotPage() {
        try {
            Assert.assertTrue(loginPage.isSuccessForgotPassword());
            System.out.println("Success Landing Forgot Page");
        } catch (NoSuchElementException e) {
            System.out.println("Failed Landing Forgot Page");
        }
    }

}
