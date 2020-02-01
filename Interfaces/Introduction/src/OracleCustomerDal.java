public class OracleCustomerDal extends MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Müşteri Oracle'ye Eklendi");
    }
}
