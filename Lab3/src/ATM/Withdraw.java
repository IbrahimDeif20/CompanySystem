package ATM;

import java.util.Scanner;

public class Withdraw extends Transaction implements Rollback {
    double amount;

    public Withdraw(int transactionId) {
        super(transactionId);
    }

    @Override
    public double execute(Account account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        amount = sc.nextDouble();

        if(account.balance >= amount){
            account.balance -= amount;
            return account.balance;
        }
        else{
            System.out.println("Insufficient balance");
            return 0;
        }
    }

    public void rollbackWithdraw(Account account){
        account.balance += amount;
    }
}
