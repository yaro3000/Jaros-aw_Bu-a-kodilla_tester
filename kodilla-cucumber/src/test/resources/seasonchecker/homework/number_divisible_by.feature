Feature: So the number is divisible
  Numbers can be divisible by one or more numbers

  Scenario Outline: Type number
    Given type number <number>
    When I ask what the given number is divisible
    Then I should be say <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 2      | "None"     |
      | 30     | "FizzBuzz" |