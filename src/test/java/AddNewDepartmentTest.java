import com.tercom.ltdo.AddNewDepartment;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

public class AddNewDepartmentTest extends BaseTest {


    void openCreateNewDepartmentWindow() {
        super.loginDO();
        new AddNewDepartment(driver)
                .dashboardCreateNewDepartmentButton();
    }

    @Feature("Create new department")
    @Test
    void openCreateNewDepartmentTest() {
        openCreateNewDepartmentWindow();
        new AddNewDepartment(driver)
                .newDepartmentNameField(RANDOM_DEPARTMENT)
                .newDepartmentDescriptionField(RANDOM_DEPARTMENT)
                .newDepartmentDirectorDropDown()
                .newDepartmentDropDownDirectorSelect()
                .newDepartmentCreateButtonClick();


    }
}
