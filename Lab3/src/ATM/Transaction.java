package ATM;

public abstract class  Transaction {
    int transactionId;

    public Transaction(int transactionId) {
        this.transactionId = transactionId;
    }

    public abstract double execute(Account account);
}
