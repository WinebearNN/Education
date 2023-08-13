package xRep.homework;

import java.util.Scanner;

public class Account {
    private Account[] accounts = new Account[10];
    private double balance;

    public double getBalance() {
        return balance;
    }

    private int id;
    private static Scanner input = new Scanner(System.in);

    public Account() {
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(10000, i);
        }
    }

    public Account(double balance, int id) {
        this.balance = balance;
        this.id = id;
    }

    public int getMenu() {
        int choice;
        while (true) {
            System.out.println("основное меню");
            System.out.println("1)показать баланс");
            System.out.println("2)снять деньгу");
            System.out.println("3)положить деньга");
            System.out.println("4)выйти");
            System.out.println("введите пункт меню");
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("иди нахуй");
            } else {
                break;
            }
        }
        return choice;
    }

    public void withdraw(int id,double money) {
        accounts[id].balance -= money;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(int id) {
        System.out.println("введите сумму для снятия");
        double money = input.nextDouble();
        if (money < 0) {
            System.out.println("сумма отрицательна");
        } else if (money <= accounts[id].getBalance()) {
            accounts[id].withdraw(id,money);
        } else {
            System.out.println("денег нема");
        }
    }

    public void deposit(int id) {
        System.out.println();
        double money = input.nextDouble();
        if (money >= 0) {
            accounts[id].deposit(money);
        }else{
            System.out.println("операция отклонена: сумма отрицательнеа");
        }
    }

    public static void main(String[] args) {
        Account accountATM = new Account();
        int id;
        while (true) {
            System.out.println("введи id");
            id = input.nextInt();
            if(id<0 || id>9){
                System.out.println("еблан");
                continue;
            }
            while (true){
                int choice =accountATM.getMenu();
                if (choice==1){
                    System.out.println("баланс равен " + accountATM.accounts[id].getBalance());
                }else if(choice==2){
                    accountATM.accounts[id].withdraw(id);
                } else if (choice==3) {
                    accountATM.accounts[id].deposit(id);
                } else if (choice==4) {
                    break;
                }

            }
        }


    }
}



