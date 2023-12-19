Feature: Register

  Background:
    Given I am on homepage
    And I click on register link

  @author_Himanshu @sanity @smoke @regression
  Scenario: User should navigate to register page successfully
    #Given I am on homepage
    #When I click on register link
    Then I should navigate to register page successfully

  @author_Himanshu @smoke @regression
  Scenario: User should see FirstName LastName Email Password And Confirm Password Fields Are Mandatory
    #Given I am on homepage
    #When I click on register link
    And I click on REGISTER button
    Then I should see the first name error message "First name is required."
    And I should see the last name error message "Last name is required."
    And I should see the email error message "Email is required."
    And I should see the password error message "Password is required."
    And I should see the confirm password message "Password is required."

  @author_Himanshu @regression
  Scenario: verify That User Should Create Account Successfully
    #Given I am on homepage
    #When I click on register link
    And I select gender Female
    And I enter firstname
    And I enter lastname
    And I select day
    And I select month
    And I select year
    And I enter email
    And I enter password
    And I enter Confirm Password
    And I click on REGISTER button
    Then I verify message "Your registration completed"