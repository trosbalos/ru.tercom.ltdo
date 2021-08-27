import com.tercom.ltdo.AddNewDepartment;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddNewDepartmentTest extends BaseTest {


    void openCreateNewDepartmentWindow() {
        super.loginDO();
        new AddNewDepartment(driver)
                .dashboardCreateNewDepartmentButton();
    }

    @Feature("Department NameField String Validate")
    @Test
    void departmentNameFieldStringValidate() {
        openCreateNewDepartmentWindow();
        new AddNewDepartment(driver)
                .departmentFieldNameField(RANDOM_DEPARTMENT)
                .copyDepartmentNameFromField();
        Assertions.assertAll(
                () -> assertTrue(RANDOM_DEPARTMENT.equals(getBufferedString())));
    }

    @Feature("New departent create")
    @Test
    void newDepartmentCreate() {
        openCreateNewDepartmentWindow();
        new AddNewDepartment(driver)
                .departmentFieldNameField(RANDOM_DEPARTMENT)
                .descriptionField(RANDOM_DEPARTMENT_DESCRIPTION)
                .createButtonClick()
                .createButtonClick();

//        Assertions.assertAll(
//                () -> assertTrue(RANDOM_DEPARTMENT.equals(getBufferedString())));
//    }
    }
}
