package com.kodilla.bank.homework;

public class Bank {

    private CashMachine wroclaw;
    private CashMachine lodz;
    private CashMachine krakow;
    private CashMachine katowice;
    private CashMachine gdansk;

    public Bank() {
        this.wroclaw = new CashMachine();
        this.lodz = new CashMachine();
        this.krakow = new CashMachine();
        this.katowice = new CashMachine();
        this.gdansk = new CashMachine();
    }

    public void addMoneyToWroclaw(int money) {
        this.wroclaw.transactions(money);
    }

    public void addMoneyToLodz(int money) {
        this.lodz.transactions(money);
    }

    public void addMoneyToKrakow(int money) {
        this.krakow.transactions(money);
    }

    public void addMoneyToKatowice(int money) {
        this.katowice.transactions(money);
    }

    public void addMoneyToGdansk(int money) {
        this.gdansk.transactions(money);
    }

    public double getAverageWroclaw() {
        return this.wroclaw.getAverage();
    }

    public double getAverageLodz() {
        return this.lodz.getAverage();
    }

    public double getAverageKrakow() {
        return this.krakow.getAverage();
    }

    public double getAverageKatowice() {
        return this.katowice.getAverage();
    }

    public double getAverageGdansk() {
        return this.gdansk.getAverage();
    }

    public double getMoneySumWroclaw() {
        return this.wroclaw.getMoneySum();
    }

    public double getMoneySumLodz() {
        return this.lodz.getMoneySum();
    }

    public double getMoneySumKrakow() {
        return this.krakow.getMoneySum();
    }

    public double getMoneySumKatowice() {
        return this.katowice.getMoneySum();
    }

    public double getMoneySumGdansk() {
        return this.gdansk.getMoneySum();
    }

    public double payementMoneyWroclaw() {
        return this.wroclaw.paymentMoney();
    }

    public double payementMoneyLodz() {
        return this.lodz.paymentMoney();
    }

    public double payementMoneyKrakow() {
        return this.krakow.paymentMoney();
    }

    public double payementMoneyKatowice() {
        return this.katowice.paymentMoney();
    }

    public double payementMoneyGdansk() {
        return this.gdansk.paymentMoney();
    }

    public double withdrawMoneyWroclaw() {
        return this.wroclaw.withdrawMoney();
    }

    public double withdrawMoneyLodz() {
        return this.lodz.withdrawMoney();
    }

    public double withdrawMoneyKrakow() {
        return this.krakow.withdrawMoney();
    }

    public double withdrawMoneyKatowice() {
        return this.katowice.withdrawMoney();
    }

    public double withdrawMoneyGdansk() {
        return this.gdansk.withdrawMoney();
    }

    public double getAveragePayementWroclaw() {
        return this.wroclaw.getAveragePayement();
    }

    public double getAveragePayementLodz() {
        return this.lodz.getAveragePayement();
    }

    public double getAveragePayementKrakow() {
        return this.krakow.getAveragePayement();
    }

    public double getAveragePayementKatowice() {
        return this.katowice.getAveragePayement();
    }

    public double getAveragePayementGdansk() {
        return this.gdansk.getAveragePayement();
    }

    public double getAverageWidrawWroclaw() {
        return this.wroclaw.getAverageWidraw();
    }

    public double getAverageWidrawLodz() {
        return this.lodz.getAverageWidraw();
    }

    public double getAverageWidrawKrakow() {
        return this.krakow.getAverageWidraw();
    }

    public double getAverageWidrawKatowice() {
        return this.katowice.getAverageWidraw();
    }

    public double getAverageWidrawGdansk() {
        return this.gdansk.getAverageWidraw();
    }

    public double sumOfAllCashMachines() {
        double sum = getMoneySumWroclaw() + getMoneySumLodz() + getMoneySumKrakow() + getMoneySumKatowice() + getMoneySumGdansk();
        return sum;
    }
}
