package JunitTest;

import org.apache.log4j.Logger;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class JunitTest {

    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());


    @BeforeClass
    public static void beforeClassM(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void afterClassM(){
        System.out.println("afterClass");
    }
    @After
    public void afterT(){
        System.out.println("after T");
//        webDriver.quit();
    }
    @Before
    public void beforeT(){
        System.out.println("beforeTest");
        File chromeFF = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFF.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            logger.info("Open registration url - http://automationpractice.com");
            Thread.sleep(200);
        } catch (Exception e) {
            logger.error("Can't open url");
        }
    }

//    @Test
//    public void testOne(){
//        System.out.println("test one");
//    }
//    @Test(timeout = 10)
//    public void testTwo(){
//        System.out.println("test two");
//    }
}
