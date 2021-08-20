package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewOffice extends BasePage{
    public AddNewOffice(WebDriver driver) { super(driver);}



    @FindBy(xpath = "//*[text()=\"Добавить офис\"]")
    private WebElement dashboardCreateNewOfficeButton;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement inputCityField;
    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement inputAddressField;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputOfficeNameField;
    @FindBy(xpath = "//*[@class=\"mat-button-wrapper\" and text()=\"Добавить офис\"]")
    private WebElement addOfficeAcceptButton;
    @FindBy(xpath = "//*[@class=\"mat-button-wrapper\" and text()=\"Отмена\"]")
    private WebElement cancelOfficeCreateButton;

    @Step(value = "Input City")
    public AddNewOffice inputCity(String city) {
        inputCityField.sendKeys(city);
        return this;
    }
    @Step(value = "Input address")
    public AddNewOffice inputAddress(String address) {
        inputAddressField.sendKeys(address);
        return this;
    }
    @Step(value = "input office name")
    public AddNewOffice inputOfficeName(String officeName) {
     inputOfficeNameField.sendKeys(officeName);
        return this;
    }
    @Step(value = "Dashboard new office button click")
    public AddNewOffice dashboardCreateNewOfficeButton() {
        dashboardCreateNewOfficeButton.click();
        return this;
    }
    @Step(value = "Click create new office button")
    public AddNewOffice addOfficeAcceptButton() {
        addOfficeAcceptButton.click();
        return this;
    }
    @Step(value = "Cancel office create button")
    public AddNewOffice cancelOfficeCreateButton() {
        cancelOfficeCreateButton.click();
        return this;
    }



}
