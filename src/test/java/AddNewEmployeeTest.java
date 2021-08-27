import com.tercom.ltdo.AddNewEmployee;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddNewEmployeeTest extends BaseTest {
    void openNewEmployeeWindow() {
        super.loginDO();

        new AddNewEmployee(driver)
                .dashboardButtonClick();

    }

    @Feature("firstNameFieldStringValidate")
    @Test
    void firstNameFieldStringValidate() {

        openNewEmployeeWindow();

        new AddNewEmployee(driver)
                .firstName(RANDOM_ARTIST_NAME)
                .copyFirstNameFromField();

        Assertions.assertAll(
                () -> assertTrue(RANDOM_ARTIST_NAME.equals(getBufferedString()))
        );

    }
}
