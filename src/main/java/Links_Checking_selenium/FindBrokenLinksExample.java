package Links_Checking_selenium;

/**
 * Created by amolleti on 4/25/2018.
 */


import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindBrokenLinksExample {

    public static WebDriver driver;
    public static int invalidLinksCount;

    public static void main(String[] args) {
        setUp();
        validateInvalidLinks();
        verifyURLStatus(driver.getCurrentUrl().toString());
        tearDown();
    }

//    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

//    @Test
    public static void validateInvalidLinks() {

        try {
            invalidLinksCount = 0;
            List<WebElement> anchorTagsList = driver.findElements(By.tagName("a"));
            System.out.println("Total no. of links are " + anchorTagsList.size());
            for (WebElement anchorTagElement : anchorTagsList) {
                if (anchorTagElement != null) {
                    String url = anchorTagElement.getAttribute("href");
                    if (url != null && !url.contains("javascript")) {
                        verifyURLStatus(url);
                    } else {
                        invalidLinksCount++;
                    }
                }
            }

            System.out.println("Total no. of invalid links are "
                    + invalidLinksCount);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

//    @AfterClass
    public static void tearDown() {
        if (driver != null)
            driver.quit();
    }

    public static void verifyURLStatus(String URL) {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(URL);
        try {
            HttpResponse response = client.execute(request);
            // verifying response code and The HttpStatus should be 200 if not,
            // increment invalid link count
            ////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
            if (response.getStatusLine().getStatusCode() != 200)
                invalidLinksCount++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}