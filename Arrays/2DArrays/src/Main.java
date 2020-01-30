public class Main {

    public static void main(String[] args) {
	    String[][] cityAreas = new String[3][3];
        cityAreas[0][0] = "İstanbul";
        cityAreas[0][1] = "Bursa";
        cityAreas[0][2] = "Bilecik";
        cityAreas[1][0] = "Ankara";
        cityAreas[1][1] = "Konya";
        cityAreas[1][2] = "Kayseri";
        cityAreas[2][0] = "Diyarbakır";
        cityAreas[2][1] = "Şanlıurfa";
        cityAreas[2][2] = "Gaziantep";
        for (String[] cities: cityAreas){
            System.out.println("-------------");
            for (String city : cities){
                System.out.println(city);
            }
        }
    }
}
