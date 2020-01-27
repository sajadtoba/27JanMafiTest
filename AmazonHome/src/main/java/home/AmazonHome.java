package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonHome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sajadakbar/Documents/develop/SeleniumJuly2019/" +
                "WebAutomationFrameWork/Generic/src/main/java/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.close();

    }
}
