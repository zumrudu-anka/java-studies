import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Erzurum");
        cities.add("Trabzon");
        cities.add("İstanbul");
        cities.add("Ankara");
        System.out.println(cities);
        for (String i : cities){
            System.out.println(i);
        }
        Collections.sort(cities);
        for (String i : cities){
            System.out.println(i);
        }
    }
}
