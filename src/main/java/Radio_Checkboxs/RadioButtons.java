package Radio_Checkboxs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.ScrollAction;

import java.util.List;
import java.util.Random;

/**
 * Created by amolleti on 4/16/2018.
 */
public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.quackit.com/html/codes/html_radio_button.cfm");
        driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
        Thread.sleep(5000);
        List<WebElement> l = driver.findElements(By.name("software"));
        Random random = new Random();
        WebElement web = l.get(random.nextInt(l.size()));
        web.click();

//        String s = l.get(index).getAttribute("value");
//        System.out.println(s);
//        for (int i = 0; i <= l.size(); i++) {
//            System.out.println((l.get(i).getAttribute("value")));
//        }
    }
}
