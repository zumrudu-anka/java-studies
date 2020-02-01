public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "";
        product.price = 150;
        productManager.add(product);
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
