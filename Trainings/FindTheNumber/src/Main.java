import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i:numbers){
            if(i == x){
                System.out.println("Finded!");
            }
        }
    }
}
