package ch18_generic.products;

import java.util.Date;

public class ProductController {
    public static void main(String[] args) {

        Product<String> product = new Product<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD" );
        Product<Double> product1 = new Product<>("Smartphone", 799.99);
        Product<Boolean> product2 = new Product<>("Available", true);
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
    }
}
