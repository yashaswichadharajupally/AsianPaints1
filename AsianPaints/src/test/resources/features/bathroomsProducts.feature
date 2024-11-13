Feature: Bathroom Products


Scenario Outline: Validate that user should be able to navigate to a specific Bathrooms products page

    Given Browser should be launched and URL should be navigated
    When User should be able to mouse hover on Waterproofing link
    And  User should be able to see the sub-options in Waterproofing link when displayed
    And click on Bathrooms link
    And the user should be navigated to the Bathrooms products page
    Then the user selects the <filter> checkbox in the filter
    
    
    Examples: 
   |  filter  |
   |    0     | 
   |    1     |