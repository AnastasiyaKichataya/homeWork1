package com.test;

public class MoneyStrategy {
    public static void main(String[] args) {


        Money myMoney = new Money(5000000);

        Deposit lucky = new Deposit(365, 75.5);

        double income = lucky.calculateProfit(myMoney.amount);

        increaseMoney(myMoney.amount, income);

    }

    public static void increaseMoney(int amount, double income){
        if ( amount < 1000000) {

            System.out.println("Дохода нет");
        }
        else {
            System.out.println("Ваш доход составляет:" + income);
        }

    }


}
