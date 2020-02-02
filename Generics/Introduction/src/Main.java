public class Main {

    public static void main(String[] args) {
        myList<String> cities = new myList<String>();
        cities.Add("Ankara");
        myList<Integer> numbers = new myList<Integer>();
        numbers.Add(5);
        myList<Customer> customers = new myList<Customer>();
        customers.Add(new Customer(1,"Zumrudu","Anka"));
    }
}
