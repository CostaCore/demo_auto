package LoginTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 *Created by Costa 20-05-2021
 */

public class LoginTests {

    public WebDriver webDriver;

    @Test
    public void testLoginWithValidData() throws InterruptedException {
        File fileChromeDriver = new File("drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://google.com");

        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());

        webDriver.findElement(By.xpath("//div[@class='gb_Te']//a[@class='gb_D']")).click();

        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//div[@class='gb_Te']//a[@class='gb_D']")).click();
        Thread.sleep(100);



        webDriver.findElement(By.xpath("//div/div/input[@name='q']")).click();
        webDriver.findElement(By.xpath("//div/div/input[@name='q']")).sendKeys("selenium HQ");
        webDriver.findElement(By.xpath("//div/div/input[@name='q']")).sendKeys(Keys.ENTER);


        webDriver.findElement(By.xpath("//div[@class='g']//a[@href='https://www.selenium.dev/']")).click();
        Thread.sleep(200);
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());

        webDriver.quit();
    }

}
