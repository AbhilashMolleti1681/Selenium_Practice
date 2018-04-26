import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by amolleti on 3/12/2018.
 */
public class Clear {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.google.com");
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys(Keys.chord(Keys.SHIFT, "packt publishing"));
//        searchBox.clear();
//    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getCssValue("font-family"));
    }
}
