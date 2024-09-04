
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Purchasing the order
    Given I landed on the Market place 

  @tag2
  Scenario Outline: Test for submitting the order
    Given Login with user name <name> and password <password>
    When I add product <value> to cart
    And checkout <status> and submit order
	  Then "Order confirmation done"
	  
    Examples: 
      | name             | password      | status  |
      | kumarc@gmail.com |     Naveen11$ | success |
      
