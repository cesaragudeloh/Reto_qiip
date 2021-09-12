#Author:cesar.agudelo.h@gmail.com

Feature: Buying products at SwagLabs APP


  @BuyProduct
  Scenario: Buying a product
    Given that César sign in SwagLabs app
    When He add the "Sauce Labs Onesie" to the cart
    And He does the checkout of the purchase
    Then He should see that the purchase is successful


  @CheapestPending
  Scenario: Buying the cheapest product
    Given that Vicente sign in SwagLabs app
    When He put in the cart the cheapest product
    And He does the checkout of the purchase
    Then He should see the message "CHECKOUT: COMPLETE!"


  @MostExpensivePending
  Scenario: Buying the most expensive product
    Given that Lucero sign in SwagLabs app
    When She put in the cart the most expensive product
    And She does the checkout of the purchase
    Then She should see the message "CHECKOUT: COMPLETE!"


  @ManyProductsPending
  Scenario: Buying many products
    Given that Laura sign in SwagLabs app
    When She add in the cart the products
      | products                |
      | Sauce Labs Onesie       |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
    And He does the checkout of the purchase
    Then He should see that the purchase is successful