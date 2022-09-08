public class Account {
    String accountHolderName;
    String accountNumber;
    int balance = 1000;

    public Account(String accountNumber,String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public Account( String accountNumber, String accountHolderName, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(){

    }
}
