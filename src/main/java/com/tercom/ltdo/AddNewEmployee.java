package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewEmployee extends BasePage{
    public AddNewEmployee(WebDriver driver) { super(driver);}

    @FindBy(xpath = "//*[text()=\"Добавить сотрудника\"]")
    private WebElement dashboardCreateNewEmployeeButton;
    @FindBy(tagName = "html")
    private WebElement html;
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;
    @FindBy(xpath = "//*[@id=\"middleName\"]")
    private WebElement middleNameField;
    @FindBy(xpath = "//*[@id=\"positionId\"]")
    private WebElement positionDropDown;
    @FindBy(xpath = "//*[@id=\"positionId-panel\"]/child::mat-option")
    private WebElement positionSelect;
    @FindBy(xpath = "//*[@id=\"office\"]")
    private WebElement officeDropDown;
    @FindBy(xpath = "//*[@id=\"office-panel\"]/child::mat-option")
    private WebElement officeSelect;
    @FindBy(xpath = "//*[@id=\"roleId\"]")
    private WebElement roleDropDown;
    @FindBy(xpath = "//*[@id=\"roleId-panel\"]")
    private WebElement roleDropDownPanel;
    @FindBy(xpath = "//*[@id=\"roleId-panel\"]/child::mat-option")
    private WebElement roleSelect;
    @FindBy(xpath = "//*[@class=\"mat-checkbox-inner-container\"]")
    private WebElement rootCheckBox;
    @FindBy(xpath = "//*[id=\"email\"]")
    private WebElement emailField;
    @FindBy(xpath = "//*[text()=\" Отмена \"]")
    private WebElement cancelButton;
    @FindBy(xpath = "//*[text()=\" Сохранить \"]")
    private WebElement saveButton;


        @Step(value = "Dashboard create new employee")
        public AddNewEmployee dashboardButtonClick() {
        dashboardCreateNewEmployeeButton.click();
        return this;
    }
    @Step(value = "tab")
        public AddNewEmployee tab() {
        html.sendKeys(Keys.TAB);
        return this;
    }
        @Step(value = "Add new employee first name")
        public AddNewEmployee firstName(String name) {
        firstNameField.sendKeys(name);
        return this;
    }
        @Step(value = "Add new employee last name")
        public AddNewEmployee lastName(String name) {
            lastNameField.sendKeys(name);
        return this;
    }
        @Step(value = "Add new employee middle name")
        public AddNewEmployee middleName(String name) {
            middleNameField.sendKeys(name);
        return this;
    }
        @Step(value = "Add new employee position dropdown")
        public AddNewEmployee positionDropDownClick() {
        positionDropDown.click();
        return this;
    }
       @Step(value = "Add new employee position")
        public AddNewEmployee positionClick() {
           positionSelect.click();
        return this;
    }
        @Step(value = "Add new employee office dropdown")
        public AddNewEmployee officeDropDownClick() {
            officeDropDown.click();
        return this;
    }      @Step(value = "Add new employee office dropdown select")
        public AddNewEmployee officeSelectClick() {
        officeSelect.click();
        return this;
    }
         @Step(value = "Add new employee role dromdown")
        public AddNewEmployee roleDropDownClick() {
             roleDropDown.click();
        return this;
    }
        @Step(value = "Add new employee role dromdown panel")
        public AddNewEmployee roleDropDownPanelClick() {
            roleDropDownPanel.click();
        return this;
    }
         @Step(value = "Add new employee role dropdown select")
        public AddNewEmployee roleSelectClick() {
             roleSelect.click();
        return this;
    }
         @Step(value = "Add new employee root check box click")
        public AddNewEmployee rootCheckBoxClick() {
             rootCheckBox.click();
        return this;
    }
         @Step(value = "Add new employee email field input")
        public AddNewEmployee emailField(String email) {
             emailField.sendKeys(email);
        return this;
    }
         @Step(value = "Add new employee cancel button click")
        public AddNewEmployee cancelButton() {
             cancelButton.click();
        return this;
    }
         @Step(value = "Add new employee save button click")
        public AddNewEmployee saveButton() {
             saveButton.click();
        return this;
    }

}
