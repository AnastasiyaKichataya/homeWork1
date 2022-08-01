package com.test;

public class Deposit {
    String currency = "RUB";
    double percent;
    int period;
    public Deposit(int period, double percent) {
        this.period = period;
        this.percent = percent;
    }

    public double calculateProfit(int amount) {
        double income;
        income = (amount * percent * period / 365) / 100;
        return income;
    }
}
