package pages;
import org.junit.rules.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utils.ElementUtil;
import utils.EqBrikOTP;
import utils.TimeWait;

import java.awt.*;
import java.time.Duration;

import org.openqa.selenium.By;

import javax.mail.Address;

public class SponsorOnboardingPage {
    private WebDriver driver;
    private ElementUtil eleUtil;
    protected By PhoneNumber = By.xpath("//input[@id=':r1o:']");
    protected By SponsorCompanyName = By.xpath("//label[text()=\"Sponsor's Company Name\"]/following-sibling::div/input");
    protected By SponsorsCompanyAddress = By.xpath("//input[@placeholder=\\\"Enter Sponsor's Company Address\\\"]");
    protected By SponsorWebsite = By.xpath("//label[text()='Sponsor Website']/following-sibling::div/input");
    protected By SubDomain = By.xpath("//label[text()='Sub Domain']/following-sibling::div/input");
    protected By SponsorOverView = By.xpath("(//div[@data-placeholder='Character limit 5000'])[1]");
    protected By SponsorYearsInBusiness = By.xpath
            ("//label[text()='Sponsor Years in Business']/following-sibling::div/input");
    protected By SponsorTransactionExperience = By.xpath("(//div[@data-placeholder='Character limit 5000'])[2]");
    protected By SponsorLeaderShipTeam = By.xpath("//h3[text()='+ Add Sponsor Leadership Team']");
    protected By TeamMemberName = By.xpath("//label[text()='Team Member Name']/following-sibling::div/input");
    protected By TeamMemberTitle = By.xpath("//label[text()='Team Member Title']/following-sibling::div/input");
    protected By TeamMemberExperience = By.xpath("(//div[@data-placeholder='Character limit 5000'])[6]");
    protected By AddNowButton = By.xpath("//button[text()='Add Now']");
    protected By ContingentLiabilities = By.xpath("(//div[@data-placeholder='Character limit 5000'])[3]");
    protected By SponsorRelatedLitigation = By.xpath("(//div[@data-placeholder='Character limit 5000'])[4]");
    protected By OtherMaterialInformation = By.xpath("(//div[@data-placeholder='Character limit 5000'])[5]");
    protected By SaveButton = By.xpath("//button[text()='Save']");
    protected By NextButton = By.xpath("//button[text()='Next']");
    protected By dateOfBirth = By.xpath("//input[@id=':r1p:']");
    //    protected By DateOfBirth = By.id("//input[@id=':r2b:']");
    protected By SocialSecurityNumber = By.xpath
            ("//label[text()='Social Security Number']/following-sibling::div/input");
    protected By verifyIdentityButton = By.xpath("//button[text()='Verify Identity']");
    protected By chooseDocument = By.xpath("//button[text()='Choose document']");
    protected By countrySearchList = By.xpath("//input[@id='country-search']");
    protected By clickPassport = By.xpath("//button[@data-onfido-qa='passport']");
    protected By uploadScanPhotos = By.xpath("//button[@data-onfido-qa='uploaderButtonLink']");
    protected By uploadPhoto = By.xpath("//button[@data-onfido-qa='image-guide-doc-upload-btn']");
    protected By uploadPhotoFile = By.xpath("//input[@class='onfido-sdk-ui-CustomFileInput-input']");
    protected By uploadPhotoFileConfirm = By.xpath("//button[@data-onfido-qa='confirm-action-btn']");
    protected By ContinueButton = By.xpath("//button[text()='Continue']");
    protected By EnableCamera = By.xpath("//button[text()='Enable camera']");
    protected By TakePhoto = By.xpath("//button[@aria-label='Take a photo']");
    protected By UploadButton = By.xpath("//button[text()='Upload']");
    protected By EinTin = By.xpath("//label[text()='EIN/TIN']/following-sibling::div/input");
    protected By ControllerTitle = By.xpath
            ("//label[text()='Controller Title']/following-sibling::div/input");
    protected By ControllerAddress = By.xpath("//input[@placeholder='Enter Controller Address']");
    protected By reviewAndSignBtn = By.xpath("//button[text()='Review & Sign']");
    //    protected By disclosureAcceptedBtn = By.xpath("//input[@id='disclosureAccepted']");
    protected By disclosureAcceptedBtn = By.xpath
            ("//label[text()=' I agree to use electronic records and signatures. ']");
    protected By AgContinue = By.xpath("//button[text()='Continue']");
    protected By Start = By.xpath("//span[text()='Start']");
    protected By Titles = By.xpath("(//input[contains(@id,'tab-form-element')])[2]");
    protected By sign1 = By.xpath("(//div[text()='Sign'])[1]");
    //    protected By Sign2 = By.xpath("(//div[text()='Sign'])[2]");
    protected By AdoptAndSign = By.xpath("//button[text()='Adopt and Sign']");
    protected By Finish = By.xpath("//button[text()='Finish']");
    //    protected By YesButton = By.xpath("//button[text()='Yes']");
    protected By YesPleaseTakeMeToTheOfferings = By.xpath("//button[text()='Yes, please take me to the offering, asset details page.']");


    public SponsorOnboardingPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtil(driver);

    }

    public void enterPhoneNumber(String value) {
        eleUtil.doSendKeys(PhoneNumber, value);
    }

    public void enterSponsorCompanyName(String name) {
        eleUtil.doSendKeys(SponsorCompanyName, name);
    }

    public void enterSponsorsCompanyAddress(String SponsorsCompanyAddress) throws InterruptedException {
        WebElement EnterSponsorCompanyAddress = eleUtil.getElement(By.xpath(
                "//input[@placeholder=\"Enter Sponsor's Company Address\"]"));
        Thread.sleep(7000);
        EnterSponsorCompanyAddress.sendKeys("123 William St");
        Thread.sleep(5000);
        EnterSponsorCompanyAddress.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        EnterSponsorCompanyAddress.sendKeys(Keys.ENTER);

    }

    public void enterSponsorWebsite(String Website) {
        eleUtil.doSendKeys(SponsorWebsite, Website);
    }

    public void enterSubDomain(String Domain) {
        eleUtil.doSendKeys(SubDomain, Domain);
    }

    public void enterSponsorOverview(String SpOverview) throws InterruptedException {
        eleUtil.doSendKeys(SponsorOverView, SpOverview);
        WebElement SponsorOverview = eleUtil.getElement(By.xpath(
                "(//div[@data-placeholder='Character limit 5000'])[1]"));
        Thread.sleep(5000);

        SponsorOverview.sendKeys("A summary that address key questions about the sponsor");

    }

    public void enterSponsorYearsInBusiness(String YearsInBusiness) {
        eleUtil.doSendKeys(SponsorYearsInBusiness, YearsInBusiness);
    }

    public void enterSponsorTransactionExperience(String TransactionExperience) {
        eleUtil.doSendKeys(SponsorTransactionExperience, TransactionExperience);
    }

    public void clickSponsorLeadershipTeam() {
        eleUtil.doClick(SponsorLeaderShipTeam);
    }

    public void enterTeamMemberName(String MemberName) {
        eleUtil.doSendKeys(TeamMemberName, MemberName);
    }

    public void enterTeamMemberTitle(String MemberTitle) {
        eleUtil.doSendKeys(TeamMemberTitle, MemberTitle);
    }

    public void enterTeamMemberExperience(String MemberExperience) {
        eleUtil.doSendKeys(TeamMemberExperience, MemberExperience);
    }

    public void clickAddNowButton() {
        eleUtil.doClick(AddNowButton);
    }

    public void enterContingentLiabilities(String Liabilities) {
        eleUtil.doSendKeys(ContingentLiabilities, Liabilities);
    }

    public void enterSponsorRelatedLitigation(String RelatedLitigation) {
        eleUtil.doSendKeys(SponsorRelatedLitigation, RelatedLitigation);
    }

    public void enterOtherMaterialInformation(String MaterialInformation) {
        eleUtil.doSendKeys(OtherMaterialInformation, MaterialInformation);
    }

    public void clickSaveButton() {
        eleUtil.doClick(SaveButton);
    }

    public void clickNextButton() {
        eleUtil.doClick(NextButton);
    }

    public void waitsForSomeTime1() throws InterruptedException {
        // Wait<ElementUtil> newWait= new FluentWait<ElementUtil>(eleUtil).withTimeout(Duration.ofMinutes(2));
        Thread.sleep(100000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    }

    public void waitForOnboardPageToLoad() {
        eleUtil.waitForElementVisible(PhoneNumber, TimeWait.WAIT30SECONDS);
    }

    //    VerifyIdentity
    public void enterDOBValue(String dob) throws InterruptedException {

        WebElement EnterSponsorDOB = eleUtil.getElement(dateOfBirth);
        EnterSponsorDOB.click();
        EnterSponsorDOB.sendKeys(dob);
        Thread.sleep(5000);
        EnterSponsorDOB.sendKeys(Keys.TAB);
    }
//    public void enterDOBValue(String dob) throws InterruptedException {
//        eleUtil.doSendKeys(dateOfBirth, dob, TimeWait.WAIT10SECONDS);
//    }

    public void enterSocialSecurityNumber(String ssn) {
        eleUtil.doSendKeys(SocialSecurityNumber, ssn, TimeWait.WAIT30SECONDS);
    }

    public void waitForVerifyIdentity() {
        eleUtil.waitForElementVisible(verifyIdentityButton, 50000);
    }

    public void uploadAndVerifyIdentity() {
        eleUtil.doClick(verifyIdentityButton, TimeWait.WAIT30SECONDS);
        eleUtil.doClick(chooseDocument, TimeWait.WAIT30SECONDS);
        eleUtil.doClick(countrySearchList, TimeWait.WAIT5SECONDS);
        eleUtil.doSendKeys(countrySearchList, "United States of America", TimeWait.WAIT5SECONDS);
        WebElement selectElement = eleUtil.getElement(countrySearchList);
        selectElement.sendKeys(Keys.ARROW_DOWN);
        selectElement.sendKeys(Keys.ENTER);
        eleUtil.doClick(clickPassport, TimeWait.WAIT5SECONDS);
        eleUtil.doClick(uploadScanPhotos, TimeWait.WAIT10SECONDS);
        WebElement PopUpload = eleUtil.getElement(uploadPhotoFile);
        String projectPath = System.getProperty("user.dir");
        System.out.println("The Path is#####" + projectPath);
        String filePath = "/src/test/resources/Images/sample.pdf";
        PopUpload.sendKeys(projectPath + filePath);
        eleUtil.doClick(uploadPhotoFileConfirm, TimeWait.WAIT5SECONDS);
    }

    public void userClicksOnContinueButton() {
        eleUtil.doClick(ContinueButton, TimeWait.WAIT10SECONDS);
    }

    public void userClicksOnEnableCameraButton() {
        eleUtil.doClick(EnableCamera,TimeWait.WAIT10SECONDS);
    }

    public void userClicksOnTakeAPhoto() {
        eleUtil.doClick(TakePhoto, TimeWait.WAIT30SECONDS);
    }
    public void ClicksOnUploadButton() {
        eleUtil.doClick(UploadButton,TimeWait.WAIT10SECONDS);
    }

    public void userEntersBusiness_EIN_TIN_Number(String EinTin1) {
        eleUtil.doSendKeys(EinTin, EinTin1);
    }

    public void userEntersController_Title(String ControllerTitle1) {
        eleUtil.doSendKeys(ControllerTitle, ControllerTitle1);
    }

    public void waitForIdentityPageToLoad() {
        eleUtil.waitForElementVisible(NextButton, TimeWait.WAIT30SECONDS);
    }


    public void userOnIdentityPage() throws InterruptedException {
        eleUtil.waitForElementVisible(dateOfBirth, TimeWait.WAIT5SECONDS);
    }

    public void userEntersController_Address(String ControllerAddress) throws InterruptedException {
        WebElement EnterControllerAddress = eleUtil.getElement(By.xpath(
                "//input[@placeholder='Enter Controller Address']"));
        Thread.sleep(7000);
        EnterControllerAddress.sendKeys("123 William St");
        Thread.sleep(5000);
        EnterControllerAddress.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        EnterControllerAddress.sendKeys(Keys.ENTER);
    }

    public void userClicksOnReviewAndSignButton() {
        eleUtil.doClick(reviewAndSignBtn);
    }

    public void userClicksOnDisclosureAcceptedButton() {
        eleUtil.doClick(disclosureAcceptedBtn, TimeWait.WAIT10SECONDS);
    }

    public void userClicksOnContinueButton1() {
        eleUtil.doClick(AgContinue, TimeWait.WAIT10SECONDS);
    }

    public void userClicksOnStart() {
        eleUtil.doClick(Start);
    }

    public void userEntersTitleName(String Title) throws InterruptedException {
        eleUtil.doSendKeys(Titles, Title, TimeWait.WAIT30SECONDS);
    }


    public void userClickOnSign() {
        eleUtil.doClick(sign1, TimeWait.WAIT10SECONDS);
//        eleUtil.doClick(Sign2);
    }

    public void userClicksOnAdoptAndSign() {
        eleUtil.doClick(AdoptAndSign, TimeWait.WAIT30SECONDS);
    }

    public void userClicksOnFinishButton1() {
        eleUtil.doClick(Finish, TimeWait.WAIT30SECONDS);
    }

    public void userClicksOnFinishButton() {
        eleUtil.doClick(Finish, TimeWait.WAIT30SECONDS);
    }

//    public void userClicksOnYesButton() {
//        eleUtil.doClick(YesButton,TimeWait.WAIT10SECONDS);
//    }

    public void userClicksOnYesPleaseTakeMeToTheOfferingsPageButton() {
        eleUtil.doClick(YesPleaseTakeMeToTheOfferings, TimeWait.WAIT30SECONDS);
    }



}




