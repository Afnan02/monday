Feature: Account Page Functionality
This Feature deal with the Signin functionality

@test
Scenario: Verify User should be in Account Page
	Given Launch "<url>"
	Then user click on Account 
	Then click on Signin button
	Then user enter "<username>" and "<password>"
	Then click on The Signin button