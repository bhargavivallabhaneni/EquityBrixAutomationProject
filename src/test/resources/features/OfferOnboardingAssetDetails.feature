Feature:  Offer Login Page Feature
  Scenario Outline: OfferOnboarding Details
    Given user is on Sponsor Login page
    And wait for page to load
    When enter username <string> and password <string2>
    When click on Sign in button
    And wait for Onboard page to load
#    And user clicks on Add New Investment Offering Button
    And user enters EntityLLCName <EntityLLCName>
    Then user enters property name <property_name>
    And user enters CurrencyCode <CurrencyCode>
    And user enters TimeZone <TimeZone>
    And user enters PropertyStreetAddress <PropertyStreetAddress>
    Then user selects private investor portal checkbox
    And user selects EBMarketplace checkbox
    And user selects checkBox for NDA required for prospective investors to view property investment
    Then user selects investment fundraising channels
    Then user enters Metro Area <MetroArea>
    And user clicks and selects property type from dropdown
    And user clicks and selects property rating from dropdown
    Then user clicks and selects Property investment model from dropdown
    And user clicks and selects property Region from dropdown
    Then user enters property purchase date <PropertyPurchaseDate>
    And user enters property purchase price <PropertyPurchasePrice>
    And user enters property built year <PropertyYear>
    Then user enters Most Recent PropertyAsset Appraisal Date <Most_Recent_Property_Asset_Appraisal_Date>
    And user enters Most Recent PropertyAsset Appraisal Value <Most_Recent_Property_Asset_Appraisal_value>
    Then user enters lot size <Lot_Size>
    And user enters Gross Square footage <Gross_Square_footage>
    And user enters NetArea <NetArea>
    And user enters Number of rental units <Number_of_rental_units>
    Then user enters Offering introduction <OfferingHeadLine>
    Then user enters Offering Summary <OfferingSummary>
    Then user clicks on senior debt edit
    And user enters senior debt stack amount <senior_debt_stack_amount>
    Then user clicks on addNow Button
    And user clicks on Upload Investment Offering Historical Pro Financial ProjectionsP&L
    And user clicks on upload file for Property Financial projections
    And user enters Financial projections document name <DocName>
    Then user clicks on addNow Button
    And user clicks on Add Use of Funds
    And user clicks on upload file for Use of Funds
    And user enters Use of Funds document name <DocNames>
    Then user clicks on addNow Button
    And User enters ContingentLiabilities <ContingentLiabilities>
    And user enters PendingLitigation <PendingLitigation>
    And user enters MaterialInformation <MaterialInformation>
    Then user clicks on next button


    Examples:
      | string                               | string2        | EntityLLCName | property_name          | CurrencyCode | TimeZone            | PropertyStreetAddress | MetroArea | PropertyPurchaseDate | PropertyPurchasePrice | PropertyYear | Most_Recent_Property_Asset_Appraisal_Date | Most_Recent_Property_Asset_Appraisal_value | Lot_Size | Gross_Square_footage | NetArea | Number_of_rental_units | OfferingHeadLine           | OfferingSummary               | senior_debt_stack_amount | DocName              | DocNames     | ContingentLiabilities  | PendingLitigation      | MaterialInformation            |
      | "lsnsponsor+1724656028490@gmail.com" | "Lsnworks!123" | "RealEstate"  | "RealEstateProperties" | USD          | America/Los_Angeles | 123william st         | 12        | 12-24-2000           | 65445                 | 2000         | 12-24-2000                                | 45678                                      | 6788     | 4567                 | 7655    | 8764                   | A short paragraph offering | An Overview of the Investment | 100                      | FinancialProjections | Use of Funds | outstanding contingent | Outstanding or Pending | Any Other Material Information |
