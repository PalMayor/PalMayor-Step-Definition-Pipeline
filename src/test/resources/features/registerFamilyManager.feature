Feature:  Registry of family member in charge
  Scenario: As a relative in charge I want to register as a family member to offer to publish my offers of care and to hire nurses
    Given I entered the application with my account
    When I select the role family and complete the form with my personal data
    Then My data is recorded and I have my account with a relative role to make use of its specific functionalities for this role