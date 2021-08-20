import com.tercom.ltdo.AddNewOffice;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

public class AddNewOfficeTest extends BaseTest{


    void openCreateNewOfficeWindow(){
        super.loginDO();
        new AddNewOffice(driver)
                .dashboardCreateNewOfficeButton();
    }
    @Feature("Create new office")
    @Test
    void openCreateNewOfficeWindowTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(RANDOM_CITY)
                .inputAddress(RANDOM_ADDRESS)
                .inputOfficeName(RANDOM_CITY)
                .addOfficeAcceptButton();

    }
}
