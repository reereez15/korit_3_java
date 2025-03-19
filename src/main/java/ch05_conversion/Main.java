package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        /*
            Conversion 형변환 -> 용향 상의 문제로 일어나는 이슈를 해결하기 위해서 사용.

            1) upcosting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것
         */
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);        // 65 -> 시험에 자주나옴
        // 업캐스팅 방법 # 1
        // 형병환을 하기 위해서는 '(바꿀데이터타입)변수명' 으로 작성하시면 됩니다.
        System.out.println("변형 : " + (int)cast1);

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);

        // 업캐스팅 방법 #2
        char cast3 = 'b';
        // 새로운 변수를 선언하여 집어넣는 방법입니다.
        int cast4 = cast3;

        // 2) downcasting 다운캐스팅 : 더 적은 용향의 자료형으로 변환시키는 것
        int cast5 = 99;
        int cast6 = 100;
        // 지시 사항 : 다운캐스팅하는 방법을 업캐스팅 방법 #1, 2를 이용하여 char형으로
        //바꾼 후, 콘솔창에 원형과 변형을 모두 출력하시오.

        // 다운캐스팅 #1
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + (char)cast5);
        // 다운캐스팅 #2
        char cast7 = (char)6;
        /*
            추후 수업 예정이긴 한데, 간단하게 말씀드리자면
            upcasting의 경우는 메모리 용량이 커지기만 하면 기존 데티어가 변형이 일어나지는
            않기 때문에 임시적(implicit)으로 변형이 가능한 반면
            downcasting의 경운에는 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 되는 경우가 있습니다.
            용량 오버에 해당하는 현상을 미리 점검하기 위해 다운 캐스팅 시에는 명시적(explicit)으로만
            변형이 가능합니다.
         */


    }
}
