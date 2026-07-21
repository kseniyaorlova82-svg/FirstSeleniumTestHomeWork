import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTestHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void firstSeleniumTestHomework() {

        // Открываем Zalando
        driver.get("https://www.zalando.de");

        // Открываем Netflix
        driver.get("https://www.netflix.com");

        // Возвращаемся назад на Zalando
        driver.navigate().back();

        // Переходим вперед на Netflix
        driver.navigate().forward();

        // Обновляем страницу Netflix
        driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}