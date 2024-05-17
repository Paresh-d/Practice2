@Smoke @Regression @Unit
Feature: Login Function Test
Description:
Background:


@Positive @TC_02
Scenario:Login Function test with valid credential


Given open a browser
And go to application url
And click signUp Btn
When put a valid user
And put a valid password
And click login Btn
And click dropDown Btn
Then Test will pass if logOut Btn found
