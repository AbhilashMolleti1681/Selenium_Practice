package Chapter_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by amolleti on 4/25/2018.
 */

public class IAmTheDriver {
    public static void main(String... args){
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
        IAmTheEventListener eventListener = new IAmTheEventListener();
        eventFiringDriver.register(eventListener);

        eventFiringDriver.get("http://www.google.com");
        eventFiringDriver.get("http://www.youtube.com");
        eventFiringDriver.navigate().back();


    }

}
