import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.Duration;

public class Secondtest {
    @Test
    public void testTwo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement icon = driver.findElement(By.xpath("//*[@id=\"site-menu\"]/ul/li[3]/a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(icon).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(3000);
        WebElement icon1 = driver.findElement(By.xpath("//*[@id=\"site-menu\"]/ul/li[3]/ul/li[2]/a"));
        builder.click(icon1).perform();


    }

    @Test
    public void testThree() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
        WebElement ball = driver.findElement(By.xpath("//*[@id=\"ball\"]"));
        WebElement goal = driver.findElement(By.xpath("//*[@id=\"gate\"]"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(ball, goal).perform();


    }

    }
