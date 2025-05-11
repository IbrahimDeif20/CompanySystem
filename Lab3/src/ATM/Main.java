package ATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        boolean accountExist = false;
        int last = 0;

        Account account = new Account();
        Deposit deposit = new Deposit(1);
        Withdraw withdraw = new Withdraw(2);
        BalanceInquiry balanceInquiry = new BalanceInquiry(3);
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Press 1 to enter account details");
            System.out.println("Press 2 to enter deposit");
            System.out.println("Press 3 to enter withdraw");
            System.out.println("Press 4 to enter show current balance");
            System.out.println("Press 5 to enter cancel last transaction");
            System.out.println("Press 6 to enter to exit");


            choice = scan.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Please enter a number from 1 to 6");
                continue;
            } if (!accountExist && choice != 1) {
                System.out.println("Please enter account details first.");
                continue;
            }


            switch (choice)
            {
                case 1:
                    account.enterAccountDetails();
                    account.displayAccountDetails();
                    accountExist = true;
                    break;

                case 2:
                    deposit.execute(account);
                    System.out.println("Balance after deposit: " + account.balance);
                    last =1 ;
                    break;

                case 3:
                    withdraw.execute(account);
                    System.out.println("Balance after withdraw: " + account.balance);
                    last = 2;
                    break;

                case 4:
                    balanceInquiry.execute(account);
                    System.out.println("Balance in USD: " + balanceInquiry.USD);
                    System.out.println("Balance in EUR: " + balanceInquiry.EUR);
                    break;

                case 5:
                    if (last == 1) {
                        deposit.rollbackDeposit(account);
                        last=0;
                    } else if (last == 2) {
                        withdraw.rollbackWithdraw(account);
                        last=0;
                    } else {
                        System.out.println("No transaction to cancel");
                    }
                    System.out.println("Balance after rollback: " + account.balance);
                    break;
                case 6:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;

                default:
                    System.out.println("invalid Number! Please choose again");
            }
        }while (choice != 6);
    }

    }

