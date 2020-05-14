package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorret wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Given("I have deposited $220 in my wallet", () -> {
            wallet.deposit(220);
        });

        When("I request $201", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 221);
        });

        Then("Not enough money in wallet", () -> {
            Assert.assertEquals("Not enough money in wallet", cashSlot.walletChecker(cashSlot));
        });

        Given("I have deposited $150 in my wallet", () -> {
            wallet.deposit(150);
        });

        When("I request -$1", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, -1);
        });

        Then("Please enter a valid amount", () -> {
            Assert.assertEquals("Please enter a valid amount", cashSlot.walletChecker(cashSlot));
        });
    }
}