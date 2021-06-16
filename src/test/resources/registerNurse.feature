Feature: Register Nurser
  Scenario: As a nurse, I want to register as a nurse to provide my services to patients.
    Given I entered the application with my account.
    When I select the role nurse and complete the form with my personal data.
    Then My data is registered and I have my account with a nurse role to use its specific functionalities for this role.