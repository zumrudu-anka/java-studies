public class Main {

    public static void main(String[] args) {
        double[] myList = {16.3, 3.4, 39.1, 3.9};
        double total = 0;
        double max = Double.MIN_VALUE;
        for (double number : myList) {
            if(max < number){
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Total: " + total);
        System.out.println("Max: " + max);

    }
}
