package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class LoginPages extends BasePageObject {

    public void inputUsername(String username) {
        By element = By.id("input_email");
        typeOn(element, username);
    }

    public void inputPassword(String password) {
        By element = By.id("input_password");
        typeOn(element, password);
    }

    public void clickButtonLogin() {
        By element = By.id("submit_login");
        clickOn(element);
    }
    public boolean isSuccessLogin() {
        By element = By.id("content-tab");
        return isPresent(element);
    }


    public void seePassword() {
        By element = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/*[1]");
        clickOn(element);

    }

    public void loginFacebook() {
        By element = By.id("login_facebook");
        clickOn(element);
    }

    public boolean navigateTofacebook() {
        By element = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[1]/span/div");
        return isPresent(element);
    }


    public void loginGoogle() {
        By element = By.id("login_google");
        clickOn(element);
    }

    public boolean navigateToGoogle() {
        By element = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1");
        return isPresent(element);
    }


    public void btnRegister() {
        By element = By.id("btn_to-register");
        clickOn(element);
    }

    public boolean isSuccessDaftarPage(){
        By element = By.xpath("//b[contains(text(),'Daftar Akun Populix')]");
        return isPresent(element);
    }

    public void forgotPassword() {
        By element = By.id("btn_to-forgot-password");
        clickOn(element);
    }

    public boolean isSuccessForgotPassword(){
        By element = By.xpath("//b[contains(text(),'Lupa kata sandi? Tetap tenang')]");
        return isPresent(element);
    }

}
