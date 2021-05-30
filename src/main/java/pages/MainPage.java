package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


public class MainPage {
    WebDriver webDriver;
    Logger logger;

    public MainPage(WebDriver webDriver){
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        PageFactory.initElements(webDriver, this);
    }

    /**
    * Method "open urls"
    * @param url
    * */
    public void openUrl(String url){
       try {
           webDriver.get(url);
           logger.info("page was opened "+ url);
       }catch (Exception e){
           e.printStackTrace();
           logger.error("page can`t opened "+ url);
           Assert.fail("page can`t opened "+ url);
       }
    }
}
