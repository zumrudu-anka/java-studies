public class Main {

    public static void main(String[] args) {
        try{
            int[] numbers = new int[]{3, 5, 7};
            System.out.println(numbers[5]);
        }
        catch(ArrayIndexOutOfBoundsException exception){    // Birden fazla catch yazilabilir fakat sirayla okunur kod.
            System.out.println(exception.getMessage());     // Hangi exception ilk once denk gelirse o block calisir.
        }                                                   // En kotu ihtimalle en alttaki super sinif nesnesi(Exception) yakalanir.
        catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Her zaman Calisir");
        }
    }
}
