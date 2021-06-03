Feature: Home Page Functionality

  @search
  Scenario: search for the T-Shirt product
    Given user is on home page of the automationpractice website
    When user click on the T-Shirt button
    And user should able to select the T-Shirt product
    And user add selected product into the cart
    Then user should able to see product in cart


  @myAccount
  Scenario: update user details for his account
    Given user is on home page of the automationpractice website
    When user click on sign in button
    And user add his credentials details and click on signin button
    And user click the my personal information options
    And user updated his firstname and saved successfully.
    Then user should get message your personal information has been successfully updated.