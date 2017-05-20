Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page

	When I enter Username as "sha@codewalla.com" and Password as "c0dewa!!a"
	Then User goes to Sales Huddle page
 
