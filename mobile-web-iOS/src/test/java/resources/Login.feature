Feature: Login

@correct
Scenario: Login with correct credentials
Given Open https://beta.misli.com in Safari browser
And Click on Daxil Ol button
When Enter correct phoneNumber and password
And Click on login button
Then Check result



@incorrect
Scenario: Login with incorrect credentials
Given Open https://beta.misli.com in Safari browser
And Click on Daxil Ol button
When Enter incorrect phoneNumber and password
And Click on login button
Then Check result1