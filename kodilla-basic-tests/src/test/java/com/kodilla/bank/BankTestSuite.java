package com.kodilla.bank;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCorrectAddMoney(){
        Bank bank = new Bank();
        bank.addMoneyToGdansk(5000);
        bank.addMoneyToGdansk(600);
        bank.addMoneyToGdansk(540);
        bank.addMoneyToGdansk(-540);
        bank.addMoneyToGdansk(-460);

        bank.addMoneyToKrakow(5200);
        bank.addMoneyToKrakow(-850);
        bank.addMoneyToKrakow(-400);
        bank.addMoneyToKrakow(0);
        bank.addMoneyToKrakow(1250);

        assertEquals(-2250, bank.withdrawMoneyGdansk(), 0.001);
        assertEquals(2518, bank.getAveragePayementGdansk(), 0.001);
        assertEquals(12590, bank.payementMoneyGdansk(), 0.001);
        assertEquals(51700, bank.sumOfAllCashMachines(), 0.001);
        assertEquals(12590, bank.payementMoneyKrakow(), 0.001);
        assertEquals(2518, bank.getAveragePayementKrakow(), 0.001);
    }
}
