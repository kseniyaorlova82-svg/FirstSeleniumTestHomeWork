import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementsHomeWork {

WebDriver driver;

  @BeforeMethod

    public void setUp() {

driver = new ChromeDriver();

driver.get("https://demowebshop.tricentis.com/");

 driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

 @AfterMethod

public void tearDown() {
      driver.quit();
    }


@Test

 public void findElementsById() {


WebElement notificationSuccess =

driver.findElement(By.id("dialog-notifications-success"));

 System.out.println(notificationSuccess.getAttribute("id"));

  WebElement notificationError =

driver.findElement(By.id("dialog-notifications-error"));

  System.out.println(notificationError.getAttribute("id"));

WebElement barNotification = driver.findElement(By.id("bar-notification"));

 System.out.println(barNotification.getAttribute("id"));


WebElement search = driver.findElement(By.id("small-searchterms"));

  System.out.println(search.getAttribute("id"));


driver.get("https://demowebshop.tricentis.com/register");



  WebElement genderMale = driver.findElement(By.id("gender-male"));

 System.out.println(genderMale.getAttribute("id"));


  WebElement genderFemale =

   driver.findElement(By.id("gender-female"));

  System.out.println(genderFemale.getAttribute("id"));


 WebElement firstName = driver.findElement(By.id("FirstName"));

 System.out.println(firstName.getAttribute("id"));


WebElement lastName = driver.findElement(By.id("LastName"));

System.out.println(lastName.getAttribute("id"));


 WebElement email = driver.findElement(By.id("Email"));

  System.out.println(email.getAttribute("id"));

WebElement registerButton = driver.findElement(By.id("register-button"));

 System.out.println(registerButton.getAttribute("id"));
    }

    @Test

 public void findElementsByName() {

WebElement search = driver.findElement(By.name("q"));

System.out.println(search.getAttribute("name"));


driver.get("https://demowebshop.tricentis.com/register");

WebElement gender = driver.findElement(By.name("Gender"));

System.out.println(gender.getAttribute("name"));


WebElement firstName = driver.findElement(By.name("FirstName"));

 System.out.println(firstName.getAttribute("name"));


WebElement lastName = driver.findElement(By.name("LastName"));

 System.out.println(lastName.getAttribute("name"));


WebElement email = driver.findElement(By.name("Email"));

 System.out.println(email.getAttribute("name"));


WebElement password = driver.findElement(By.name("Password"));

  System.out.println(password.getAttribute("name"));


WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));

 System.out.println(confirmPassword.getAttribute("name"));

driver.get("https://demowebshop.tricentis.com/login");

WebElement rememberMe = driver.findElement(By.name("RememberMe"));

 System.out.println(rememberMe.getAttribute("name"));


driver.get("https://demowebshop.tricentis.com/search");

WebElement searchKeyword = driver.findElement(By.name("Q"));

 System.out.println(searchKeyword.getAttribute("name"));


WebElement category = driver.findElement(By.name("Cid"));

 System.out.println(category.getAttribute("name"));

    }

}
