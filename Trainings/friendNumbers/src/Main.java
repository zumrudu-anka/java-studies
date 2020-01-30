import java.awt.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 2; i < num1 / 2 + 1 ; i++){
            if(num1 % i == 0){
                sum1 += i;
            }
        }
        for (int i = 2; i < num2 / 2 + 1 ; i++){
            if(num2 % i == 0){
                sum2 += i;
            }
        }
        if(sum1 == num2 && sum2 == num1){
            System.out.println("Friend Numbers");
        }
        else{
            System.out.println("Not Friend Numbers");
        }
    }
}
