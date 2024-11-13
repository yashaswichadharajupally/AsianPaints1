  Feature: Sleek Kitchens
  Scenario: Valiadate that user should be able to submit details
   Given Browser should be launched and URL should be navigated
    When User should be able to mouse hover on Waterproofing link
    And  User should be able to see the sub-options in Waterproofing link when displayed
		And click on Bathrooms link
    And scroll down and click on  sleek kitchens
    And Click on book consultation
    And enter the valid credentials
    And click on sumbit
   Then verify consultation is booked or not