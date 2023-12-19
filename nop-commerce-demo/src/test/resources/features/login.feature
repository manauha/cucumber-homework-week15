Feature: Login

  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Background:
    Given I am on homepage
    And I click on login link

  @author_Himanshu @sanity @smoke @regression
  Scenario: User should navigate to login page successfully
    #Given I am on homepage
    #When I click on login link
    Then I should navigate to login page successfully

  @author_Himanshu @smoke @regression
  Scenario Outline: Verify the error message with invalid credentials
    #Given I am on homepage
    #When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @author_Himanshu @regression
  Scenario: User should log in successfully with valid credentials
    #Given I am on homepage
    #When I click on login link
    And I enter email "ncooper18@test.com"
    And I enter password "Pen2paper"
    And I click on login button
    Then I should log in successfully

  @author_Himanshu @regression
  Scenario: User should log out successfully
    #Given I am on homepage
    #When  I click on login link
    And  I enter email "ncooper18@test.com"
    And I enter password "Pen2paper"
    And I click on login button
    And I click on Log out link
    Then I should see the login Link