package real_time_new;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vmo {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\upend\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();  // Initialize the driver here
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void open_browser() {
        driver.get("https://www.facebook.com/login/");
        System.out.println("Browser opened");
       
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("your-email@example.com");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("your-password");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        System.out.println("Credentials entered");
    }

   
    @Test(priority = 2)
    public void quit_browser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Browser closed");
    }


}
