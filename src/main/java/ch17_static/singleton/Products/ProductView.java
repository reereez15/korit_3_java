package ch17_static.singleton.Products;

public class ProductView {
    // 정적 변수 선언 -> ProductView 클래스의 instance : 여기에 생성자 대입할 예정
    // 보통 싱글톤 만들거면 정적 변수이름이 instance입니다. -> 시험시 힌트 중 하나
    private static ProductView instance;    // Product 클래스의 instance를 정적 변수 필드

    // private으로 생성자를 선언 -> 싱글톤 패턴시의 중요한 지점
    private ProductView(){
        int counter = 1;
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
    }

    // static 메서드 정의 -> 대부분의 경우 getInstance() -> 시험시 힌트 중 하나
    public static ProductView getInstance(){
        if (instance == null){              // 현재 인스턴스가 없다면 얘가 실행됨
            instance = new ProductView();   // ProductView 객체 생성
        }                                   // 그 생성자를 정적변수인 instance에 대입
        return instance;        // 근데 위의 조건문이 실행 안됐다면 instance != null
    }                           // 이거 때문에 이미 ProductView 객체가 생성되었다는 뜻

    // 이건 정적 메서드가 아니죠 그러면
    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }
    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }

}
