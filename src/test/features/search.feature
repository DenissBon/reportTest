Feature: Verify search button
  As a user
  I should be able to search using name of product/numbers/by description and get correct results


  Scenario: Validate search by the name of product
    Given I'm on HomePage "http://www.itkkit.com"
    When I enter search data
    And I press enter button
    Then I should see appropriate results


  Scenario: Validate search by using numbers

    Given Im on a HomePage "http://www.itkkit.com"
    When I enter numbers
    And I press enter
    Then I should see appropriate result


  Scenario: Validate search by using description parameters

    Given Im on a HomePage "http://www.itkkit.com"
    When I enter parameters
    And I press enter
    Then I should see appropriate result
