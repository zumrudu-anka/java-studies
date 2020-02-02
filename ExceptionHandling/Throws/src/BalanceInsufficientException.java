public class BalanceInsufficientException extends Exception {
    private String message;
    public BalanceInsufficientException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
