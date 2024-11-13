 Feature: Decor pro
 
 Scenario: validate that user should be able to navigate Decor pro and then return to decorpro page
    Given Browser should be launched and URL should be navigated
    When User should be able to mouse hover on Waterproofing link
    And  User should be able to see the sub-options in Waterproofing link when displayed
    And click on Bathrooms link
    And the user should be navigated to the Bathrooms products page
    And scroll down and click on  decor pro
    And mouseHover on About DecorPro
    And Click on Decor by asian paints
    Then decorPro page should be displayed
    
   
