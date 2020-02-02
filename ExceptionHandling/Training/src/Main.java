import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
             reader = new BufferedReader(new FileReader("C:\\Users\\AnkA\\Studies\\Java\\JavaStudies\\ExceptionHandling\\Training\\src\\numbers.txt"));
             String line = null;
             while((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
             }
             System.out.println(total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
