
Feature: buy products

    Scenario: As a user I want to enter the store and buy products, then make the payment.

      Given user on  login page
      When user enters and username and password
      When clicks on login button
      When user is navigated to the home page
       When user on home page
      When user adds a product to cart
       And user remove a product to cart
       When user goes to shopping cart
       When user returns to home page
      And user selects products from A to Z
      When user selects the first item(red t-shirt)
      When user returns to homeCARD
      When user goes to shopping cart
      When user returns to home
      And user selects products from low to high
      And user selects products from high to low
      And user selects products from AZ
      When user selects the first itemSauce Labs Onesie
      When user returns to cartPage

      When user click in Checkout button
      When user enters and firstName and lastName and postalCode
      When user  click in continue button
      When text Payment Information is  in the page
      When user click in finish
      When text THANK YOU FOR YOUR ORDER is in the page
      When user back to Home page




      Then user on home page








