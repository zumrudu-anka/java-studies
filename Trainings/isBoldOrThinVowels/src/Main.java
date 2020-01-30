import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        char[] myLetter = new char[letter.length()];
        myLetter = letter.toCharArray();
        for (char i:myLetter){
            if(i == 'a' || i == 'ı' || i == 'o' || i == 'u'){
                System.out.println("Kalın Sesli");
            }
            else{
                System.out.println("İnce Sesli");
            }
        }
    }
}
