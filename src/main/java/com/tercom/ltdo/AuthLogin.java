package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthLogin extends BasePage {
    public AuthLogin(WebDriver driver) {
        super(driver);
    }

    public AuthLogin loginDO(){
        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();
        return this;
    }


    @FindBy(xpath = "//*[@name=\"email\"]")
    private WebElement inputEmailLogin;
    @FindBy(xpath = "//*[@name=\"password\"]")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[@id=\"btn-enter\"]")
    private WebElement singInButton;
    @FindBy(css = ".form__error > small")
    private WebElement wrongLoginOrPassword;



    @FindBy(xpath = "//*[@disabled=\"\"]")
    private WebElement singInButtonNotActive;
    public WebElement singInButtonNotActive() {
        return singInButtonNotActive;
    }
    @Step(value = "input EmailLogin")
    public AuthLogin inputLogin(String login) {
        inputEmailLogin.sendKeys(login);
        return this;
    }
    @Step(value = "input Password")
    public AuthLogin inputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }
    @Step(value = "click loginButton")
    public AuthLogin clickSingInButton() {
            singInButton.click();
        return this;
    }
    @Step(value = "Copy from LoginOrEmail field")
    public void copyLoginOrEmailField() {
        AuthLogin authLogin = new AuthLogin(driver);
        authLogin.inputEmailLogin.sendKeys(Keys.CONTROL, "a");
        authLogin.inputEmailLogin.sendKeys(Keys.CONTROL, "c");
    }
    @Step(value = "Copy from inputPassword field")
    public void copyPasswordField() {
        AuthLogin authLogin = new AuthLogin(driver);
        authLogin.inputPassword.sendKeys(Keys.CONTROL, "a");
        authLogin.inputPassword.sendKeys(Keys.CONTROL, "c");
    }

    public WebElement wrongLoginOrPasswordDisplayed() {
        return wrongLoginOrPassword;
    }

}
