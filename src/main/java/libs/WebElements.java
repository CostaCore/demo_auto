package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.GoogleMainPage;
import pages.MainPage;
import pages.RegistrationPage;

public class WebElements {
    //писать сюда страницы
    WebDriver webDriver;
    Logger logger;


//    private GoogleMainPage googleMainPage;
//    private MainPage mainPage;
//    private RegistrationPage registrationPage;

    public WebElements (WebDriver webDriver){
        this.webDriver = webDriver;
        logger = Logger.getLogger(String.valueOf(getClass()));
    }

    /**
     * Method inputs test to Webelements
     * @param element
     * @param text
     */
    public void inputText(WebElement element, String text){
        try{
            element.clear();
            element.sendKeys(text);
            logger.info(text+"was inputted");
        }catch (Exception e){
            logger.error(text+"wasn`t inputted");
            Assert.fail(text+"wasn`t inputted");
        }
    }

    /**
     * Method click element button
     * @param element
     */
    public void clickOnElement(WebElement element){
        try {
            element.click();
            logger.info("element was clicked" + element);
        }catch (Exception e){
            logger.error("element wasn`t clicked" + element);
            Assert.fail("element wasn`t clicked" + element);
        }
    }

    /**
     *
     * @param locatorWithText
     * @return
     */

    public boolean isElementPresent(String locatorWithText){
        try {
            return webDriver.findElement(By.xpath(locatorWithText)).isDisplayed();
        }catch (Exception e){
            logger.error("element wasn`t displayed");
            return false;
        }
    }
}
