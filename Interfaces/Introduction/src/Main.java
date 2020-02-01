public class Main {

    public static void main(String[] args) {
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.add();
        OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        oracleCustomerDal.hello();
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
