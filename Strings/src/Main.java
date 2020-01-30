public class Main {

    public static void main(String[] args) {
        String message = "      Bugün hava çok güzel.";
        System.out.println(message);
        System.out.println("Eleman Sayısı: " + message.length());
        System.out.println("5. Eleman: " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!     "));
        message = message.concat(" Yaşasın!");
        System.out.println(message);
        System.out.println(message.startsWith("B"));// B harfi ile basliyorsa true dondurur
        System.out.println((message.endsWith("."))); // . ile bitiyorsa true dondurur
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.replace('a','i'));
        System.out.println(message);
        message = message.replace('a','e');
        System.out.println(message);
        System.out.println(message.substring(3));
        System.out.println(message.substring(3,5));
        for (String word : message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
