package WebUI;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
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
                .inputCity(RANDOM_DIGITS)
                .copyInputCityField();
        getBufferedString();
        Assertions.assertAll(
                () -> Assertions.assertTrue(RANDOM_DIGITS.equals(getBufferedString()))
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
                () -> Assertions.assertTrue(SYMBOLS.equals(getBufferedString()))
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
                () -> Assertions.assertTrue(SPACES.equals(getBufferedString()))
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
                () -> Assertions.assertTrue(RUSSIAN_LANG.equals(getBufferedString()))
        );
    }

    @Feature("(B14)City field required to fill ")
    @Test
    void addOfficeCityRequiredToFill() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RANDOM_ADDRESS);
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
    @Disabled
    @Test
    void addOfficeCityAndAddressMustNotBeEmpty() throws InterruptedException {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(SPACES)
                .inputAddress(SPACES)
                .clickAddOfficeButton();
        Thread.sleep(10000);

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


    @Feature("(B22)Address field accepts digits")
    @Test
    void firstNameFieldAcceptsDigitsInput() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RANDOM_DIGITS)
                .inputCity(RANDOM_CITY)
                .copyInputAddressField();
        Assertions.assertTrue(RANDOM_DIGITS.equals(getBufferedString()));
    }

    @Feature("(B23)Address field accepts symbols")
    @Test
    void firstNameFieldAcceptsSymbolsInput() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(SYMBOLS)
                .inputCity(RANDOM_CITY)
                .copyInputAddressField();


        Assertions.assertTrue(SYMBOLS.equals(getBufferedString()));
    }

    @Feature("(B24)Address field accepts spaces")
    @Test
    void firstNameFieldAcceptsSpacesInput() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(SPACES)
                .inputCity(RANDOM_CITY)
                .copyInputAddressField();


        Assertions.assertTrue(SPACES.equals(getBufferedString()));
    }

    @Feature("(B25)RU in address field")
    @Test
    void ruInAddressFieldTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RUSSIAN_LANG)
                .inputCity(RUSSIAN_LANG)
                .copyInputAddressField();

        Assertions.assertAll(
                () -> Assertions.assertTrue(RUSSIAN_LANG.equals(getBufferedString()))
        );
    }
    @Feature("(B26)Address field required to fill ")
    @Test
    void addOfficeAddressRequiredToFill() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputCity(RANDOM_CITY);
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddOfficeButtonNotActive().isDisplayed());

    }
    @Feature("(B27)Add office * in address filed")
    @Test
    void addOfficeStarInAddressField() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getInputAddressFieldStar().isDisplayed());
    }
    @Feature("(B29)Label address displayed")
    @Test
    void addOfficeAddressLabelDisplayed() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddressLabel().getText().equals("Адрес"));
    }
    //
    @Feature("(B34)Office name field accepts digits")
    @Test
    void officeNameFieldAcceptsDigitsInput() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputOfficeName(RANDOM_DIGITS)
                .inputCity(RANDOM_CITY)
                .copyInputOfficeNameField();
        Assertions.assertTrue(RANDOM_DIGITS.equals(getBufferedString()));
    }

    @Feature("(B35)Office name field accepts symbols")
    @Test
    void officeNameFieldAcceptsSymbolsInput() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputOfficeName(SYMBOLS)
                .inputCity(RANDOM_CITY)
                .copyInputOfficeNameField();

        Assertions.assertTrue(SYMBOLS.equals(getBufferedString()));
    }

    @Feature("(B36)Office name field accepts spaces")
    @Test
    void officeNameFieldAcceptsSpacesInput() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputOfficeName(SPACES)
                .inputCity(RANDOM_CITY)
                .copyInputOfficeNameField();


        Assertions.assertTrue(SPACES.equals(getBufferedString()));
    }

    @Feature("(B37)RU in office name field")
    @Test
    void ruInOfficeNameFieldTest() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputOfficeName(RUSSIAN_LANG)
                .inputCity(RANDOM_CITY)
                .copyInputOfficeNameField();

        Assertions.assertAll(
                () -> Assertions.assertTrue(RUSSIAN_LANG.equals(getBufferedString()))
        );
    }
    @Feature("(B38)Office name field not required to fill ")
    @Test
    void officeNameRequiredToFill() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RANDOM_ADDRESS)
                .inputCity(RANDOM_CITY);

        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddOfficeButtonActive().isDisplayed());

    }

    @Feature("(B46)Button not active, till all field required not filled")
    @Test
    void buttonNotActiveBeforeRequiredNotFilled() {
        openCreateNewOfficeWindow();
        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddOfficeButtonNotActive().isDisplayed());

    }
    @Feature("(B47)Button active, after all field required filled")
    @Test
    void buttonActiveAfterRequiredFilled() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RANDOM_ADDRESS)
                .inputCity(RANDOM_CITY);

        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getAddOfficeButtonActive().isDisplayed());

    }
    @Feature("(B48)New office added successfully alert")
    @Test
    void newOfficeAddedSuccessAlert() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .inputAddress(RANDOM_ADDRESS)
                .inputCity(RANDOM_CITY)
                .inputOfficeName(RANDOM_CITY)
                .clickAddOfficeButton();

        AddNewOffice addNewOffice = new AddNewOffice(driver);
        Assertions.assertTrue(addNewOffice.getNewOfficeAddedSuccessAlert().isDisplayed());
    }
    @Feature("(B50)Cancel button close form")
    @Test
    void cancelButtonCloseForm() {
        openCreateNewOfficeWindow();
        new AddNewOffice(driver)
                .cancelOfficeCreateButton();

        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.employeeImage().isDisplayed());
    }
    @Feature("(B51)ESC button close form")
    @Test
    void escButtonCloseForm() {
        openCreateNewOfficeWindow();
      new AddNewOffice(driver)
              .escButtonPress();
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.employeeImage().isDisplayed());
    }
}
