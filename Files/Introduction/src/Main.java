import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        writeFile2();
    }
    public static void createFile(){
        File file = new File("src/students2.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu");
            }
            else{
                System.out.println("Dosya Zaten Mevcut!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("src/students.txt");
        if(file.exists()){
            System.out.println("Dosya Adı : " + file.getName());
            System.out.println("Dosya Yolu : " + file.getAbsolutePath());
            System.out.println("Dosya Yazilabilir mi? : " + file.canWrite());
            System.out.println("Dosya Yazilabilir mi? : " + file.canRead());
            System.out.println("Dosya Boyutu(byte) : " + file.length());
        }
    }
    public static void readFile(){
        File file = new File("src/students.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.next();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
    public static void writeFile(){
        FileWriter file = null;
        try {
            file = new FileWriter("src/students2.txt");
            file.write("Nasilsin Hacim");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeFile2(){ // Bu daha tercih edilirmis ???
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("src/students2.txt",true));
            writer.newLine();
            writer.write("İyidir Hacim");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
