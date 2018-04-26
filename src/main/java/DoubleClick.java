import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by amolleti on 3/12/2018.
 */
public class DoubleClick {

    public static void main(String... args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("E:\\Selenium_Practice\\src\\main\\resources\\DoubleClick.html");
        WebElement dblClick = driver.findElement(By.name("dblClick"));

        Actions builder = new Actions(driver);
        builder.doubleClick(dblClick).perform();
    }
}
