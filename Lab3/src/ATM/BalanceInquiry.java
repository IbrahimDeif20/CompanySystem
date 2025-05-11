package ATM;

import java.util.Scanner;

public class BalanceInquiry extends Transaction {

    String currencyType;
    double USD;
    double EUR;

    public BalanceInquiry(int transactionId) {
        super(transactionId);
    }

    @Override
    public double execute(Account account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency type: ");
        currencyType = sc.nextLine();

        if(currencyType.equals("U")){
            USD = account.balance;
            return USD;
        }
        else if(currencyType.equals("E")){
            EUR = account.balance;
            return EUR;
        }
        else{
            System.out.println("Invalid currency type");
            return 0;
        }

    }
}
