package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SponsorOnboardingPage;
import utils.DataUtility;
import utils.ElementUtil;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class SponsorOnboardingSteps {
    private final SponsorOnboardingPage SponsorOnboardingPage;
    private Hooks hooks;
    private ElementUtil eleUtil;
    private DataUtility dataUtil;
    private  WebDriver driver;
    public SponsorOnboardingSteps(Hooks hooks) {
        this.SponsorOnboardingPage=hooks.getSponsorOnboardingPage();
        this.eleUtil= hooks.getElementUtil();
        this.dataUtil= hooks.getDataUtil();
    }
    @And("user enter PhoneNumber {string}")
    public void userEnterPhoneNumber(String PhoneNumber) {
      SponsorOnboardingPage.enterPhoneNumber(PhoneNumber );
    }
    @And("waits for some time1")
    public void waitsForSomeTime1() throws InterruptedException {
        // Wait<LoginPage> newWait= new FluentWait<LoginPage>(loginPage).withTimeout(Duration.ofMinutes(2));
        SponsorOnboardingPage.waitsForSomeTime1();
    }

    @And("user enter Sponsors Company Name {string}")
    public void userEnterSponsorsCompanyName(String SponsorCompanyName) {
        SponsorOnboardingPage.enterSponsorCompanyName(SponsorCompanyName);
    }

    @And("user enter Sponsors Company Address {string}")
    public void userEnterSponsorsCompanyAddress(String SponsorsCompanyAddress) throws InterruptedException {
        SponsorOnboardingPage.enterSponsorsCompanyAddress(SponsorsCompanyAddress);
    }

    @And("user enter SponsorWebsite {string}")
    public void userEnterSponsorWebsite(String SponsorWebsite) {
        SponsorOnboardingPage.enterSponsorWebsite(SponsorWebsite);
    }
    @And("user enter SubDomain {string}")
    public void userEnterSubDomain(String SubDomain) {
        SponsorOnboardingPage.enterSubDomain(SubDomain);
    }

    @And("user enter SponsorOverview {string}")
    public void userEnterSponsorOverview(String SponsorOverview) throws InterruptedException {
        SponsorOnboardingPage.enterSponsorOverview(SponsorOverview);
    }

    @And("user enter SponsorYearsInBusiness {string}")
    public void userEnterSponsorYearsInBusiness(String YearsInBusiness) {
        SponsorOnboardingPage.enterSponsorYearsInBusiness(YearsInBusiness);
    }

    @And("user enter SponsorTransactionExperience {string}")
    public void userEnterSponsorTransactionExperience(String TransactionExperience) {
        SponsorOnboardingPage.enterSponsorTransactionExperience(TransactionExperience);
    }

    @When("user click on +Add Sponsor LeaderShip Team")
    public void userClickOnAddSponsorLeaderShipTeam() {
        SponsorOnboardingPage.clickSponsorLeadershipTeam();
    }

    @And("user enters TeamMemberName {string}")
    public void userEntersTeamMemberName(String MemberName) {
        SponsorOnboardingPage.enterTeamMemberName(MemberName);
    }

    @And("user enters TeamMemberTitle {string}")
    public void userEntersTeamMemberTitle(String MemberTitle) {
        SponsorOnboardingPage.enterTeamMemberTitle(MemberTitle);
    }

    @And("user enters TeamMemberExperience {string}")
    public void userEntersTeamMemberExperience(String MemberExperience) {
        SponsorOnboardingPage.enterTeamMemberExperience(MemberExperience);
    }

    @And("user click on AddNow Button")
    public void userClickOnAddNowButton() {
        SponsorOnboardingPage.clickAddNowButton();
    }
    @And("user enter Contingent Liabilities {}")
    public void userEnterContingentLiabilities(String Liabilities) {
        SponsorOnboardingPage.enterContingentLiabilities(Liabilities);
    }
    @And("user enter SponsorRelatedLitigation {}")
    public void userEnterSponsorRelatedLitigation(String Litigation) {
        SponsorOnboardingPage.enterSponsorRelatedLitigation(Litigation);
    }
    @And("user enter OtherMaterialInformation {}")
    public void userEnterOtherMaterialInformation(String MaterialInformation) {
        SponsorOnboardingPage.enterOtherMaterialInformation(MaterialInformation);
    }
    @And("user click on Save Button")
    public void userClickOnSaveButton() {
        SponsorOnboardingPage.clickSaveButton();
    }
    @And("user click on Next Button")
    public void userClickOnNextButton() {
        SponsorOnboardingPage.clickNextButton();
    }

    //VerifyIdentity
    @When("user is on VerifyIdentity page")
    public void userIsOnVerifyIdentityPage() throws InterruptedException {
        SponsorOnboardingPage.userOnIdentityPage();
    }
    @And("enters DOB{}")
    public void entersDOB(String dob) throws InterruptedException {
        System.out.println("Enter this Date"+dob);
       SponsorOnboardingPage.enterDOBValue(dob);
    }
//    @And("user enters dob {}")
//    public void userEntersDob(String DOB) throws InterruptedException {
//        System.out.println("Enter this Date"+DOB);
//        SponsorOnboardingPage.entersDob(DOB);
//    }

    @And("user enters SocialSecurityNumber {}")
    public void userEntersSocialSecurityNumber(String ssn) {
        SponsorOnboardingPage.enterSocialSecurityNumber(ssn);
    }
    @Then("wait for Verify Identity")
    public void waitForVerifyIdentity() {
        SponsorOnboardingPage.waitForVerifyIdentity();
    }
    @And("upload and VerifyIdentity")
    public void uploadAndVerifyIdentity() {
        SponsorOnboardingPage.uploadAndVerifyIdentity();
    }


    @And("user clicks on upload Button")
    public void userClicksOnUploadButton() {
    SponsorOnboardingPage.ClicksOnUploadButton();
    }

    @And("user clicks on Continue Button")
    public void userClicksOnContinueButton() {
        SponsorOnboardingPage.userClicksOnContinueButton();
    }

    @And("user clicks on Take a photo")
    public void userClicksOnTakeAPhoto() {
        SponsorOnboardingPage.userClicksOnTakeAPhoto();
    }



    @And("wait for Onboard page to load")
    public void waitForOnboardPageToLoad() {
    SponsorOnboardingPage.waitForOnboardPageToLoad();
    }


    @And("user enters Business_EIN_TIN_Number {}")
    public void userEntersBusiness_EIN_TIN_Number(String EinTin) {
        SponsorOnboardingPage.userEntersBusiness_EIN_TIN_Number(EinTin);
    }

    @And("user enters Controller_Title {}")
    public void userEntersController_Title(String ControllerTitle1) {
        SponsorOnboardingPage.userEntersController_Title(ControllerTitle1);
    }
    @And("user enters Controller_Address {}")
    public void userEntersController_Address(String ControllerAddress)throws InterruptedException {
        SponsorOnboardingPage.userEntersController_Address(ControllerAddress);
    }

    @And("wait for identity page to load")
    public void waitForIdentityPageToLoad() {
        SponsorOnboardingPage.waitForIdentityPageToLoad();
    }

    @And("user clicks on reviewAndSign Button")
    public void userClicksOnReviewAndSignButton() {
        SponsorOnboardingPage.userClicksOnReviewAndSignButton();
    }

    @And("user clicks on disclosureAccepted Button")
    public void userClicksOnDisclosureAcceptedButton() {
        SponsorOnboardingPage.userClicksOnDisclosureAcceptedButton();
    }


    @And("user clicks on continue Button1")
    public void userClicksOnContinueButton1() {
        SponsorOnboardingPage.userClicksOnContinueButton1();
    }
    @And("user clicks on Start")
    public void userClicksOnStart() {
        SponsorOnboardingPage.userClicksOnStart();
    }


    @And("user enters title name {}")
    public void userEntersTitleName(String TitleName) throws InterruptedException {
       SponsorOnboardingPage.userEntersTitleName(TitleName);
    }

    @Then("user click on sign")
    public void userClickOnSign() {
        SponsorOnboardingPage.userClickOnSign();
    }

    @And("user clicks on Adopt and sign")
    public void userClicksOnAdoptAndSign() {
       SponsorOnboardingPage.userClicksOnAdoptAndSign();
    }

    @Then("user clicks on finish Button1")
    public void userClicksOnFinishButton1() {
        SponsorOnboardingPage.userClicksOnFinishButton();
    }

    @And("user clicks on Finish Button")
    public void userClicksOnFinishButton() {
       SponsorOnboardingPage.userClicksOnFinishButton();
    }
    @And("user clicks on yes please take me to the offerings page Button")
    public void userClicksOnYesPleaseTakeMeToTheOfferingsPageButton() {
        SponsorOnboardingPage.userClicksOnYesPleaseTakeMeToTheOfferingsPageButton();
    }

    @And("user clicks on Enable camera Button")
    public void userClicksOnEnableCameraButton() {
        SponsorOnboardingPage.userClicksOnEnableCameraButton();
    }
}



