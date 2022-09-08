import java.util.HashMap;

public class CustomerManager {
    private HashMap<String, Customer> customerMap;


    public CustomerManager() {

        this.customerMap = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        customerMap.put(c.customerId, c);
    }

    public Customer searchCustomerById(String customerId){
        return customerMap.get(customerId);
    }


}
