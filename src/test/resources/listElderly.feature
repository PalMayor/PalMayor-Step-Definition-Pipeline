Feature: list of elders
  Scenario: As a caretaker I want to list my older adults
    Given I registered my seniors
    When I selected the option to list older adults
    Then the list of my seniors will be displayed