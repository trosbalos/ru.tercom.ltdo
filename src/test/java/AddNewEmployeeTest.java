import com.tercom.ltdo.AddNewEmployee;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;

public class AddNewEmployeeTest extends BaseTest{
    void openCreateNewEmployeeWindow(){
        super.loginDO();

        new AddNewEmployee(driver)
                .dashboardButtonClick();

    }

    @Feature("Create new employee")
    @Test
    void openCreateNewEmployeeWindowTest() {

        openCreateNewEmployeeWindow();

        new AddNewEmployee(driver)
                .firstName(RANDOM_ARTIST_NAME)
                .lastName(RANDOM_ARTIST_NAME)
                .middleName(RANDOM_ARTIST_NAME)
                .positionDropDownClick()
                .positionClick()
                .rootCheckBoxClick()
                .officeDropDownClick()
                .officeSelectClick()
                .roleDropDownClick()
                .roleDropDownPanelClick()

                .emailField(RANDOM_USER_EMAIL)
                .cancelButton() ;




    }
}
