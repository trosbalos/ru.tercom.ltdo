import com.tercom.ltdo.AddNewDepartment;
import com.tercom.ltdo.DepartmentList;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DepartmentListTest extends BaseTest {
    void openCreateNewDepartmentWindow() {
        super.loginDO();
        new AddNewDepartment(driver)
                .dashboardCreateNewDepartmentButton();
    }

    void openCreateNewDepartmentListWindow() {
        super.loginDO();
        new DepartmentList(driver)
                .departmentListClick();
    }

    @Feature("test array")
    @Test
    void departmentArrayRecorderTest() {
//        openCreateNewDepartmentWindow();
        String departmentForThatTest = RANDOM_DEPARTMENT;
//        System.out.println(departmentForThatTest);
//        new AddNewDepartment(driver)
//                .departmentFieldNameField(departmentForThatTest)
//                .descriptionField(RANDOM_DEPARTMENT_DESCRIPTION)
//                .createButtonClick();
//        driver.quit();
//        beforeTest();
        openCreateNewDepartmentListWindow();
        new DepartmentList(driver)
                .departmentListClick()
                .itemPerPageArrowClick()
                .item50Click();
        DepartmentList departmentList = new DepartmentList(driver);
        Assertions.assertTrue(departmentList.getAllDepartments(departmentForThatTest));
    }


}
