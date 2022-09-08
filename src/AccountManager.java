import java.util.HashMap;

public class AccountManager {
    private HashMap<String, Account> accountMap;


    public AccountManager() {

        this.accountMap = new HashMap<>();
    }

    public void addAccount(Account a) {
        accountMap.put(a.accountNumber, a);
    }

    public Account searchAccountByNumber(String accountNumber){
        return accountMap.get(accountNumber);
    }

}
