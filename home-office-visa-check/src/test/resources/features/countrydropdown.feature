Feature:  Country Dropdown Feature


@author_Himanshu @sanity @smoke @regression
  Scenario Outline: Verify the following country available in country dropdown list
    Given I am on home page
    And I accept the cookies
    When I click on start button
    Then I can see following "<country>" into dropdown

    Examples:
      | country                  |
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |