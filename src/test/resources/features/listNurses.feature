Feature: List nurses by offer
  Scenario: As a relative in charge I wish to list the nurses
    Given I registered the offer
    When I want to list the nurses of the offer
    Then A list of Nurses applying for the offer will be displayed