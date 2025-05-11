package ATM;

import java.util.Scanner;

public class Account {

    int accountNumber;
    String ownerName;
    double balance;

    public Account(){
        this.accountNumber = 0;
        this.ownerName = "";
        this.balance = 0;
    }

    public void enterAccountDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.println("Enter owner name: ");
        ownerName = sc.next();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
    }

    public void displayAccountDetails(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Owner name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}
