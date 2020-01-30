public class Main {

    public static void main(String[] args) {
        char grade = 'E';
        switch (grade) {
            case 'A':
                System.out.println("Çok İyi : Geçtiniz");
                break;
            case 'B':// B ve C durumları için aynı durumu istiyoruz.
            case 'C':
                System.out.println("Başarılı : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız.");
                break;
            default:
                System.out.println("Yanlış Giriş Yapıldı!");
                break;
        }
    }
}
