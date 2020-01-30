import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    findNumber();
	    sum(4,6,7,8,8);
    }

    public static void findNumber(){
        Scanner sc = new Scanner(System.in);
        int numberForSearch = sc.nextInt();
        int[] numbers = {1,2,3,5,16};
        boolean isFound = false;
        for (int number: numbers){
            if(number == numberForSearch){
                isFound = true;
            }
        }
        showResult(isFound);
    }
    public static void showResult(boolean isFound){
        if(isFound){
            System.out.println("The Number Found!");
        }
        else{
            System.out.println("The Number Not Found!");
        }
    }
    public static int sum(int... numbers){ // Variable Arguments // Integer dizi vermiş gibi olduk.
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}
