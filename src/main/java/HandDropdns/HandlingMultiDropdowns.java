package HandDropdns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by amolleti on 4/16/2018.
 */
public class HandlingMultiDropdowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Select s = new Select(driver.findElement(By.id("searchLanguage")));

        System.out.println("----------Printing all dropdown Values---------");
        List<WebElement> l = driver.findElements(By.tagName("option"));
        Iterator<WebElement> i = l.iterator();
        System.out.println(l.size());
        while (i.hasNext()) {

            System.out.println(i.next().getAttribute("value"));
        }

//        for (int i = 0; i <= l.size() - 1; i++) {
//            System.out.println(l.get(i).getText());
//        }

        System.out.println("----------Printing all dropdown Values---------");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
        List<WebElement> links = element.findElements(By.tagName("a"));
        Iterator<WebElement> i1 = links.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next().getText());
        }
        System.out.println("Total links are:---" + links.size());

        Random random=new Random();
        WebElement web= links.get(random.nextInt(links.size()));
        web.click();
        System.out.println(web);

    }

}
