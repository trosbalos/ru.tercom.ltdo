package com.tercom.ltdo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;


public class DepartmentList extends BasePage {
    public DepartmentList(WebDriver driver) {
        super(driver);

    }

    public boolean getAllDepartments(String department) {

        ArrayList<String> addNewDepartment = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            int pls4 = 1;
            String FirstDepartmentName = "//*/table/tr/td[" + pls4 + "]";
            addNewDepartment.add(driver.findElement(By.xpath(FirstDepartmentName)).getText());
            System.out.println(addNewDepartment.get(i));
            if (addNewDepartment.get(i).equals(department)) {
                return true;
            }
            pls4 = pls4 + 4;
        }
        return false;
    }

    @FindBy(xpath = "//*[text()=\"Список департаментов\"]")
    private WebElement dashboardCreateDepartmentButton;
    @FindBy(xpath = "//*/mat-form-field")
    private WebElement itemPerPageArrow;
    @FindBy(xpath = "//*[text()=\" 50 \"]")
    private WebElement item50;


    @Step(value = "Dashboard department list")
    public DepartmentList departmentListClick() {
        dashboardCreateDepartmentButton.click();
        return this;
    }

    @Step(value = "Item per page click")
    public DepartmentList itemPerPageArrowClick() {
        itemPerPageArrow.click();
        return this;
    }

    @Step(value = "Item 50 click")
    public DepartmentList item50Click() {
        item50.click();
        return this;
    }

}
