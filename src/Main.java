import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Customer c1 = new Customer("12","ABC");
        Customer c2 = new Customer("34","DEF");
        Customer c3 = new Customer("56","GHI");
        Customer c4 = new Customer("78","JKL");

        CustomerManager cm = new CustomerManager();
        cm.addCustomer(c1);
        cm.addCustomer(c2);
        cm.addCustomer(c3);
        cm.addCustomer(c4);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer ID to search ");
        Customer result = cm.searchCustomerById(scanner.nextLine());
        System.out.printf("Customer ID: %s,  Customer name: %s \n", result.customerId, result.customerName);




        Account a1 = new Account("12","ABC");
        Account a2 = new Account("34","DEF", 800);
        Account a3 = new Account("56","GHI", 500);
        Account a4 = new Account("78","JKL",900);

        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(a1);
        accountManager.addAccount(a2);
        accountManager.addAccount(a3);
        accountManager.addAccount(a4);

        System.out.println("Enter account number to search ");
        Account account = accountManager.searchAccountByNumber(scanner.nextLine());
        System.out.printf("Account number: %s,  Account : %s,  Balance: %d\n",
                account.accountNumber,account.accountHolderName, account.balance);

    }
}
