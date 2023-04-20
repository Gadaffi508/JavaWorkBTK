import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer yusuf = new Customer(1,"Yusuf","Arslan");
        customers.add(yusuf);
        customers.add(new Customer(2,"Eda","Gel"));
        customers.add(new Customer(3,"Pınar","Reyhan"));

        for (Customer customer:customers)
        {
            System.out.println(customer.firstName);
        }
    }
}