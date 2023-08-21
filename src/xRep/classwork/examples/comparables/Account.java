package xRep.classwork.examples.comparables;

public class Account implements Comparable<Account> {

    private double balance;
    private AccountStatus status;

    public Account(double balance, AccountStatus status) {
        this.balance = balance;
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "balance=" + balance +
                ", status=" + status;
    }

    @Override
    public int compareTo(Account o) {
        if (this.status.getValue() > o.status.getValue()) {
            return 1;
        }
        if (this.status.getValue() < o.status.getValue()) {
            return -1;
        }
        if (this.status.getValue() == o.status.getValue()) {
            if (this.balance > o.balance) {
                return 1;
            }
            if (this.balance == o.balance) {
                return 0;
            }
            if(this.balance < o.balance) {
                return -1;
            }
        }
        return 0;
    }
}
