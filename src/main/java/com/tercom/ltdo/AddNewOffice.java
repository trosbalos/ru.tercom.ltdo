package com.tercom.ltdo;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewOffice extends BasePage{
    public AddNewOffice(WebDriver driver) { super(driver);}



    @FindBy(xpath = "//*[text()=\"Добавить офис\"]")
    private WebElement dashboardCreateNewOfficeButton;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement inputCityField;
    @Getter
    @FindBy(xpath = "//label[@for=\"city\"]/mat-label")
    private WebElement cityLabel;
    @Getter
    @FindBy(xpath = "//*[@for=\"city\"]/span[text()=\" *\"]")
    private WebElement inputCityStar;
    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement inputAddressField;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputOfficeNameField;
    @FindBy(xpath = "//*[@class=\"mat-button-wrapper\" and text()=\"Добавить офис\"]")
    private WebElement addOfficeAcceptButton;
    @FindBy(xpath = "//*[@class=\"mat-button-wrapper\" and text()=\"Отмена\"]")
    private WebElement cancelOfficeCreateButton;
    @Getter
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator mat-flat-button mat-button-base mat-primary mat-button-disabled\"]")
    private WebElement addOfficeButtonNotActive;
    @Getter
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator mat-flat-button mat-button-base mat-primary\"]")
    private WebElement addOfficeButtonActive;
    @Getter
    @FindBy(xpath = "//*[@role=\"alert\"]/simple-snack-bar/span[text()=\"'City' must not be empty.\"]")
    private WebElement cityMustNotBeEmptyAlert;
    @Getter
    @FindBy(xpath = "//*[@role=\"alert\"]/simple-snack-bar/span[text()=\"'Address' must not be empty.\"]")
    private WebElement addressMustNotBeEmptyAlert;
    @Getter
    @FindBy(xpath = "//*[@role=\"alert\"]/simple-snack-bar/span[text()=\"''City' must not be empty.\n" +
            "'Address' must not be empty.\"]")
    private WebElement cityAndAddressMustNotBeEmptyAlert;

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
    public AddNewOffice clickAddOfficeButton() {
        addOfficeAcceptButton.click();
        return this;
    }
    @Step(value = "Cancel office create button")
    public AddNewOffice cancelOfficeCreateButton() {
        cancelOfficeCreateButton.click();
        return this;
    }

    @Step(value = "addOfficeButtonNotActive")
    public AddNewOffice addOfficeButtonNotActive() {
        addOfficeButtonNotActive.isDisplayed();
        return this;
    }


    @Step (value = "Copy input city field")
    public void copyInputCityField() {
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        addNewOffice.inputCityField.sendKeys(Keys.CONTROL, "a");
        addNewOffice.inputCityField.sendKeys(Keys.CONTROL, "c");
    }
    @Step (value = "Copy input address field")
    public void copyInputAddressField()  {
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        addNewOffice.inputAddressField.sendKeys(Keys.CONTROL, "a");
        addNewOffice.inputAddressField.sendKeys(Keys.CONTROL, "c");
    }
    @Step (value = "Copy input office name field")
    public void copyInputOfficeNameField() {       AddNewOffice addNewOffice = new AddNewOffice(driver);
        addNewOffice.inputOfficeNameField.sendKeys(Keys.CONTROL, "a");
        addNewOffice.inputOfficeNameField.sendKeys(Keys.CONTROL, "c");
    }



}
