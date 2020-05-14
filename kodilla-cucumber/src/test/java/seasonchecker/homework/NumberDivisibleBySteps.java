package seasonchecker.homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NumberDivisibleBySteps implements En {
    private int number;
    private String answer;

    public NumberDivisibleBySteps() {
        Given("type number 3", () -> {
            this.number = 3;
        });

        Given("type number 5", () -> {
            this.number = 5;
        });

        Given("type number 15", () -> {
            this.number = 15;
        });

        Given("type number 2", () -> {
            this.number = 2;
        });

        Given("type number 30", () -> {
            this.number = 30;
        });

        When("I ask what the given number is divisible", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkNumber(this.number);
        });

        Then("I should be say {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
