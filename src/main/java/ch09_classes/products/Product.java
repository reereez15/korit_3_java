package ch09_classes.products;

public class Product {
    int  productNum;
    String  productName;

    Product () {
//        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Product (int productNum) {
//        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.productNum = productNum;
    }
    Product (String title) {
        this.productName = title;
//        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
    }
    Product (int productNum, String productName) {
        this.productName = productName;
        this.productNum = productNum;
//        System.out.println("AllArgsConstructor");
    }
    void showInfo() {
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }
}
