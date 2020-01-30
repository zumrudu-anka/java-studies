public class Main {

    public static void main(String[] args) {
        int number1 = 200;
        int number2 = 25;
        int number3 = 26;
        if(number1 >= number2 && number1 >= number3){
            System.out.println("En Büyük Sayı: " + number1);
        }
        else if(number2 >= number3 && number2 >= number1){
            System.out.println("En Büyük Sayı: " + number2);
        }
        else{
            System.out.println("En Büyük Sayı: " + number3);
        }
    }
}
