package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.ElementUtil;

import org.openqa.selenium.By;
import utils.TimeWait;

import java.util.List;


public class OfferOnboardingDetailsPage {
    private WebDriver driver;
    private ElementUtil eleUtil;
    protected By AddNewInvestmentOffering = By.xpath
            ("//button[text()='Add New Investment Offering']");
    protected By EntityLlcName = By.xpath
            ("//label[text()='Entity/LLC Name']/following-sibling::div/input");
    protected By PropertyName = By.xpath
            ("//label[text()='Property Name']/following-sibling::div/input");
    protected By CurrencyCode = By.xpath
            ("//label[text()='Currency Code']/following-sibling::div/input");
    protected By TimeZone = By.xpath("//label[text()='Time Zone']/following-sibling::div/input");
    protected By PropertyStreetAddress = By.xpath("//input[@placeholder='Enter Property Address']");
    protected By PrivateInvestorPortalCheckbox = By.xpath
            ("//span[text()='Private Investor Portal']");
    protected By EBMarketPlace = By.xpath("//span[text()='EquityBrix Marketplace']");
    protected By YesCheckBox = By.xpath("//span[text()='Yes']");
    protected By NoCheckBox = By.xpath("//span[text()='No']");
    protected By UsAccreditedInvestors = By.xpath("//input[@name='US Accredited Investors']");
    protected By InternationalInvestorsFromMarketMakers = By.xpath
            ("//input[@name='International Investors from Market Makers']");
    protected By BrokerDealerAffiliatedInvestors = By.xpath
            ("//input[@name='Broker-Dealer Affiliated Investors']");
    protected By USEverydayInvestors = By.xpath("//input[@name='US Everyday Investors']");
    protected By MetropolitanStatisticalArea = By.xpath
            ("//label[text()='Metropolitan Statistical Area']/following-sibling::div/input");
    protected By PropertyType = By.xpath
            ("//label[text()='Property Type']/following-sibling::div/div");
    protected By Multifamily = By.xpath("//li[text()='Multi-Family']");
    protected By PropertyRating = By.xpath
            ("//label[text()='Property Rating']/following-sibling::div/div");
    protected By ClassA = By.xpath("//li[text()='Class A+']");
    protected By InvestmentModel = By.xpath
            ("//label[text()='Property Investment Model']/following-sibling::div/div");
    protected By ValueAddSale = By.xpath("//li[text()='New construction']");
    protected By ValueAddRental = By.xpath("//li[text()='Rental']");
    protected By PropertyRegion = By.xpath
            ("//label[text()='Property Region']/following-sibling::div/div");
    protected By EastCoast = By.xpath("//li[text()='East Coast']");
    protected By PropertyPurchaseDate = By.xpath
            ("//label[text()='Property Purchase Date']/following-sibling::div/input");
    protected By PropertyPurchasePrice = By.xpath
            ("//label[text()='Property Purchase Price']/following-sibling::div//input");
    protected By YearBuilt = By.xpath("//label[text()='Year']/following-sibling::div/input");
    protected By MostRecentPropertyAssetAppraisalDate = By.xpath
            ("//label[text()='Most Recent Property/Asset Appraisal Date']/following-sibling::div/input");
    protected By MostRecentPropertyAssetAppraisalValue = By.xpath
            ("//label[text()='Most recent Property/Asset Appraisal Value']/following-sibling::div/input");
    protected By NetArea = By.id("//input[@id=':r8n:']");
    protected By NumberOfRentalUnits = By.id("//input[@id=':r8p:']");
    protected By OfferingHeadLine = By.xpath("//div[@data-placeholder=\\\"Character limit 200\\\"]");
    protected By OfferingSummary = By.xpath("(//div[@data-placeholder=\\\"Character limit 5000\\\"])[1]");
    protected By SeniorDebtEdit = By.xpath("(//span[text()='border_color'])[1]");
    protected By SeniorAmount = By.xpath("//label[text()='Amount']/following-sibling::div//input");
    protected By AddNow = By.xpath("//button[text()='Add Now']");
    protected By FinancialProjections = By.xpath
            ("//h3[text()='+ Upload Offering/Proforma Property Financials Projections / P&L']");
    protected By FinancialBrowse = By.xpath("//span[text()='browse']");
    protected By DocumentName = By.xpath
            ("//label[text()='Document name']/following-sibling::div/input");
    protected By UseOfFunds = By.xpath("//h3[text()='+ Add Use of Funds']");
    protected By FundBrowse = By.xpath("//span[text()='browse']");
    protected By FundDocument = By.xpath
            ("//label[text()='Document name']/following-sibling::div/input");

    public OfferOnboardingDetailsPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtil(driver);

    }
    public void ClicksOnAddNewInvestmentOfferingButton() {
        eleUtil.doClick(AddNewInvestmentOffering, TimeWait.WAIT30SECONDS);
    }

    public void EntersEntityLLCName(String LLcName) throws InterruptedException{
        WebElement EntityLLCName= driver.findElement(By.xpath
                ("//label[text()='Entity/LLC Name']/following-sibling::div/input"));
//    	String text = EntityLLCName.getText();
        EntityLLCName.click();

        Thread.sleep(5000);

        List<WebElement> list=driver.findElements(By.xpath("//ul[@id='free-solo-with-text-demo-listbox']"));

        for (WebElement webElement : list)
        {
            String text=webElement.getText();

            if(text.equals("RealEstate"))
            {
                Actions act =new Actions(driver);
                act.moveToElement(webElement).click().build().perform();

                break;
            }
            else
            {
                EntityLLCName.sendKeys("EntityLlcName");
            }

        }

    }

    public void EntersPropertyName(String PropertyName1) {
        eleUtil.doClick(PropertyName);
        eleUtil.doSendKeys(PropertyName,PropertyName1);

    }

    public void EntersCurrencyCode(String currencyCode) throws InterruptedException {
        WebElement EntersCurrencyCode = eleUtil.getElement(By.xpath(
                "//label[text()='Currency Code']/following-sibling::div/input"));
        Thread.sleep(7000);
        EntersCurrencyCode.sendKeys("USD");
        Thread.sleep(5000);
        EntersCurrencyCode.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        EntersCurrencyCode.sendKeys(Keys.ENTER);

    }

    public void EntersTimeZone(String timeZone) throws InterruptedException {
        WebElement EntersTimeZone = eleUtil.getElement(By.xpath(
                "//label[text()='Time Zone']/following-sibling::div/input"));
        Thread.sleep(7000);
        EntersTimeZone.sendKeys("America/Los_Angeles");
        Thread.sleep(5000);
        EntersTimeZone.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        EntersTimeZone.sendKeys(Keys.ENTER);
    }

    public void EntersPropertyStreetAddress() throws InterruptedException {
        WebElement EntersPropertyStreetAddress = eleUtil.getElement(By.xpath(
                "//input[@placeholder='Enter Property Address']"));
        Thread.sleep(7000);
        EntersPropertyStreetAddress.sendKeys("123 william st");
        Thread.sleep(5000);
        EntersPropertyStreetAddress.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        EntersPropertyStreetAddress.sendKeys(Keys.ENTER);
    }

    public void SelectsPrivateInvestorPortalCheckbox() {
        eleUtil.doClick(PrivateInvestorPortalCheckbox);
    }

    public void SelectsEBMarketplaceCheckbox() {
        eleUtil.doClick(EBMarketPlace);
    }

    public void SelectsCheckBoxForNDARequiredForProspectiveInvestorsToViewPropertyInvestment() {
        eleUtil.doClick(YesCheckBox);
        eleUtil.doClick(NoCheckBox);
    }

    public void SelectsInvestmentFundraisingChannels() {
        eleUtil.doClick(UsAccreditedInvestors);
        eleUtil.doClick(InternationalInvestorsFromMarketMakers);
        eleUtil.doClick(BrokerDealerAffiliatedInvestors);
        eleUtil.doClick(USEverydayInvestors);
    }

    public void EntersMetroArea(String MSA) {
        eleUtil.doSendKeys(MetropolitanStatisticalArea,MSA);
    }

    public void ClicksAndSelectsPropertyTypeFromDropdown() {
        eleUtil.doClick(PropertyType);
        eleUtil.doClick(Multifamily);
    }

    public void ClicksAndSelectsPropertyRatingFromDropdown() {
        eleUtil.doClick(PropertyRating);
        eleUtil.doClick(ClassA);
    }

    public void userClicksAndSelectsPropertyInvestmentModelFromDropdown() {
        eleUtil.doClick(InvestmentModel);
        eleUtil.doClick(ValueAddSale);
        eleUtil.doClick(ValueAddRental);
    }

    public void userClicksAndSelectsPropertyRegionFromDropdown() {
        eleUtil.doClick(PropertyRegion);
        eleUtil.doClick(EastCoast);

    }

    public void userEntersPropertyPurchaseDate(String purchaseDate) {
        eleUtil.doSendKeys(PropertyPurchaseDate);
    }

    public void userEntersPropertyPurchasePrice(String PurchasePrice) {
        eleUtil.doSendKeys(PropertyPurchasePrice);
    }

    public void EntersPropertyBuiltYear(String builtYear) {
        
    }

    public void EntersMostRecentPropertyAssetAppraisalDate( String AppraisalDate) {
    }

    public void EntersMostRecentPropertyAssetAppraisalValue(String appraisalValue) {
    }

    public void EntersLotSize(String lotSize) {
    }

    public void EntersGrossSquareFootage(String squareFootage) {
    }

    public void EntersNetArea(String netArea) {
    }

    public void EntersNumberOfRentalUnits() {
    }

    public void EntersOfferingIntroduction(String offeringIntroduction) {
    }

    public void EntersOfferingSummary(String offeringSummary) {
    }

    public void ClicksOnSeniorDebtEdit() {

    }

    public void EntersSeniorDebtStackAmount(String seniorAmount) {
    }

    public void ClicksOnAddNowButton() {

    }

    public void ClicksOnUploadInvestmentOfferingHistoricalProFinancialProjectionsPL() {
    }

    public void userClicksOnUploadFileForPropertyFinancialProjections() {
    }

    public void EntersFinancialProjectionsDocumentName(String documentName) {
    }

    public void ClicksOnAddUseOfFunds() {
    }

    public void ClicksOnUploadFileForUseOfFunds() {
    }

    public void EntersUseOfFundsDocumentName(String documentNames) {
    }

    public void EntersContingentLiabilities(String Liabilities) {
    }

    public void EntersPendingLitigation(String litigation) {
    }

    public void EntersMaterialInformation() {
    }

    public void ClicksOnNextButton() {
    }

}


