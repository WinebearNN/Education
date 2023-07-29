package xRep.homework;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    private final int MonthsPerYear = 12;

    private Date dateCreate = new Date();


    public Date getDateCreate() {
        return dateCreate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;

    }

    public double getMonthlyInterest() {
        return (((this.annualInterestRate / this.MonthsPerYear) / 100) * this.balance);
    }

    public double withdraw(double money) {
        this.balance -= money;
        return this.balance;
    }

    public double deposit(double money) {
        this.balance += money;
        return this.balance;
    }
    /*Честно не ебу, надо ли было делать вычислительную часть задания в другом классе, но если нет,
    то тогда возникает вопрос - нахуя мне тут геттеры и сеттеры
     */

}

class TestAccount {
    public static void main(String[] args) {
        Account user = new Account(1112, 20000);
        user.setAnnualInterestRate(4.5);
        user.withdraw(2500);
        user.deposit(3000);
        System.out.println(user.getBalance());
        System.out.println(user.getDateCreate());
        System.out.println(user.getMonthlyInterest());
    }


}
