import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Book", "Kitap");
        dictionary.put("Table", "Masa");
        dictionary.put("Computer", "Bilgisayar");
        dictionary.put("Apple", "Elma");
        dictionary.put("Language", "Dil");
        for (String item : dictionary.keySet()){
            System.out.println("Key: " + item + " Value : " + dictionary.get(item));
        }
        System.out.println(dictionary.size());
        System.out.println(dictionary);
        System.out.println(dictionary.get("Apple"));
        dictionary.remove("Table");
        System.out.println(dictionary);
        System.out.println(dictionary.get("table"));
        dictionary.clear();
        System.out.println(dictionary);
        System.out.println(dictionary.size());
    }
}
