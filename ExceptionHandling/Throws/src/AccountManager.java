public class AccountManager {
    private double balance = 0;
    public void deposit(double amount){
        balance += amount;
    }
    public void withDraw(double amount) throws BalanceInsufficientException {
        if(balance > amount){
            balance -= amount;
        }
        else{
            throw new BalanceInsufficientException("Bakiye Yetersiz");
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
