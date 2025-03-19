package ch09_classes.products;
/*
    product.java에 여러 가지 생성자를 정의하세요.
    필드는

    int  productNum;
    String  productName;

    메서드

    showInfo() ->  productNum과  productName 정보가 콘솔에 출력되도록 작성

    필드가 두개 이기 때문에 생성자가 만들어질 경우의 수는 네가지

    1. 기본 생성자를 사용하여 객체를 생성하세요  product1
        productNum 123456
        productName LG엘패드
    2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해
        객체를 생성하시오. product2
        productNum 9876564
        productName 다이소충전기
    3. 제품명을 기준으로 입력하는 매개ㅐ변수 생성자를 통해 객체를 생성하시오 product3
        productNum 159357
        productName USB-C 케이블
    4. AllArgsConsrtuctor를 이용하여 객체 생성하시오.product4
        productNum 951753
        productName GF1ip6
    5. 정보를 출력하는 showInfo() (call1타입으로 정의할것)의 콘솔창 결과는 다음과 같습니다/

        실행 예
        시리얼 넘버 : 951753
        재품 타이틀 : GF1ip6
 */
public class ProductsMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(9876564);
        System.out.println(product2.productNum);
        Product product3 = new Product("USB-C 케이블");
        System.out.println(product3.productName);
        Product product4 = new Product(951753,"GF1ip6" );


        product1.productNum = 123456;
        product1.productName = "LG엘패드";
        product2.productName = "다이소충전기";
        product3.productNum = 159357;

        System.out.println();
        product1.showInfo();
        System.out.println();
        product2.showInfo();
        System.out.println();
        product3.showInfo();
        System.out.println();
        product4.showInfo();
    }
}
