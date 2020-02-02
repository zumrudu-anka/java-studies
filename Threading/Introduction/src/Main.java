public class Main {

    public static void main(String[] args) {
        ChronoMeter chronoMeter = new ChronoMeter("Thread1");
        ChronoMeter chronoMeter2 = new ChronoMeter("Thread2");
        ChronoMeter chronoMeter3 = new ChronoMeter("Thread3");
        chronoMeter.start();
        chronoMeter2.start();
        chronoMeter3.start();
    }
}
