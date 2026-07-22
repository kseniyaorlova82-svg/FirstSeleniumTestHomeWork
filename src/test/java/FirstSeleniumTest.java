import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    //before -> setUp
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");//without history
//driver.navigate().to("https://www.google.com");//with history
//driver.navigate().back();//one page back
//driver.navigate().forward();//one page forward
//driver.navigate().refresh();//refresh=reload page
    }
    //test "Register new user"
@Test

    public void firstTest(){
    System.out.println("Google opened");

    }
    //after -> tearDawn
    @AfterMethod(enabled = true)
    public void tearDown(){
        driver.quit();//closes all tabs and browser
        //driver.close();//closes only current tub in a browser
    }
}
