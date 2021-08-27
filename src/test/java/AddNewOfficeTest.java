import com.tercom.ltdo.AddNewOffice;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddNewOfficeTest extends BaseTest {


    void openCreateNewOfficeWindow() {
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
                .clickAddOfficeButton();
    }

    @Feature("(B10) Digits in city field")
    @Test
    void digitsInCityFieldTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(RANDOM_NUMBERS)
                .copyInputCityField();
        getBufferedString();
        Assertions.assertAll(
                () -> assertTrue(RANDOM_NUMBERS.equals(getBufferedString()))
        );
    }

    @Feature("(B11) Symbols in city field")
    @Test
    void symbolsInCityFieldTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(SYMBOLS)
                .copyInputCityField();
        getBufferedString();
        Assertions.assertAll(
                () -> assertTrue(SYMBOLS.equals(getBufferedString()))
        );
    }

    @Feature("(B12)Spaces in city field")
    @Test
    void spacesInCityFieldTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(SPACES)
                .copyInputCityField();
        getBufferedString();
        Assertions.assertAll(
                () -> assertTrue(SPACES.equals(getBufferedString()))
        );
    }

    @Feature("(B13)RU in city field")
    @Test
    void ruInCityFieldTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(RUSSIAN_LANG)
                .copyInputCityField();
        getBufferedString();
        Assertions.assertAll(
                () -> assertTrue(RUSSIAN_LANG.equals(getBufferedString()))
        );
    }

    @Feature("(B14)Add office button not active")
    @Test
    void addOfficeButtonNotActive() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddOfficeButtonNotActive().isDisplayed());

    }

    @Feature("(B15)Add office * in city filed")
    @Test
    void addOfficeStarInCityField() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getInputCityStar().isDisplayed());

    }

    @Feature("(B151)City must not be empty")
    @Test
    void addOfficeCityMustNotBeEmpty() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RANDOM_ADDRESS)
                .inputCity(SPACES)
                .clickAddOfficeButton();

        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getCityMustNotBeEmptyAlert().isDisplayed());
    }

    @Feature("(B152)Address must not be empty")
    @Test
    void addOfficeAddressMustNotBeEmpty() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(RANDOM_CITY)
                .inputAddress(SPACES)
                .clickAddOfficeButton();

        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddressMustNotBeEmptyAlert().isDisplayed());
    }

    @Feature("(B153)City and address must not be empty")
    @Test
    void addOfficeCityAndAddressMustNotBeEmpty() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(SPACES)
                .inputAddress(SPACES)
                .clickAddOfficeButton();

        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getCityAndAddressMustNotBeEmptyAlert().isDisplayed());
    }

    @Feature("(B17)Label city displayed")
    @Test
    void addOfficeCityLabelDisplayed() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getCityLabel().getText().equals("Город"));
    }

    @Feature("(B17)Label city displayed")
    @Test
    void addOfficeCityPlaceholderDisplayed() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getCityLabel().getText().equals("Город"));
    }
}
