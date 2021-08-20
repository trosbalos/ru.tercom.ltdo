package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewDepartment extends BasePage{
    public AddNewDepartment(WebDriver driver) { super(driver);}


    @FindBy(xpath = "//*[text()=\"Создать департамент\"]")
    private WebElement dashboardCreateNewDepartmentButton;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement newDepartmentNameField;
    @FindBy(xpath = "//*[@id=\"description\"]")
    private WebElement newDepartmentDescriptionField;
    @FindBy(xpath = "//*[@id=\"director\"]")
    private WebElement newDepartmentDirectorDropDown;
    @FindBy(xpath = "//*[@id=\"director-panel\"]/child::mat-option")
    private WebElement newDepartmentDropDownDirectorSelect;
    @FindBy(xpath = "//*[@class=\"mat-button-wrapper\" and text()=\"Добавить департамент\"]/parent::button")
    private WebElement newDepartmentCreateButton;

    @Step(value = "Dashboard create department click")
    public AddNewDepartment dashboardCreateNewDepartmentButton() {
        dashboardCreateNewDepartmentButton.click();
        return this;
    }
    @Step(value = "Department name field")
    public AddNewDepartment newDepartmentNameField(String name) {
        newDepartmentNameField.sendKeys(name);
        return this;
    }
    @Step(value = "Department description")
    public AddNewDepartment newDepartmentDescriptionField(String description) {
        newDepartmentDescriptionField.sendKeys(description);
        return this;
    }
    @Step(value = "Department drop down")
    public AddNewDepartment newDepartmentDirectorDropDown( ) {
        newDepartmentDirectorDropDown.click();
        return this;
    }
    @Step(value = "Department drop down director select")
    public AddNewDepartment newDepartmentDropDownDirectorSelect() {
        newDepartmentDropDownDirectorSelect.click();
        return this;
    }
    @Step(value = "Department create button click")
    public AddNewDepartment newDepartmentCreateButtonClick() {
        newDepartmentCreateButton.click();
        return this;
    }

}
