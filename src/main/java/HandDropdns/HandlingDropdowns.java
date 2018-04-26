package HandDropdns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

/**
 * Created by amolleti on 4/12/2018.
 */
public class HandlingDropdowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Select s = new Select(driver.findElement(By.id("searchLanguage")));
        List<WebElement> l = s.getOptions();
        System.out.println(l.size());
//        s.selectByIndex(5);
//        s.selectByValue("English");
        Iterator<WebElement> i = l.iterator();;
        System.out.println(l.size());
        while (i.hasNext()) {

            System.out.println(i.next().getAttribute("value"));
        }

//        for (int i = 0; i <= l.size() - 1; i++) {
//            System.out.println(l.get(i).getText());
//        }
    }
}
