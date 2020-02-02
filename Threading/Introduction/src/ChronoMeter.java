public class ChronoMeter implements Runnable{
    private Thread thread;
    private String threadName;

    public ChronoMeter(String threadName){
        this.threadName = threadName;
        System.out.println(this.threadName + " Oluşturuldu");
    }

    @Override
    public void run() {
        System.out.println(this.threadName + "Çalıştırıldı");
        try{
            for (int i = 1; i < 11; i++){
                System.out.println(i + " Çalışan Thread -> " + this.threadName);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Kesildi -> " + this.threadName);
        }

        System.out.println("Bitti -> " + this.threadName);
    }
    public void start(){
        System.out.println(this.threadName + "Başlıyor");
        if(this.thread == null){
            this.thread = new Thread(this, this.threadName);
            this.thread.start();
        }
    }
}
