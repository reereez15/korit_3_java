package ch03_operator;
    /*
        논리 연산자

        true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자
        boolean : true / false 구분하는 자료형

        AND(&&) : 금 연산자 T X T = T / T X F = F / F X F = F => 하나라도 false 라면 fales
        OR(ii) : 합 연산자  T X T = T / T X F = T / F X F = F => 하나라도 true 라면 true
        NOT(!) : true 값을 false로, false 값을 true로 역전시키는 연산자
     */

public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println(result1);        // true
        boolean result2 = flag1 && flag2;
        System.out.println(result2);        // false
        boolean result3 = flag2 && flag2;
        System.out.println(result3);        // false

        System.out.println("~~~ ii 연산자 ~~~");

        boolean result4 = flag1 || flag1;
        System.out.println(result4);        // true
        boolean result5 = flag1 || flag2;
        System.out.println(result5);        // true
        boolean result6 = flag2 || flag2;
        System.out.println(result6);        // false

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println(result7);        // true

        boolean result8 = 10 % 3 == 8;      // false
        System.out.println(result8);        // 오늘 마지막 시간 혹은 내일 조건식
    }

}
