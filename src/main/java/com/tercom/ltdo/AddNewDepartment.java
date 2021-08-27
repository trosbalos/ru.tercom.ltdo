package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewDepartment extends BasePage{
    public AddNewDepartment(WebDriver driver) { super(driver);}


    @FindBy(xpath = "//*[text()=\"Создать департамент\"]")
    private WebElement dashboardCreateNewDepartmentButton;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement departmentNameField;
    @FindBy(xpath = "//*[@id=\"description\"]")
    private WebElement descriptionField;
    @FindBy(xpath = "//*[@id=\"director\"]")
    private WebElement directorDropDown;
    @FindBy(xpath = "//*[@id=\"director-panel\"]/child::mat-option")
    private WebElement dropDownDirectorSelect;
    @FindBy(xpath = "//*[@class=\"mat-button-wrapper\" and text()=\"Добавить департамент\"]/parent::button")
    private WebElement createButton;

    @Step(value = "Dashboard create department click")
    public AddNewDepartment dashboardCreateNewDepartmentButton() {
        dashboardCreateNewDepartmentButton.click();
        return this;
    }
    @Step(value = "Department name field")
    public AddNewDepartment departmentFieldNameField(String name) {
        departmentNameField.sendKeys(name);
        return this;
    }
    @Step(value = "Department description")
    public AddNewDepartment descriptionField(String description) {
        descriptionField.sendKeys(description);
        return this;
    }
    @Step(value = "Department drop down")
    public AddNewDepartment directorDropDown( ) {
        directorDropDown.click();
        return this;
    }
    @Step(value = "Department drop down director select")
    public AddNewDepartment dropDownDirectorSelect() {
        dropDownDirectorSelect.click();
        return this;
    }
    @Step(value = "Department create button click")
    public AddNewDepartment createButtonClick() {
        createButton.click();
        return this;
    }
    @Step
    public void copyDepartmentNameFromField() {
        AddNewDepartment addNewDepartment = new AddNewDepartment(driver);
        addNewDepartment.departmentNameField.sendKeys(Keys.CONTROL, "a");
        addNewDepartment.departmentNameField.sendKeys(Keys.CONTROL, "c");
    }
    @Step
    public void copyDescriptionFromField()
        {AddNewDepartment addNewDepartment = new AddNewDepartment(driver);
        addNewDepartment.descriptionField.sendKeys(Keys.CONTROL, "a");
        addNewDepartment.descriptionField.sendKeys(Keys.CONTROL, "c");
    }


}
