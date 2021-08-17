package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AuthLogin extends BasePage {
    public AuthLogin(WebDriver driver) {
        super(driver);
    }





    @Step(value = "login Digital Office")
    public AuthLogin loginDO() {
        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .inputPasssword(USER_PASSWORD)
                .clickSingInButton();
        return this;
    }
//    void ctrlCPassword(){
//        driver.findElement(By.xpath ("//*[@name=\"password\"]")).getAttribute();
//    }

    @FindBy(xpath = "//*[@name=\"email\"]")
    private WebElement inputEmailLogin;
    @FindBy(xpath = "//*[@name=\"password\"]")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[@id=\"btn-enter\"]")
    private WebElement singInButton;
    @FindBy(css = ".form__error > small")
    private WebElement wrongLoginOrPassword;
    public WebElement wrongLoginOrPasswordDisplayed() {
        return wrongLoginOrPassword;
    }
//    @FindBy(xpath = "//*[@class=\"form ng-dirty ng-touched ng-valid\"]")
//    private WebElement singInButtonActive;
//    public WebElement singInButtonActive() {
//        return singInButtonActive;
//    }
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
    @Step(value = "input Passsword")
    public AuthLogin inputPasssword(String passsword) {
        inputPassword.sendKeys(passsword);
        return this;
    }
    @Step(value = "click loginButton")
    public AuthLogin clickSingInButton() {
            singInButton.click();
        return this;
    }



}
