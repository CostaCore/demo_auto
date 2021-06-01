package GoogleTests;

import libs.WebElements;
import org.junit.After;
import org.junit.Before;
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

    public WebElements webElements;

    @Test
    public void testLoginWithValidData() throws InterruptedException {


        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());


//        webDriver.findElement(By.xpath("//div[@class='gb_Te']//a[@class='gb_D']")).click();

        Thread.sleep(1000);
//        webDriver.findElement(By.xpath("//div[@class='gb_Te']//a[@class='gb_D']")).click();
        Thread.sleep(100000000);



        webDriver.findElement(By.xpath("//div/div/input[@name='q']")).click();
        webDriver.findElement(By.xpath("//div/div/input[@name='q']")).sendKeys("selenium HQ");
        webDriver.findElement(By.xpath("//div/div/input[@name='q']")).sendKeys(Keys.ENTER);


        webDriver.findElement(By.xpath("//div[@class='g']//a[@href='https://www.selenium.dev/']")).click();
        Thread.sleep(200);
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());

    }

    @Before
    public void beforeTest(){
        File fileChromeDriver = new File("drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://google.com");

    }

    @After
    public void afterTest(){
        webDriver.quit();
    }


}
