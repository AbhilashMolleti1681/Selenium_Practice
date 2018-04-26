package LoadCookiesInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by amolleti on 4/18/2018.
 */


public class StoreCookieInfo {

    public static void main(String... args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("<<ur mailID>>");
        driver.findElement(By.name("pass")).sendKeys("<<ur password>>");
        driver.findElement(By.name("persistent")).click();
        driver.findElement(By.name("pass")).submit();

        File f = new File("browser.data");
        try {
            f.delete();
            f.createNewFile();
            FileWriter fos = new FileWriter(f);
            BufferedWriter bos = new BufferedWriter(fos);

            for (Cookie ck : driver.manage().getCookies()) {
                bos.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain()
                        + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                bos.newLine();
            }
            bos.flush();
            bos.close();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}



