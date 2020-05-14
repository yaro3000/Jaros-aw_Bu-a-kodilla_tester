package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if(amount > wallet.getBalance()) {
            wallet.getBalance();
        } else {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
    }
}
