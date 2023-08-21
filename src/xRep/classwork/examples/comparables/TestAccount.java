package xRep.classwork.examples.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAccount {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, -3, 5, -1, -9));
//        Collections.sort(list);
//        System.out.println(list);

        Account account1 = new Account(100, AccountStatus.PLATINUM);
        Account account2 = new Account(130, AccountStatus.SIMPLE);
        Account account3 = new Account(70, AccountStatus.VIP);
        Account account4 = new Account(150, AccountStatus.VIP);

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);

        Collections.sort(accounts);

        System.out.println(accounts);
    }

}
