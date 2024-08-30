Feature:  Sponsor Login Page Feature
Scenario Outline: SponsorOnboarding Details
  Given user is on Sponsor Login page
  And wait for page to load
  When enter username <string> and password <string2>
  When click on Sign in button
  And wait for Onboard page to load
  And  waits for some time1
  And user enter PhoneNumber <PhoneNumber>
  And user enter Sponsors Company Name <name1>
#  And  waits for some time1
  And user enter Sponsors Company Address <company>
  And user enter SponsorWebsite <Website>
  And user enter SubDomain <SubDomain>
  And user enter SponsorOverview <SponsorOverView>
  And user enter SponsorYearsInBusiness <SponsorYearsInBusiness>
  And user enter SponsorTransactionExperience <SponsorTransactionExperience>
  When user click on +Add Sponsor LeaderShip Team
  And user enters TeamMemberName <TeamMemberName>
  And user enters TeamMemberTitle <TeamMemberTitle>
  And user enters TeamMemberExperience <TeamMemberExperience>
  And user click on AddNow Button
  And  waits for some time1
  And user enter Contingent Liabilities <ContingentLiabilities>
  And user enter SponsorRelatedLitigation <SponsorRelatedLitigation>
  And user enter OtherMaterialInformation <OtherMaterialInformation>
#  And user click on Save Button
  And user click on Next Button

  Examples:
    | string                               | string2        | PhoneNumber  | name1        | company          | Website           | SubDomain    | SponsorOverView                | SponsorYearsInBusiness | SponsorTransactionExperience                   | TeamMemberName | TeamMemberTitle | TeamMemberExperience  | ContingentLiabilities                      | SponsorRelatedLitigation                   | OtherMaterialInformation                      |  |  |
    | "lsnsponsor+1724833728155@gmail.com" | "Lsnworks!123" | "4484731851" | "RealEstate" | "123 william st" | "www.sponsor.com" | "dev-app192" | "A summary that addresses key" | "12"                   | "Sponsor Experience represented by cumulative" | "TeamMember"   | "MemberTitles"  | "List Key Management" | outstanding contingent liabilities type NA | material outstanding or pending litigation | Material Information that should be disclosed |  |  |

  Scenario Outline: SponsorOnboarding VerifyIdentity
    Given user is on Sponsor Login page
    And wait for page to load
    When enter username <string> and password <string2>
    When click on Sign in button
    When user is on VerifyIdentity page
    And enters DOB <dob>
    And user enters SocialSecurityNumber <SocialSecurityNumber>
    Then wait for Verify Identity
    And upload and VerifyIdentity
    And user clicks on Continue Button
    And user clicks on Enable camera Button
#    And  waits for some time1
    And user clicks on Take a photo
    And user clicks on upload Button
    And  waits for some time1
    And user click on Save Button
#    And  waits for some time1
    And user click on Next Button
    And  waits for some time1
    Examples:
      | string                               | string2        | dob        | SocialSecurityNumber |
      | "lsnsponsor+1724833728155@gmail.com" | "Lsnworks!123" | 01/01/1980 | 123456789            |

  Scenario Outline: SponsorOnboarding EntityInformation
    Given user is on Sponsor Login page
    And  wait for page to load
    When enter username <string> and password <string2>
    When click on Sign in button
    And  waits for some time1
    And user enters Business_EIN_TIN_Number <Business_EIN_TIN_Number>
    And user enters Controller_Title <Controller_Title>
    And user enters Controller_Address <Controller_Address>
    And user click on Save Button
    And user click on Next Button

    Examples:
      | string                               | string2        | Business_EIN_TIN_Number | Controller_Title | Controller_Address |
      | "lsnsponsor+1724833728155@gmail.com" | "Lsnworks!123" | "87-6545677"            | ControllerTitles | "123 william st"   |

  Scenario Outline: SponsorOnboarding EquityContract
    Given user is on Sponsor Login page
    And  wait for page to load
    When enter username <string> and password <string2>
    When click on Sign in button
    And  waits for some time1
    And user clicks on reviewAndSign Button
    And  waits for some time1
    And user clicks on disclosureAccepted Button
    And user clicks on continue Button1
    And  user clicks on Start
    Then user click on sign
    And user clicks on Adopt and sign
    And user enters title name <TitleName>
    Then user clicks on finish Button1
    And  waits for some time1
    And user clicks on Finish Button
#    And user clicks on yes Button
    And user clicks on yes please take me to the offerings page Button
    And waits for some time1
    Examples:
      | string                               | string2        | TitleName |
      | "lsnsponsor+1724833728155@gmail.com" | "Lsnworks!123" | Titles    |