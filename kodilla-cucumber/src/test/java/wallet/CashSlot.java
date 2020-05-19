package wallet;

public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }

    public String walletChecker(CashSlot cashSlot) {
        if (cashSlot.getContents() > 220) {
            return "Not enough money in wallet";
        } else if (cashSlot.getContents() <= 0) {
            return "Please enter a valid amount";
        }
        return "transaction was successful";
    }

}
