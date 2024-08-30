package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utils.ElementUtil;
import utils.EqBrikOTP;
import utils.TimeWait;

import java.time.Duration;

public class LoginPage {


    private  WebDriver driver;
    private ElementUtil eleUtil;
    private EqBrikOTP eqbrikOtp;
    protected By singInTitle= By.xpath("//h1[@role='heading']");
    protected By FormLabel =By.xpath("//form[@aria-label='Sign in with your email address']");
    protected By Email= By.xpath("//input[@id='email']");
    protected By Password= By.xpath("//input[@id='password']");
    protected By Submit= By.xpath("//button[@id='next']");
    protected By forgotPassword = By.id("forgotPassword");
    protected By signUpNowLink= By.xpath("//a[@id='createAccount']");
    protected By emailID= By.id("email");
    protected By sendOTPButton=By.id("emailVerificationControl_but_send_code");
    protected By emailVerificationCode=By.id("emailVerificationCode");
    protected By buttonVerifyCode=By.id("emailVerificationControl_but_verify_code");//
    protected By buttonChangeEmail=By.id("emailVerificationControl_but_change_claims");
    protected String OTP;
    protected By newPassword= By.id("newPassword");
    protected By confirmPassword= By.id("reenterPassword");
    protected By givenName=By.id("givenName");
    protected By surName=By.id("surname");
    protected By createButton=By.id("continue");
    public LoginPage(WebDriver driver) {
        this.driver =driver;
        eleUtil = new ElementUtil(driver);
        eqbrikOtp= new EqBrikOTP(driver);
    }

    public String getPageTitle(){

        return eleUtil.getElement(singInTitle).getText();
    }


    public void enterCredentials(String userName, String pwd){

        eleUtil.doSendKeys(Email, userName);
        eleUtil.doSendKeys(Password, pwd);
    }

    public void clickSignInButton(){
        eleUtil.doClick(Submit);
    }

    public void waitForPageToLoad(){
        eleUtil.waitForElementVisible(singInTitle, 50000);
    }

    public void clickSignIn() {
        eleUtil.doClick(signUpNowLink);
    }

    public String getVerificationCode(String email) throws InterruptedException {
        eleUtil.doSendKeys(emailID, email, TimeWait.WAIT30SECONDS );
        eleUtil.doClick(sendOTPButton,TimeWait.WAIT30SECONDS);
       // eleUtil.waitForElementPresence(buttonVerifyCode, TimeWait.WAIT30SECONDS);
       waitsForSomeTime();
        OTP = eqbrikOtp.getOTP();
        return OTP;


    }

    public void waitsForSomeTime() throws InterruptedException {
       // Wait<ElementUtil> newWait= new FluentWait<ElementUtil>(eleUtil).withTimeout(Duration.ofMinutes(2));
        Thread.sleep(100000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    }
    public void enterOTPAndCredentials(String OTPRec) {
        System.out.println("Im sending"+OTPRec);
        eleUtil.doSendKeys(emailVerificationCode, OTPRec, TimeWait.WAIT30SECONDS);
    }
    public void clickVerifyButton(){
        eleUtil.doClick(buttonVerifyCode, TimeWait.WAIT30SECONDS);
    }
    public void entersPasswordValues(String value1,String value2){
      eleUtil.doSendKeys(newPassword,value1);
      eleUtil.doSendKeys(confirmPassword,value2);
    }
    public void entersNameValues(String value3,String value4){
        eleUtil.doSendKeys(givenName,value3);
        eleUtil.doSendKeys(surName,value4);
        eleUtil.doClick(createButton);
    }

}
