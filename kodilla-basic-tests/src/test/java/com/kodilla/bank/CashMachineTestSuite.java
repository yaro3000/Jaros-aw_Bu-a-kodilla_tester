package com.kodilla.bank;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void CashMachineWithoutTransactions() {
        CashMachine cashMachine1 = new CashMachine();
        int[] moneyHolder = cashMachine1.getSaldo();
        assertEquals(0, moneyHolder.length);
    }

    @Test
    public void addMoneyToCashMachine() {
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.transactions(3200);
        cashMachine2.transactions(800);
        cashMachine2.transactions(-500);

        int[] moneyHolder = cashMachine2.getSaldo();
        assertEquals(3, moneyHolder.length);
        assertEquals(3200, moneyHolder[0]);
        assertEquals(800, moneyHolder[1]);
        assertEquals(-500, moneyHolder[2]);
    }

    @Test
    public void getAverageOfPayment() {
        CashMachine cashMachine3 = new CashMachine();
        cashMachine3.transactions(0);
        cashMachine3.transactions(800);
        cashMachine3.transactions(1000);

        assertEquals(600, cashMachine3.getAverage(), 0.001);
    }

    @Test
    public void getAverageOfWithdraw() {
        CashMachine cashMachine4 = new CashMachine();
        cashMachine4.transactions(-500);
        cashMachine4.transactions(-200);
        cashMachine4.transactions(-1000);
        cashMachine4.transactions(-100);

        assertEquals(-450, cashMachine4.getAverageWidraw(), 0.001);
    }

    @Test
    public void getCorrectMoneySum() {
        CashMachine cashMachine5 = new CashMachine();
        cashMachine5.transactions(600);
        cashMachine5.transactions(12);
        cashMachine5.transactions(1100);
        cashMachine5.transactions(-800);
        cashMachine5.transactions(650);
        cashMachine5.transactions(210);
        cashMachine5.transactions(620);
        cashMachine5.transactions(0);

        assertEquals(2392, cashMachine5.getMoneySum(), 0.001);
        assertEquals(532, cashMachine5.getAveragePayement(), 0.001);
        assertEquals(-800, cashMachine5.getAverageWidraw(), 0.001);
    }
}
