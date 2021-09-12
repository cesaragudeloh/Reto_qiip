#Author:cesar.agudelo.h@gmail.com

Feature: Buy products in the online store


  @BuyProduct
  Scenario: Buying a product at SwagLabs APP
    Given that "the user" sign in SwagLabs app
    When He add the "Sauce Labs Fleece Jacket" to the cart
    And He does the checkout of the purchase
    Then He should see that the purchase is successful