package com.kodilla.bank.homework;

public class CashMachine {

    private static int[] moneyHolder;
    private static int numberOfTransaction;

    public CashMachine() {
        this.moneyHolder = new int[0];
    }

    public void transactions(int value) {
        numberOfTransaction++;
        int[] newTab = new int[this.numberOfTransaction];
        System.arraycopy(moneyHolder, 0, newTab, 0, moneyHolder.length);
        newTab[this.numberOfTransaction - 1] = value;
        this.moneyHolder = newTab;
    }

    public int[] getSaldo() {
        return moneyHolder;
    }

    public double getAverage() {
        if (this.moneyHolder.length == 0) {
            return 0;
        }
        double number = 0;
        for (int i = 0; i < moneyHolder.length; i++) {
            number += moneyHolder[i];
        }
        return number / moneyHolder.length;
    }

    public static double getMoneySum() {
        double number = 0;
        for (int i = 0; i < moneyHolder.length; i++) {
            number += moneyHolder[i];
        }
        return number;
    }

    public static double paymentMoney() {
        double number = 0;
        for (int i = 0; i < moneyHolder.length; i++) {
            if (moneyHolder[i] > 0) {
                number += moneyHolder[i];
            }
        }
        return number;
    }

    public static double withdrawMoney() {
        double number = 0;
        for (int i = 0; i < moneyHolder.length; i++) {
            if (moneyHolder[i] < 0) {
                number += moneyHolder[i];
            }
        }
        return number;
    }

    public  double getAveragePayement() {
        if (this.moneyHolder.length == 0) {
            return 0;
        }
        double number = 0;
        int clock = 0;
        for (int i = 0; i < moneyHolder.length; i++) {
            if (moneyHolder[i] > 0) {
                number += moneyHolder[i];
                clock++;
            }
        }
        return number / clock;
    }

    public double getAverageWidraw() {
        if (this.moneyHolder.length == 0) {
            return 0;
        }
        double number = 0;
        int clock = 0;
        for (int i = 0; i < moneyHolder.length; i++) {
            if (moneyHolder[i] < 0) {
                number += moneyHolder[i];
                clock++;
            }
        }
        return number / clock;
    }
}
