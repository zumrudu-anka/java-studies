import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 1;
        for (int i = 2; i < number; i++)
        {
            if(number % i == 0){
                total += i;
            }
        }
        if(total == number){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
        sc.close();
    }
}
