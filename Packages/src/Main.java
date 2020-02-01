import Mathematic.Calculator;
import Mathematic.Logaritma;
// import Mathematic.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Birsey Yaz : ");
        String x = sc.nextLine();
        System.out.println(x);

        Calculator calc = new Calculator();
        System.out.println(calc.summation(4,50));
        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logCalc());
    }
}
