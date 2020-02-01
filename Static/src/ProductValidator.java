public class ProductValidator {
    static {
        System.out.println("Static Yapıcı Çalıştı");
    }
    ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        return false;
    }

    public static class InnerClass{ // Bir class icinde baska bir class static olabilir
        public static void staticMethod(){ // static method icin inner class in da static olmasi lazim.

        }
    }
}
