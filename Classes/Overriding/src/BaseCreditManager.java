public class BaseCreditManager {
    public double calculate(double amount){
        return amount * 1.18;
    }
    public final void notOverridableMethod(){
        System.out.println("This Method cannot overridable because final keyword using on it");
    }
}
