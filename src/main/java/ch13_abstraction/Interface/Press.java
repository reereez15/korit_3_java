package ch13_abstraction.Interface;

public interface Press {

    String NAME = "button";
    // interface이기 때문에 변수 앞에서 접근 지정자를 명시하지 않았음
    /*
        public final이 생략되어있습니다. 또한 상수이기 때문에 대문자로
        변경해두었고, 일반 클래스의 경우처럼 Strinf name; 이 불가능합니다.
        초기화가 핈구

        그래서 안되는것들 쭉 나열하겠습니다.
     */
//    String name;
//    public Press();   -> 인터페이스라서 생성자 생성이 불가능.
//    void popOut (){
//        System.out.println("추상 메서드x 일반 메서드 o");
//    }

    // 되는 거
    void onPressed();

    // interface인 Up.java /  Down.java를 생성하시고
    // void 형태인 onUp() / onDown() 메서드를 선언하시오.

}
