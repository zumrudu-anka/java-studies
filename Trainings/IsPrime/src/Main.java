import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < x / 2 + 1; i++){
            if(x % i == 0){
                isPrime = false;
            }
        }
        if(!isPrime){
            System.out.println("Sayı Asal Değil!");
        }
        else{
            System.out.println("Sayı Asal!");
        }
    }
}
