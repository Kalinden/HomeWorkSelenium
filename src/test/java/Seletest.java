import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Seletest {
    @Test
    public void firsTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement link : elements) {
            System.out.println(link.getText() + " " + link.getAttribute("href"));

        }
        elements.get(10).click();
        Thread.sleep(10);
        driver.quit();
    }
}

