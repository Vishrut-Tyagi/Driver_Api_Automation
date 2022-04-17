
Feature: Api Testing

  Scenario: Validating login api
    Given Database is connected
    When User calls login api
    Then the API call is success with status code 200
    And status in response body is ok