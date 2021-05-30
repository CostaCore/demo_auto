package RegistrationTests;

import JunitTest.JunitTest;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class RegistrationTests  {

    public WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());


    @Test
    public void registrationTests() throws InterruptedException {
        boolean gender = true;
        String emailCustomer = "nsczxfxthntq@gmail.com";
        String passwordCustomer = "4838960qQ";
        String firstName = "Costa";
        String lastName = "Core";
        //birthdate
        int birthDay = 1;
        int birthMonth = 4;
        int birthYear = 1977;

        String adress = "1875 St Vallejo st.";
        String city = "Denver";
        String zipCode = "80123";
        String state = "Colorado";
        String mobilePhone = "+380503335599";

        String addressAlias = "office";
//        try {
//            webDriver.findElement(By.xpath("//div[@class='header_user_info']/a")).click();
//            logger.info("button 'Sign in' clicked");
//            Thread.sleep(200);
//
//        }catch (Exception e){
//            logger.error("button 'Sign in' don`t clicked");
//        }

        //REGISTRATIONS

        try {
            webDriver.findElement(By.xpath("//*[@id='email_create']")).click();
            webDriver.findElement(By.xpath("//*[@id='email_create']")).clear();
            webDriver.findElement(By.xpath("//*[@id='email_create']")).sendKeys(emailCustomer);
            logger.info("Enter email in registration email input form");
        }catch (Exception e){
            logger.error("Can`t enter email in registration email input form.");
        }

        try {
         webDriver.findElement(By.xpath("//input[@id='SubmitCreate']")).click();
            logger.info("Button 'Create an account' click");
        }catch (Exception e){
            logger.error("Button 'Create an account' can`t click");
        }

        try {
            webDriver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
            logger.info("Button 'Create an account' click");
        }catch (Exception e){
            logger.error("Button 'Create an account' can`t click");
        }

        //PERSONAL INFORMATIONS

        Thread.sleep(100);
        //Title
        if (gender == true){
            try {
                webDriver.findElement(By.xpath("//input[@id='id_gender1']")).click();
                logger.info("gender checkbox click");
            }catch (Exception e){
                logger.info("gender checkbox can`t click");
            }
            }else {
            try {
                webDriver.findElement(By.xpath("//input[@id='id_gender2']")).click();
                logger.info("gender checkbox click");
            }catch (Exception e){
                logger.info("gender checkbox can`t click");
            }
        }


        try {
            webDriver.findElement(By.xpath("//div[@id='uniform-days']/select[@id='days']")).click();
            webDriver.findElement(By.xpath("//div[@id='uniform-days']/select[@id='days']/option["+(birthDay+1)+"]")).click();
            logger.info("Click dropmenu days");
        }catch (Exception e){
            logger.error("Dropmenu days can`t click");
        }
        try {
            webDriver.findElement(By.xpath("//div[@id='uniform-months']/select[@id='months']")).click();
            webDriver.findElement(By.xpath("//div[@id='uniform-months']/select[@id='months']/option["+(birthMonth+1)+"]")).click();
            logger.info("Click dropmenu months");
        }catch (Exception e){
            logger.error("Dropmenu months can`t click");
        }
        try {
            webDriver.findElement(By.xpath("//div[@id='uniform-years']/select[@id='years']")).click();
            webDriver.findElement(By.xpath("//div[@id='uniform-years']/select[@id='years']")).sendKeys(String.valueOf(birthYear));
//            webDriver.findElement(By.xpath("//div[@id='uniform-years']/select[@id='years']/option["+(birthYear+1)+"]")).click();
            logger.info("Click dropmenu years");
        }catch (Exception e){
            logger.error("Dropmenu years can`t click");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='customer_firstname']")).click();
            webDriver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(firstName);
            logger.info("fill firstName inputForm");
        }catch (Exception e){
            logger.error("can`t fill firstName inputForm");
        }


        try {
            webDriver.findElement(By.xpath("//input[@id='customer_lastname']")).click();
            webDriver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(lastName);
            logger.info("fill customer_lastname inputForm");
        }catch (Exception e){
            logger.error("can`t fill customer_lastname inputForm");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='passwd']")).click();
            webDriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(passwordCustomer);
            webDriver.findElement(By.xpath("//input[@id='passwd']")).click();
            logger.info("fill password inputForm");
        }catch (Exception e){

            logger.error("can`t fill password inputForm");
        }




        //ADDRESS
        try {
            webDriver.findElement(By.xpath("//input[@id='firstname']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
            logger.info("fill firstname inputForm");
        }catch (Exception e){

            logger.error("can`t fill firstname inputForm");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='lastname']")).click();
            webDriver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);

            logger.info("fill lastname inputForm");
        }catch (Exception e){

            logger.error("can`t fill lastname inputForm");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='address1']")).click();
            webDriver.findElement(By.xpath("//input[@id='address1']")).sendKeys(adress);
            logger.info("fill address inputForm");
        }catch (Exception e){

            logger.error("can`t fill address inputForm");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='city']")).click();
            webDriver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

            logger.info("fill city inputForm");
        }catch (Exception e){

            logger.error("can`t fill city inputForm");
        }


        try {
            webDriver.findElement(By.xpath("//div[@id='uniform-id_state']/select[@id='id_state']")).click();
            webDriver.findElement(By.xpath("//div[@id='uniform-id_state']/select[@id='id_state']/option["+(6)+"]")).click();
            logger.info("Click dropmenu states");
        }catch (Exception e){
            logger.error("Dropmenu states can`t click");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='postcode']")).click();
            webDriver.findElement(By.xpath("//input[@id='postcode']")).sendKeys(zipCode);
            logger.info("fill zipCode inputForm");
        }catch (Exception e){
            logger.error("can`t fill zipCode inputForm");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='phone_mobile']")).click();
            webDriver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobilePhone);
            logger.info("fill phone_mobile inputForm");
        }catch (Exception e){

            logger.error("can`t fill phone_mobile inputForm");
        }

        try {
            webDriver.findElement(By.xpath("//input[@id='alias']")).click();
            webDriver.findElement(By.xpath("//input[@id='alias']")).sendKeys(addressAlias);
            logger.info("fill alias inputForm");
        }catch (Exception e){
            logger.error("can`t fill alias inputForm");
        }


        try{
            webDriver.findElement(By.xpath("//button[@id='submitAccount']")).click();
            logger.info("Click submit button");
        }catch (Exception e){
            logger.error("Can`t click submit button");
        }

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
}
