Feature: Verify basket functionality
  As a user
  I should be able to add/remove/edit the basket

  Background:
    Given I'm on a homepage "http://www.itkkit.com"
    When I hover over menu option
    And I click on submenu option
    When I choose product
    And click add to basket

  Scenario: Verify if you can add product


    Then I should see product in the basket

  Scenario: Verify if you can remove product


    When I see product in the basket
    And I click remove
    Then I should see that product has been canceled

  Scenario: Verify if you can edit product


    When I see product in the basket
    And I edit the amount
    Then I should see its being edited
