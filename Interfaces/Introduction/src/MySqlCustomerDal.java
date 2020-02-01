public class MySqlCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Müşteri MySql'ye Eklendi");
    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
