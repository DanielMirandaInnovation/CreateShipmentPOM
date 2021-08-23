Feature: Create a shipment

  Scenario: Create a shipment successful
    Given that a web user wants to create a shipment
    When he fills all the requested fields
    Then he should see the created shipment.