Feature: Cart adds up correctly when items are added. Cart is cached and remebers what was previously in it.
  
  The cart has no items, on adding the cheapest Jeans (36 X 30), then the total displayed on screen should increase correctly
  as the item is added. When the Jeans are removed, the total should decrease. 
  
  Background:
	Given I log into my account as the Test User
	And I want to go shopping
	When I select Mens I will be in the mens clothing page
	

 
  Scenario: Add Jeans
		When I select the product and size I want
		|Product|Size	  |
		|Jeans	|W36 L30  |
		And select the first in the list size 'Waist 36"'
		Then the shopping basket count will be 1
		And the cart total should be price 1

		
	Scenario: Remove Jeans
		Given that I clear the basket 
		Then the shopping basket count will be 0
		