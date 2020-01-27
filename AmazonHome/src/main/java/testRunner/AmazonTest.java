package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

    WebDriver driver = null;
    @BeforeMethod      // Before Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/sajadakbar/Documents/FinalProject/abce2019/Generic/src/main/java/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }
    @Test                   // Actual Test
    public void test1() throws InterruptedException {
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.cssSelector(".nav-input")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }
    @AfterMethod              // After Test
    public void cleanUp() {
        driver.close();

    }

}

