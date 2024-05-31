Feature: Registration for account opening
Scenario: Filling the information for bank account
Given User should be at registration page
When User enters following data
| sandhya | phule | sandhya.phule@gmail.com | 9988776655 |
| manoj | phule | manoj.phule@gmail.com | 1122334455 |
When User click on submit
Then Details should get saved