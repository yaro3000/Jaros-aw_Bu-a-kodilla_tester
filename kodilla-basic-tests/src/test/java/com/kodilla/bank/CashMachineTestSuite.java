package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void CashMachineWithoutTransactions() {
        CashMachine cashMachine = new CashMachine();
        int[] moneyHolder = cashMachine.getSaldo();
        assertEquals(0, moneyHolder.length);
    }

    @Test
    public void addMoneyToCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transactions(3200);
        cashMachine.transactions(800);
        cashMachine.transactions(-500);

        int[] moneyHolder = cashMachine.getSaldo();
        assertEquals(3, moneyHolder.length);
        assertEquals(3200, moneyHolder[0]);
        assertEquals(800, moneyHolder[1]);
        assertEquals(-500, moneyHolder[2]);
    }

    @Test
    public void getAverageOfPayement() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transactions(0);
        cashMachine.transactions(800);
        cashMachine.transactions(1000);

        assertEquals(600, cashMachine.getAverage(), 0.001);
    }

    @Test
    public void getAverageOfWithdraw() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transactions(-500);
        cashMachine.transactions(-200);
        cashMachine.transactions(-1000);
        cashMachine.transactions(-100);

        assertEquals(-450, cashMachine.getAverageWidraw(), 0.001);
    }

    @Test
    public void getCorrectMoneySum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transactions(600);
        cashMachine.transactions(12);
        cashMachine.transactions(1100);
        cashMachine.transactions(-800);
        cashMachine.transactions(650);
        cashMachine.transactions(210);
        cashMachine.transactions(620);
        cashMachine.transactions(0);

        assertEquals(2392, cashMachine.getMoneySum(), 0.001);
        assertEquals(532, cashMachine.getAveragePayement(), 0.001);
        assertEquals(-800, cashMachine.getAverageWidraw(), 0.001);
    }
}
