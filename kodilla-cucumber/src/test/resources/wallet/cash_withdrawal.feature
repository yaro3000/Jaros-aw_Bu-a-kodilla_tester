Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Failed withdrawal from a wallet in credit
    Given I have deposited $220 in my wallet
    When I request $201
    Then Not enough money in wallet

  Scenario: Failed withdrawal from a wallet in credit vol 2
    Given I have deposited $150 in my wallet
    When I request -$1
    Then Please enter a valid amount