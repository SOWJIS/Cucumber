Feature: Login With valid Credentials

  Scenario: Login With valid Credentials
    Given Open Edge Browser
    And Open URL https://www.saucedemo.com/
    When Login Id Login Password
    And Click On Submit
    Then Click on Add to Cart
    And Open Add to Cart
    Then Click Check Out
    And Check out your information
    Then Click on continue
    And Click on Finish
    Then Click on Back Home
    And Logout
    Then Close Edge Browser
