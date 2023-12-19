Feature: Computers

  Background:
    Given I am on homepage

  @author_Himanshu @sanity @smoke @regression
  Scenario: I should navigate to Computers page successfully
    When I click on Computers tab
    Then I should see "Computers" text

  @author_Himanshu @smoke @regression
  Scenario: I should navigate to Desktops page successfully
    When I click on Computers tab
    And I click on Desktops link
    Then I should see desktops "Desktops" text

  @author_Himanshu @regression
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    When I click on Computers tab
    And I click on Desktops link
    And I click on product name Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select software "<software>"
    And I click on ADD TO CART Button
    Then I should see the message "The product has been added to your shopping cart"

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |