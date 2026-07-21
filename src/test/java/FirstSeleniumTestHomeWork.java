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

     driver.get("https://www.zalando.de");

    driver.get("https://www.netflix.com");

   driver.navigate().back();

   driver.navigate().forward();

     driver.navigate().refresh();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}