package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "김일";
        String strExample2 = new String("김일");

        boolean result1 = strExample1 == strExample2;
        System.out.println(result1);    // false
        boolean result2 = strExample1.equals(strExample2);
        System.out.println(result2);    // true

        ObjectTest objectTest1 = new ObjectTest("울산","김일" );
        objectTest1.displayInfo1();

        // objectTest2 객체를 기본 생성자로 만드시고.
        // setter 를 통해서 여러분 이름과 여러분 주소를 입력하신 후에.
        // displayInfo2()를 call3 유형으로 작성해서
        // 콘솔에서 displayInfo1() 과 동일한 경과값이 나오도록 작성하세요.
        ObjectTest objectTest2 = new ObjectTest("울산", "김준식");
        System.out.println(objectTest2.displayInfo2());

        System.out.println(objectTest2);

    }
}
