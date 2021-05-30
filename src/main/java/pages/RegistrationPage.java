package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends MainPage{
    @FindBy (xpath = "//a[@class='login']")
    private WebElement loginInput;

    @FindBy(xpath = "")
    private WebElement emailCreateInput;

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }


    //

    public void openRegistrationPage(){
        openUrl("http://automationpractice.com/index.php?controller=authentification&back=my-account");
    }
    public void clickSignIn(){
        try {
            loginInput.click();
            logger.info("Click sign in");
        }catch (Exception e){
            logger.error("Can`t Click sign in");
            Assert.fail();
        }
    }

    /**
    * Method input email
    * @param email
    * */

    public void inputEmailCreate(String email){
        try {
            emailCreateInput.sendKeys(email);
            logger.info("input email");
        }catch (Exception e){
            logger.error("Can`t input email");
            Assert.fail();
        }

    }

}
