package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@alt=\"Employee image\"]")
    // а вот как он ее находит
    // эта штука локатор

    private WebElement employeeImage;
    @Step(value = "Employee image Displayed")
    public WebElement employeeImageDisplayed() {
        return employeeImage;
    }



}
