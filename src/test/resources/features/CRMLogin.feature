Feature: CRM 
Scenario: Valid Login Test
Given User is already on login page
When User enters login credentials
      | uname | pwd |
			| tejureddy1105@gmail.com | Teju@1105 |
Then User is on Home Page
Then Close browser
			