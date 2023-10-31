Feature: Users should be able to create account, sign in, and be banned from creating accounts with existing emails
  Scenario: Users should be able to create new accounts with valid and new emails
    Given clicking create primary account button
    When filling out the form with valid email
    And clicking the create account button
    Then user should see the email address they used when creating the account
