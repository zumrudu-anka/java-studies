public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        System.out.println(product.getName());
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}