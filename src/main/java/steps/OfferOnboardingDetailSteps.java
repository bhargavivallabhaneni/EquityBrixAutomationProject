package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.OfferOnboardingDetailsPage;
import utils.DataUtility;
import utils.ElementUtil;

import java.util.List;


public class OfferOnboardingDetailSteps {
    private  OfferOnboardingDetailsPage OfferOnboardingDetailsPage;
    private Hooks hooks;
    private ElementUtil eleUtil;
    private DataUtility dataUtil;
    private  WebDriver driver;
    public OfferOnboardingDetailSteps(Hooks hooks) {
        this.OfferOnboardingDetailsPage=hooks.getOfferOnboardingDetailsPage();
        this.eleUtil= hooks.getElementUtil();
        this.dataUtil= hooks.getDataUtil();
    }
    @And("user clicks on Add New Investment Offering Button")
    public void userClicksOnAddNewInvestmentOfferingButton() {
        OfferOnboardingDetailsPage.ClicksOnAddNewInvestmentOfferingButton();
    }

    @And("user enters EntityLLCName {}")
    public void userEntersEntityLLCName(String LLcName) throws InterruptedException{
       OfferOnboardingDetailsPage.EntersEntityLLCName(LLcName);
    }

    @Then("user enters property name {}")
    public void userEntersPropertyName(String PropertyName) {
       OfferOnboardingDetailsPage.EntersPropertyName(PropertyName);
    }

    @And("user enters CurrencyCode {}")
    public void userEntersCurrencyCode(String CurrencyCode) throws InterruptedException {
        OfferOnboardingDetailsPage.EntersCurrencyCode(CurrencyCode);
    }

    @And("user enters TimeZone {}")
    public void userEntersTimeZone(String TimeZone ) throws InterruptedException {
      OfferOnboardingDetailsPage.EntersTimeZone(TimeZone);
    }

    @And("user enters PropertyStreetAddress {}")
    public void userEntersPropertyStreetAddress(String arg0) throws InterruptedException {
       OfferOnboardingDetailsPage.EntersPropertyStreetAddress();
    }

    @Then("user selects private investor portal checkbox")
    public void userSelectsPrivateInvestorPortalCheckbox() {
        OfferOnboardingDetailsPage.SelectsPrivateInvestorPortalCheckbox();
    }

    @And("user selects EBMarketplace checkbox")
    public void userSelectsEBMarketplaceCheckbox() {
        OfferOnboardingDetailsPage.SelectsEBMarketplaceCheckbox();
    }

    @And("user selects checkBox for NDA required for prospective investors to view property investment")
    public void userSelectsCheckBoxForNDARequiredForProspectiveInvestorsToViewPropertyInvestment() {
        OfferOnboardingDetailsPage.SelectsCheckBoxForNDARequiredForProspectiveInvestorsToViewPropertyInvestment();
    }

    @Then("user selects investment fundraising channels")
    public void userSelectsInvestmentFundraisingChannels() {
        OfferOnboardingDetailsPage.SelectsInvestmentFundraisingChannels();
    }

    @Then("user enters Metro Area {}")
    public void userEntersMetroArea(String MSA) {
        OfferOnboardingDetailsPage.EntersMetroArea(MSA);
    }

    @And("user clicks and selects property type from dropdown")
    public void userClicksAndSelectsPropertyTypeFromDropdown() {
        OfferOnboardingDetailsPage.ClicksAndSelectsPropertyTypeFromDropdown();

    }

    @And("user clicks and selects property rating from dropdown")
    public void userClicksAndSelectsPropertyRatingFromDropdown() {
        OfferOnboardingDetailsPage.ClicksAndSelectsPropertyRatingFromDropdown();

    }

    @Then("user clicks and selects Property investment model from dropdown")
    public void userClicksAndSelectsPropertyInvestmentModelFromDropdown() {
        OfferOnboardingDetailsPage.userClicksAndSelectsPropertyInvestmentModelFromDropdown();

    }

    @And("user clicks and selects property Region from dropdown")
    public void userClicksAndSelectsPropertyRegionFromDropdown() {
        OfferOnboardingDetailsPage.userClicksAndSelectsPropertyRegionFromDropdown();
    }


    @Then("user enters property purchase date {}")
    public void userEntersPropertyPurchaseDate(String PurchaseDate) {
        OfferOnboardingDetailsPage.userEntersPropertyPurchaseDate(PurchaseDate);

    }

    @And("user enters property purchase price {}")
    public void userEntersPropertyPurchasePrice(String PurchasePrice) {
        OfferOnboardingDetailsPage.userEntersPropertyPurchasePrice(PurchasePrice);
    }

    @And("user enters property built year {}")
    public void userEntersPropertyBuiltYear(String BuiltYear) {
        OfferOnboardingDetailsPage.EntersPropertyBuiltYear(BuiltYear);

    }

    @Then("user enters Most Recent PropertyAsset Appraisal Date {}")
    public void userEntersMostRecentPropertyAssetAppraisalDate(String AppraisalDate) {
        OfferOnboardingDetailsPage.EntersMostRecentPropertyAssetAppraisalDate(AppraisalDate);

    }

    @And("user enters Most Recent PropertyAsset Appraisal Value {}")
    public void userEntersMostRecentPropertyAssetAppraisalValue(String AppraisalValue) {
        OfferOnboardingDetailsPage.EntersMostRecentPropertyAssetAppraisalValue(AppraisalValue);

    }

    @Then("user enters lot size {}")
    public void userEntersLotSize(String LotSize) {
        OfferOnboardingDetailsPage.EntersLotSize(LotSize);

    }

    @And("user enters Gross Square footage {}")
    public void userEntersGrossSquareFootage(String SquareFootage) {
        OfferOnboardingDetailsPage.EntersGrossSquareFootage(SquareFootage);
    }

    @And("user enters NetArea {}")
    public void userEntersNetArea(String NetArea) {
        OfferOnboardingDetailsPage.EntersNetArea(NetArea);
    }

    @And("user enters Number of rental units {}")
    public void userEntersNumberOfRentalUnits(String RentalUnits) {
        OfferOnboardingDetailsPage.EntersNumberOfRentalUnits();

    }

    @Then("user enters Offering introduction {}")
    public void userEntersOfferingIntroduction(String OfferingIntroduction) {
        OfferOnboardingDetailsPage.EntersOfferingIntroduction(OfferingIntroduction);

    }

    @Then("user enters Offering Summary {}")
    public void userEntersOfferingSummary(String OfferingSummary) {
        OfferOnboardingDetailsPage.EntersOfferingSummary(OfferingSummary);
    }

    @Then("user clicks on senior debt edit")
    public void userClicksOnSeniorDebtEdit() {
        OfferOnboardingDetailsPage.ClicksOnSeniorDebtEdit();
    }

    @And("user enters senior debt stack amount {}")
    public void userEntersSeniorDebtStackAmount(String SeniorAmount) {
        OfferOnboardingDetailsPage.EntersSeniorDebtStackAmount(SeniorAmount);
    }

    @Then("user clicks on addNow Button")
    public void userClicksOnAddNowButton() {
        OfferOnboardingDetailsPage.ClicksOnAddNowButton();
    }


    @And("user clicks on Upload Investment Offering Historical Pro Financial ProjectionsP&L")
    public void userClicksOnUploadInvestmentOfferingHistoricalProFinancialProjectionsPL() {
        OfferOnboardingDetailsPage.ClicksOnUploadInvestmentOfferingHistoricalProFinancialProjectionsPL();


    }
    @And("user clicks on upload file for Property Financial projections")
    public void userClicksOnUploadFileForPropertyFinancialProjections() {
        OfferOnboardingDetailsPage.userClicksOnUploadFileForPropertyFinancialProjections();

    }

    @And("user enters Financial projections document name {}")
    public void userEntersFinancialProjectionsDocumentName(String DocumentName) {
        OfferOnboardingDetailsPage.EntersFinancialProjectionsDocumentName(DocumentName);
    }

    @And("user clicks on Add Use of Funds")
    public void userClicksOnAddUseOfFunds() {
        OfferOnboardingDetailsPage.ClicksOnAddUseOfFunds();

    }
    @And("user clicks on upload file for Use of Funds")
    public void userClicksOnUploadFileForUseOfFunds() {
        OfferOnboardingDetailsPage.ClicksOnUploadFileForUseOfFunds();

    }
    @And("user enters Use of Funds document name {}")
    public void userEntersUseOfFundsDocumentName(String DocumentNames) {
        OfferOnboardingDetailsPage.EntersUseOfFundsDocumentName(DocumentNames);
    }

    @And("User enters ContingentLiabilities {}")
    public void userEntersContingentLiabilities(String Liabilities) {
        OfferOnboardingDetailsPage.EntersContingentLiabilities(Liabilities);
    }

    @And("user enters PendingLitigation {}")
    public void userEntersPendingLitigation(String Litigation) {
        OfferOnboardingDetailsPage.EntersPendingLitigation(Litigation);
    }

    @And("user enters MaterialInformation {}")
    public void userEntersMaterialInformation(String Information) {
        OfferOnboardingDetailsPage.EntersMaterialInformation();
    }

    @Then("user clicks on next button")
    public void userClicksOnNextButton() {
        OfferOnboardingDetailsPage.ClicksOnNextButton();
    }



}
