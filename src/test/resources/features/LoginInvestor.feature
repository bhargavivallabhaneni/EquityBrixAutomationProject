Feature:  Login Page Feature

  Scenario: Validate Page Title
    Given user is on Sponsor Login page
    And wait for page to load
    Then page title should be "Sign in"

  Scenario Outline: Login successful
    Given user is on Sponsor Login page
    And wait for page to load
    When enter username <string> and password <string2>
    When click on Sign in button
    Examples:
      | string                            | string2         |
      | "bhargavi.sponsor+qa26@gmail.com" | "Lsnworks@2022" |

   Scenario Outline: Sign/Create Investor Successful

      Given user is on Sponsor Login page
      And wait for page to load
      When user clicks on Sign in link
      And enters email clicks send verification button
      And waits for some time
      When opt is received and enters otp
#      And waits for some time
      And clicks verify button
      And waits for some time
      And user enter <newPassword> and <confirmPassword>
      And waits for some time
      And user enter <givenName> and <surName>creates account
      And waits for some time
Examples:
  | newPassword    | confirmPassword | givenName   | surName         |  |
  | "Lsnworks!123" | "Lsnworks!123"  | "bhargavi " | " vallabhaneni" |  |