package WebUI;

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

    @Feature("(C1)First name field accepts digits input")
    @Test
    void firstNameFieldAcceptsDigitsInput() {
        openNewEmployeeWindow();
        new AddNewEmployee(driver)
                .firstName(RANDOM_DIGITS)
                .copyFirstNameFromField();
        Assertions.assertAll(
                () -> Assertions.assertTrue(RANDOM_DIGITS.equals(getBufferedString()))
        );
    }

    @Feature("(C2)First name field accepts symbols input")
    @Test
    void firstNameFieldAcceptsSymbolsInput() {
        openNewEmployeeWindow();
        new AddNewEmployee(driver)
                .firstName(SYMBOLS)
                .copyFirstNameFromField();
        Assertions.assertAll(
                () -> Assertions.assertTrue(SYMBOLS.equals(getBufferedString()))
        );
    }
    @Feature("(C3)First name field accepts spaces input")
    @Test
    void firstNameFieldAcceptsSpacesInput() {
        openNewEmployeeWindow();
        new AddNewEmployee(driver)
                .firstName(SYMBOLS)
                .copyFirstNameFromField();
        Assertions.assertAll(
                () -> Assertions.assertTrue(SYMBOLS.equals(getBufferedString()))
        );
    }
   // Сейчас просто поле принимает на ввод 100
   // Нужен способ проверки без поиска сотрудника в UI
    @Feature("(C5)First name field accepts <=100")
    @Test
    void firstNameFieldAccepts100Input() {
        openNewEmployeeWindow();
        new AddNewEmployee(driver)
                .firstName(RANDOM_LONG_STRING.substring(1,101))
                .copyFirstNameFromField();

        Assertions.assertAll(
                () -> Assertions.assertTrue(RANDOM_LONG_STRING.substring(1,101).equals(getBufferedString()))
        );
    }
    @Feature("(C6)First name field required to fill ")
    @Test
    void firstNameFieldWarning() {
        openNewEmployeeWindow();
        new AddNewEmployee(driver)
                .lastName(RANDOM_ARTIST_NAME);
        AddNewEmployee addNewEmployee = new AddNewEmployee(driver);
        Assertions.assertAll(
                () -> assertTrue(addNewEmployee.getFirstNameFieldWarning().isDisplayed())
        );
    }
    @Feature("(C7)First name field have a star * ")
    @Test
    void firstNameHaveStar() {
        openNewEmployeeWindow();
        AddNewEmployee addNewEmployee = new AddNewEmployee(driver);
        Assertions.assertAll(
                () -> assertTrue(addNewEmployee.getFirstNameFieldStar().isDisplayed())
        );
    }

}
