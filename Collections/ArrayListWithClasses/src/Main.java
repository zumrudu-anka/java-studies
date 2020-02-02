import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Osman", "Durdag"));
        customers.add(new Customer(2, "Yusuf", "Kurt"));
        customers.add(new Customer(3, "Emin", "Emin"));
        customers.add(new Customer(4, "Mehmet", "Kara"));
        for (Customer customer : customers){
            System.out.println("Id : " + customer.id);
            System.out.println("FullName : " + customer.firstName + " " + customer.lastName);
            System.out.println("-----------------------------");
        }
        customers.remove(customers.get(0));
        for (Customer customer : customers){
            System.out.println("Id : " + customer.id);
            System.out.println("FullName : " + customer.firstName + " " + customer.lastName);
            System.out.println("-----------------------------");
        }
    }
}
