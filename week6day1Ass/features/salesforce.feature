Feature: Login and create an account in Salesforce

Scenario: Create an account in Salesforce
  Given login the Salesforce page
  When Login with valid credentials
  And Click on the toggle menu button
  And Click view All and select Sales from App Launcher
  And Navigate to the Accounts tab
  And Click on the New button
  And Enter 'Bhavanni' as account name
  And Select Ownership as Public
  Then Save the account and verify the account name
