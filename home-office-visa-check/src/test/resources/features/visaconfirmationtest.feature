Feature: visa confirmation test

Background:
  Given User is on homepage
  And User accept the cookies

  @author_Himanshu @sanity @smoke @regression
Scenario: an Australian coming to UK for tourism.
When User click on Start now button
And User select a Nationality as "Australia"
And User click on Continue button
And User select reason 'Tourism'
And User clicks on Continue button
Then User should see result "You will not need a visa to come to the UK"

  @author_Himanshu @smoke @regression
Scenario: a Chilean coming to the UK for work and plans on staying for longer than six months.
When User click on Start now button
And User select a Nationality as "Chile"
And User click on Continue button
And User select a reason Work, academic visit or business
And User clicks on Continue button
And User select intent to stay for longer than six months
And User press on Continue button
And Select have planning to work for Health and care professional
And User hit on Continue button
Then User see result "You need a visa to work in health and care"

  @author_Himanshu @regression
Scenario: A Columbian national coming to the UK to join a partner for a long stay they do have an Article 10 Or 20 Card
When User click on Start now button
And User select a Nationality as "Colombia"
And User click on Continue button
And User select  reason join partner or family for a long stay
And User clicks on Continue button
#Select state My partner of family member have uk immigration status 'yes'
#Click on Continue button
Then User should see message "You may need a visa"