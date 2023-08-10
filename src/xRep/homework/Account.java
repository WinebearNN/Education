package xRep.homework;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private double balance = 10000;
    private double annualInterestRate = 0;

    private final int monthsPerYear = 12;

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


    public Account() {

    }


    public double getMonthlyInterest() {
        return (((this.annualInterestRate / this.monthsPerYear) / 100) * this.balance);
    }

    public double withdraw(double money) {
        this.balance -= money;
        return this.balance;
    }

    public double deposit(double money) {
        this.balance += money;
        return this.balance;
    }

    private int tempId;
    private int[] id = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    public Account(int id) {
        this.tempId = id;
    }

    public boolean checkId() {
        int count = 0;
        for (int i : this.id) {
            if (this.tempId == i) {
                count += 1;
            } else {
                continue;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

}

//class TestAccount {
//    public static void main(String[] args) {
//        Account user = new Account(1112, 20000);
//        user.setAnnualInterestRate(4.5);
//        user.withdraw(2500);
//        user.deposit(3000);
//        System.out.println(user.getBalance());
//        System.out.println(user.getDateCreate());
//        System.out.println(user.getMonthlyInterest());
//    }
//}
class TestAccount {
    public static void main(String[] args) {
        for (int j = 0; j < 999; j++) {
            for (int i = 0; i < 999; i++) {
                System.out.println("Введите id");
                Scanner s = new Scanner(System.in);
                int id = s.nextInt();
                Account acc = new Account(id);
                if (!acc.checkId()) {
                    System.out.println("неправильно набран id");
                } else {
                    System.out.println("Введите 1 для просмотра баланса");
                    System.out.println("Введите 2 для снятия денег со счета");
                    System.out.println("Введите 3 для внесения денег на счет");
                    System.out.println("Введите 4 для выхода из основного меню");
                    int step = s.nextInt();
                    if (step == 1) {
                        System.out.println(acc.getBalance());
                        break;
                    }
                    if (step == 2) {
                        System.out.println("Введите сумму для снятия");
                        int money = s.nextInt();
                        acc.withdraw(money);
                        System.out.println("Баланс");
                        System.out.println(acc.getBalance());
                        break;
                    }
                    if (step == 3) {
                        System.out.println("Введите сумму для пополнения");
                        int money = s.nextInt();
                        acc.deposit(money);
                        System.out.println("Баланс");
                        System.out.println(acc.getBalance());
                        break;
                    }
                    if (step == 4) {
                        break;
                    }
                    i--;
                    j--;
                }
            }
        }
    }
}
