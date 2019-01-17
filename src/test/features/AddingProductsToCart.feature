Feature: This feature has adding products to cart fuctionality

  Scenario: User is able to add a product to cart
    Given User successfully logs in
    When User selects a product
    And user clicks on Add to cart button
    Then a product gets added to the cart