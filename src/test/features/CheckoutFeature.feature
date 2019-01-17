Feature: This feature has acceptance scenarios for Checkout functionality

  Scenario: User is able to checkout item present in shopping cart
    Given User successfully logs in
    When user clicks on cart icon
    And user click on Proceed to Checkout
    Then User can select address where product is delivered

