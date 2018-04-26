package Links_Checking_selenium;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by amolleti on 4/25/2018.
 */
public class Brokenlinks {
    public static int invalidLinksCount;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Chrome_Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
        List<WebElement> anchorTagsList = element.findElements(By.tagName("a"));
        System.out.println("Total no. of links are " + anchorTagsList.size());
        for (WebElement anchorTagElement : anchorTagsList) {
            if (anchorTagElement != null) {
                String url = anchorTagElement.getAttribute("href");
                if (url != null && !url.contains("javascript")) {
                    HttpClient client = HttpClientBuilder.create().build();
                    HttpGet request = new HttpGet(url);
                    System.out.println("Current url is " + url);
                    try {
                        HttpResponse response = client.execute(request);
                        System.out.println(response.getStatusLine().toString());
                        // verifying response code and The HttpStatus should be 200 if not,
                        // increment invalid link count
                        ////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
                        if (response.getStatusLine().getStatusCode() != 200);
//                            invalidLinksCount++;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                invalidLinksCount++;

            }

        }
    }
}