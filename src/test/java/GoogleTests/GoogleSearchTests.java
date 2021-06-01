package GoogleTests;

import libs.WebElements;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleMainPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertArrayEquals;

public class GoogleSearchTests {

    public WebDriver webDriver;
    public GoogleMainPage googleMainPage;
    public WebElements

    @Test
    public void searchTest(){
        String searchText = "junit4";
        String linkText = "";
        String titlePageText = "";
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        System.out.println("-----------------------");


        char[] expectedLinkText = {'J','u','n','i','t'};
        char[] expectedTitlePageText = {'J','u','n','i','t'};

        googleMainPage.searchInputFormFill(searchText);

        char[] actualLink = googleMainPage.getTextFirstLink().toCharArray();
        char[] actualTitle = googleMainPage.getFirstSearchResultTitle().toCharArray();

        assertArrayEquals("smth L",expectedLinkText, actualLink);
        assertArrayEquals("smth T",expectedTitlePageText, actualTitle);

        System.out.println("expectedLinkText:");
        System.out.println(expectedLinkText);
        System.out.println("actual:");

    }

    @Before
    public void beforeTest(){
        File fileChromeDriver = new File("drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());

        webDriver = new ChromeDriver();
        googleMainPage = new GoogleMainPage(webDriver);
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://google.com");


    }

    @After
    public void afterTest(){
        webDriver.quit();
    }
}
