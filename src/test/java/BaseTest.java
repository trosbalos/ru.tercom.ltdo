import com.tercom.ltdo.AuthLogin;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends Configuration {
    public WebDriver driver;

    void implicitlyWait(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    void loginDO(){
        AuthLogin authLogin = new AuthLogin(driver);
        authLogin.loginDO();
    }
    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();



}
    @BeforeEach
    void beforeTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new ChromeDriver(options);
        implicitlyWait(5);
        driver.get(BASE_URL);

    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}