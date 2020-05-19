package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance()) {
            wallet.getBalance();
        } else {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
    }

    public String message(int cash, int amount) {
        if (amount > cash) {
            return "insufficient funds in my account";
        } else
            return "Transaction complete.";
    }
}
