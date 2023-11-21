package pij.day16;

public class BankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance = balance + money;
    }

    public int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }
}
