package steps;

/*
 * Hook.java
 *
 * Description:
 * This file acts as a base class to initialize the  properties file to read the environment and  browser and
 * driver and initialize the driver.
 *
 * Usage:
 * @Before is use to setup driver, properties, env
 * 1) initialize the properties file and read the properties file based on env from Driverfactory class
 * 2) reads the url/browser from the .properties file and passes to initiDriver
 * 3) And passes the driver to TestRunner file from which the feature file starts running the scenarios
 * 4) Hooks acts as a connector between Steps definition and page classes
 * 5) getLoginPage() sends the LoginPage object reference from hooks file is sent to stepdefination Controctor class.
 *  Which helps in using the methods from that class.
 *
 *
 * @After is used to close the driver.
 *
 */
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.OfferOnboardingDetailsPage;
import pages.SponsorOnboardingPage;
import utils.DataUtility;
import utils.ElementUtil;
import utils.EqBrikOTP;

public class Hooks {

    private DriverFactory df;
    private WebDriver driver;
    private Properties prop;
    private LoginPage loginPage;
    private ElementUtil eleUtil;
    private EqBrikOTP eqBrikOTP;
    private DataUtility dataUtil;
    private SponsorOnboardingPage SponsorOnboardingPage;
    private OfferOnboardingDetailsPage OfferOnboardingDetailsPage;

//    public Hooks(pages.OfferOnboardingAssetDetailsPage offerOnboardingAssetDetailsPage) {
//        OfferOnboardingAssetDetailsPage = offerOnboardingAssetDetailsPage;
//    }

    @Before
    public void setUp() {
        df = new DriverFactory();
        prop = df.initProp();

//        String browserName = System.getProperty("browser", prop.getProperty("browser", "chrome"));
//        String browserVersion = System.getProperty("browserversion", prop.getProperty("browserversion", ""));
//        String testName = System.getProperty("testname", prop.getProperty("testname", "defaultTest"));
//
//        prop.setProperty("browser", browserName);
//        prop.setProperty("browserversion", browserVersion);
//        prop.setProperty("testname", testName);

        driver = df.initDriver(prop);
        loginPage = new LoginPage(driver);
        eleUtil = new ElementUtil(driver);
        eqBrikOTP= new EqBrikOTP(driver);
         dataUtil= new DataUtility(driver);
        SponsorOnboardingPage =new SponsorOnboardingPage(driver) ;
        OfferOnboardingDetailsPage =new OfferOnboardingDetailsPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public LoginPage getLoginPage() {
        return this.loginPage;
    }

    public ElementUtil getElementUtil(){
        return this.eleUtil;
    }

    public EqBrikOTP getEbOTP(){
        return this.eqBrikOTP;
    }

    public DataUtility getDataUtil(){
        return this.dataUtil;
    }

    public SponsorOnboardingPage getSponsorOnboardingPage(){return this.SponsorOnboardingPage;}

    public OfferOnboardingDetailsPage getOfferOnboardingDetailsPage() {
        return this.OfferOnboardingDetailsPage;
    }
}





