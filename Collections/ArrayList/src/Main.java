import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        System.out.println(numbers.size());
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        System.out.println(numbers.size());
        numbers.add("Merhaba");
        System.out.println(numbers.size());
        System.out.println(numbers.get(3));
        numbers.set(3, 16);
        System.out.println(numbers.get(3));
        numbers.remove(0);
        System.out.println(numbers.get(2));
        numbers.add("Erzurum");
        for(Object i:numbers){
            System.out.println(i);
        }
    }
}
