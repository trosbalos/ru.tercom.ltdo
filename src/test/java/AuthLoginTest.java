import com.tercom.ltdo.AuthLogin;
import com.tercom.ltdo.HomePage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AuthLoginTest extends BaseTest {


    @Feature("Sing In button not active")
    void setSingInButtonNotActive() {
        AuthLogin authLogin = new AuthLogin(driver);
        WebElement singInButtonNotActive = authLogin.singInButtonNotActive();
        Assertions.assertAll(
                () -> assertTrue(singInButtonNotActive.isDisplayed()));


    }

    @Feature("Avatar on main page")
    void employeeImageAssert() {

        implicitlyWait(10);
        HomePage homePage = new HomePage(driver);
        WebElement employeeImage = homePage.employeeImageDisplayed();
        Assertions.assertAll(
                () -> assertTrue(employeeImage.isDisplayed())
        );

    }

    @Feature("Wrong login or password message")
    void wrongLoginPasswordMessage() {
        implicitlyWait(10);
        AuthLogin authLogin = new AuthLogin(driver);
        WebElement wrongLoginOrPasswordDisplayed = authLogin.wrongLoginOrPasswordDisplayed();
        Assertions.assertAll(
                () -> assertTrue(wrongLoginOrPasswordDisplayed.isDisplayed()));

    }


    @Feature("(ID A4,A8) Russian language in Login/Password fields")
    @Test
    void russianLangInLoginPasswordTest() {

        new AuthLogin(driver)
                .inputLogin(RUSSIAN_LANG)
                .inputPassword(RUSSIAN_LANG)
                .clickSingInButton();

        wrongLoginPasswordMessage();
    }

    @Feature("(ID A1,A5) Numbers in Login/Password fields")
    @Test
    void numbersInLoginPasswordFieldsTest() {

        new AuthLogin(driver)
                .inputLogin(RANDOM_NUMBERS)
                .inputPassword(RANDOM_NUMBERS)
                .clickSingInButton();

        wrongLoginPasswordMessage();

    }

    @Feature("(ID A2,A6) Symbols in Login/Password fields")
    @Test
    void symbolsInLoginPasswordFieldsTest() {

        new AuthLogin(driver)
                .inputLogin(SYMBOLS)
                .inputPassword(SYMBOLS)
                .clickSingInButton();

        wrongLoginPasswordMessage();
    }


    @Feature("(ID A9, A23)Login by valid login and valid password.")
    // описание, тут описана суть теста, т.е. мы просто входи на сайт, такая банальная проверки
    @Test
    void LoginByValidLoginPasswordTest() throws InterruptedException {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();
        employeeImageAssert();
    }

    @Feature("(ID A10) Login by valid email and valid password.")
    @Test
    void loginByEmailTest() {

        new AuthLogin(driver)
                .inputLogin(USER_MAIL)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        employeeImageAssert();
    }

    @Feature("(ID A11) Login by valid login upper case.")
    @Test
    void loginByLoginUpperCaseTest() {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN.toUpperCase())
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        employeeImageAssert();
    }

    @Feature("(ID A12)Login by  valid email upper case.")
    @Test
    void loginByEmailUpperCaseTest() {

        new AuthLogin(driver)
                .inputLogin(USER_MAIL.toUpperCase())
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        employeeImageAssert();
    }

    @Feature("(ID A3,A7,A13) Login by valid email and space after email.")
    @Test
    void loginByEmailSpaceAfterMailTest() {

        new AuthLogin(driver)
                .inputLogin(USER_MAIL + SPACES)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        employeeImageAssert();
    }

    @Feature("(ID A3,A7,A14) Login by valid login and space after login")
    @Test
    void loginByLoginSpaceAfterLoginTest() {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN + SPACES)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        employeeImageAssert();
    }

    @Feature("(ID A15)\"Enter\" button not active with empty autorization fields")
    @Test
    void emptyAuthFieldsTest() {

        setSingInButtonNotActive();

    }

    @Feature("(ID A16)Login by valid login and empty password")
    @Test
    void loginByLoginWrongPasswordTest() {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .clickSingInButton();

        setSingInButtonNotActive();
    }

    @Feature("(ID A17)Login by valid password and empty login")
    @Test
    void loginByWrongLoginValidPasswordTest() {

        new AuthLogin(driver)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        setSingInButtonNotActive();
    }

    @Feature("(ID A19) Login by valid password and wrong email")
    @Test
    void loginByWrongEmailValidPasswordTest() {

        new AuthLogin(driver)
                .inputLogin(RANDOM_USER_EMAIL)
                .inputPassword(USER_PASSWORD)
                .clickSingInButton();

        wrongLoginPasswordMessage();
    }

    @Feature("(ID A18) Login by valid login and wrong password")
    @Test
    void loginByValidLoginWrongPasswordTest() {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .inputPassword(RANDOM_ARTIST_NAME)
                .clickSingInButton();

        wrongLoginPasswordMessage();
    }

    @Feature("(ID A20) Login by valid login and valid password with spaces.")
    @Test
    void loginByValidLoginPasswordWithSpacesTest() {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .inputPassword(USER_PASSWORD + SPACES)
                .clickSingInButton();

        wrongLoginPasswordMessage();
    }

    @Feature("(ID A21)Login by valid login and valid password(upper case).")
    @Test
    void loginByValidLoginPasswordUpperCaseTest() {

        new AuthLogin(driver)
                .inputLogin(USER_LOGIN)
                .inputPassword(USER_PASSWORD.toUpperCase())
                .clickSingInButton();

        wrongLoginPasswordMessage();
    }

    @Feature("(ID A22)Try to copy password field")
    @Test
    void tryToCopyPasswordField() {
        new AuthLogin(driver)
                .inputPassword(RANDOM_ARTIST_NAME)
                .copyPasswordField();
        System.out.println(RANDOM_ARTIST_NAME);
        Assertions.assertAll(
                () -> assertNotEquals(RANDOM_ARTIST_NAME, (getBufferedString()))
        );

    }

    @Feature("(ID A27) Login field accepts numbers input")
    @Test
    void loginFieldAcceptNumbersInput() {
        new AuthLogin(driver)
                .inputLogin(RANDOM_NUMBERS)
                .copyLoginOrEmailField();
        Assertions.assertAll(
                () -> assertTrue(RANDOM_NUMBERS.equals(getBufferedString()))
        );

    }
}