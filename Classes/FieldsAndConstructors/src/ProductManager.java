public class ProductManager {
    Product[] products;
    int productCount;
    public ProductManager(){
        this.productCount = 0;
    }
    public void Add(Product product){
        this.productCount++;
        if(this.productCount == 1){
            this.products = new Product[1];
            this.products[0] = product;
        }
        else{
            //.........
        }
        System.out.println("Ürün Eklendi: " + product.getName());
    }
}
