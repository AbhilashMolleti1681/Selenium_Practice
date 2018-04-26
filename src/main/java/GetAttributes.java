import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by amolleti on 3/12/2018.
 */
public class GetAttributes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println("Name of the button is: " + searchButton.getAttribute("name"));
        System.out.println("Id of the button is: " + searchButton.getAttribute("id"));
        System.out.println("Class of the button is: " + searchButton.getAttribute("class"));
        System.out.println("Label of the button is: " + searchButton.getAttribute("aria-label"));
    }
}
