package xRep.homework;

import java.util.Scanner;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    private int id;
    private static Scanner input = new Scanner(System.in);



    public Account(double balance, int id) {
        this.balance = balance;
        this.id = id;
    }

    public static int getMenu() {
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

    private void withdraw(double money) {
        this.balance -= money;
    }

    private void deposit(double money) {
        this.balance += money;
    }

    public void withdraw() {
        System.out.println("введите сумму для снятия");
        double money = input.nextDouble();
        if (money < 0) {
            System.out.println("сумма отрицательна");
        } else if (money <= this.getBalance()) {
            this.withdraw(money);
        } else {
            System.out.println("денег нема");
        }
    }

    public void deposit() {
        System.out.println("Введите сумму для пополнения");
        double money = input.nextDouble();
        if (money >= 0) {
            this.deposit(money);
        }else{
            System.out.println("операция отклонена: сумма отрицательнеа");
        }
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        int id;
        for(int i=0;i<accounts.length;i++){
            accounts[i]=new Account(10000,i);
        }
        while (true) {
            System.out.println("введи id");
            id = input.nextInt();
            if(id<0 || id>9){
                System.out.println("еблан");
                continue;
            }
            while (true){
                int choice =Account.getMenu();
                if (choice==1){
                    System.out.println("баланс равен " + accounts[id].getBalance());
                }else if(choice==2){
                    accounts[id].withdraw();
                } else if (choice==3) {
                    accounts[id].deposit();
                } else if (choice==4) {
                    break;
                }

            }
        }


    }
}



