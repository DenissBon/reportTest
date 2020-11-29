Feature:  Verify Delivery button

  As a user
  I should be able to see shipping rates/custom charges/tax information in delivery section

  Scenario: Verify if info about shipping rates is present
    Given I'm on a homepage "http://www.itkkit.com"
    When I click on delivery
    Then I should see shipping rates


  Scenario: Verify if custom charges information is present

    Given I'm on a homepage "http://www.itkkit.com"
    When I click on delivery
    Then I should see custom charges



  Scenario: Verify if tax information is present

    Given I'm on a homepage "http://www.itkkit.com"
    When I click on delivery
    Then I should see tax information