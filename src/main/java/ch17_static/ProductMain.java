package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        // 정적 메서드의 호출
        System.out.println(Product.getCount());

        // 객체 생성
        Product product1 = new Product();

        // count / instanceCount 값 확인
        System.out.println(Product.getCount());         // 정적 메서드
        System.out.println(product1.getInstnceCount()); // 일반 메서드

        // 객체 생성
        Product product2 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product2.getInstnceCount());

        System.out.println("product1 : " + product1.getInstnceCount());

        Product product3 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product3.getInstnceCount());
        Product product4 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product4.getInstnceCount());
        Product product5 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product5.getInstnceCount());
        Product product6 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product6.getInstnceCount());
        Product product7 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product7.getInstnceCount());
        Product product8 = new Product();
        System.out.println(Product.getCount());
        System.out.println(product8.getInstnceCount());

        // 룸북을 사용하지 않은 getTitle()
        System.out.println(Product.getTitle());     // 클래스명.메서드명()으로 static 메서드 호출
        // ch08_method에서는 왜 call1()으로 호출할 수 있었는지에 대한 답변이 필요함.

    }
}
