package pages;

import libs.WebElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

import static org.junit.Assert.assertArrayEquals;

public class GoogleMainPage  extends MainPage {
    public WebElements webElements;


    @FindBy(xpath = "//div[@id='gb']//div[@id='gbwa']//a")
    private WebElement googleAppsButton;

    @FindBy(xpath = "//div[@id='gb']//a[contains(text(),'Gmail')]")
    private WebElement gmailButton;

    @FindBy(xpath = "//div[@class='gb_Se']/a")
    private WebElement googleLoginButton;

    @FindBy(xpath = "//div[@class='gb_g gb_h']/a[not(contains(text(),'Gmail'))]")
    private WebElement googlePicturesLink;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchInputForm;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")
    private WebElement searchInGoogleButton;

    @FindBy(xpath = "")
    private WebElement iAmLuckyButton;

    @FindBy(xpath = "//div[@id='rso']//a[contains(., 'junit.org')]/h3")
    private WebElement firstSearchResultTitle;

    @FindBy(xpath = "//div[@id='rso']//a[contains(., 'junit.org')]/div/cite")
    private WebElement firstSearchLinkText;


    public GoogleMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setGoogleAppsButtonClick(){
            webElements.clickOnElement(googleAppsButton);
    }

    public void gmailButtonClick(){
        webElements.clickOnElement(gmailButton);
    }

    public void googleLoginButtonClick(){
        webElements.clickOnElement(googleLoginButton);
    }
    public void googlePicturesLinkClick(){
        try {
            googlePicturesLink.click();
            logger.info("Can`t click googleApps Button");
        }catch (Exception e){
            logger.error("Can`t click googleApps Button");
        }
    }
    public void searchInputFormFill(String searchText){
        webElements.clickOnElement(searchInputForm);
        webElements.inputText(searchInputForm, searchText);
            }
    public void searchInGoogleButtonClick(){
        try {
            searchInGoogleButton.click();
            logger.info("click search Button");
        }catch (Exception e){
            logger.error("Can`t click search Button");
        }

    }

    public void iAmLuckyButtonClick(){
        try {
            iAmLuckyButton.click();
            logger.info("Click 'I am Lucky' Button");
        }catch (Exception e){
            logger.error("Can`t click 'I am Lucky' Button");
        }

    }
    public String getFirstSearchResultTitle(){
        System.out.println("First link title: " + firstSearchResultTitle.getText());
        return firstSearchResultTitle.getText();

    }

    public String getTextFirstLink(){
        System.out.println("First link text" + firstSearchLinkText);
        return firstSearchLinkText.toString();
    }

//    public void equalsTextString(String expectResult, String actualResult){
//        char[] actual = actualResult.toCharArray();
//
//        assertArrayEquals(expectResult, actual);
//
//
//
//    }
}
