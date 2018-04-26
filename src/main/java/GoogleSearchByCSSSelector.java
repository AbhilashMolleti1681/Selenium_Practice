import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by amolleti on 4/12/2018.
 */
public class GoogleSearchByCSSSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)"));
//        WebElement searchButton = driver.findElement(By
//                .cssSelector("#flrs>a[href='/intl/en/about.html']"));
        System.out.println(searchButton.getAttribute("value"));
    }
}
