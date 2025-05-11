package ATM;

import java.util.Scanner;

public class Deposit extends Transaction implements Rollback {
    double amount;

    public Deposit(int transactionId) {
        super(transactionId);
    }

    @Override
    public double execute(Account account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        amount = sc.nextDouble();
        account.balance += amount;
        return account.balance;
    }

    public void rollbackDeposit(Account account){
        account.balance -= amount;

    }
}
