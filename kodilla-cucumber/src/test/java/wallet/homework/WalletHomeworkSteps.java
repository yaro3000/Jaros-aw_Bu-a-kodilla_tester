package wallet.homework;

import io.cucumber.java8.En;
import org.junit.Assert;
import wallet.CashSlot;
import wallet.Cashier;
import wallet.Wallet;

public class WalletHomeworkSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletHomeworkSteps() {
        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I check my balance", () -> {
            wallet.getBalance();
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            System.out.println("I should be told that I have insufficient funds in my account");
        });
    }
}