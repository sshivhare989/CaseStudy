
Feature: DemoWebShop Registration

  @Register
  Scenario: The user register in DemoWebShopApp
  
    Given open DemoWebShopApp register page
    When select the Gender as Male
    
 		And enter firstname as "yashu"
 		And enter lastname as "shivhare"
 		And enter email address as "yashus@gmail.com"
 		And enter password as "Shank@123"
 		And enter confirm password as "Shank@123"
 		And Click on register
 		Then successfully registered
 		
 		
 		
 @Login
  Scenario Outline: Login using multiple users
    Given user is on the DemoWebShop login page 
    When user enters the username "<username>"
    And  user enters the password "<password>"
    Then Then user can do successful login

    Examples: 
    |username        |password |
		|yashus@gmail.com|Shank@123|
		|shank@gmail.com |Shank@123|



