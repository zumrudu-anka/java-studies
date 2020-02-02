public class Main {

    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Hesap = " + accountManager.getBalance());
        accountManager.deposit(1000);
        System.out.println("Hesap = " + accountManager.getBalance());
        try {
            accountManager.withDraw(750);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = " + accountManager.getBalance());
        try {
            accountManager.withDraw(350);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = " + accountManager.getBalance());

    }
}
