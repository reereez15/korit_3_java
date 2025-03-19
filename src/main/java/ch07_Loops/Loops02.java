package ch07_Loops;
/*
    중첩 whlie문
    whlie(조건식1) {
        반복실행문1-a
        whlie(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
 */
public class Loops02 {
    public static void main(String[] args) {
//        int day = 1;
//        int lessen = 1;
//        // 1일차 1교시입니다. ~1일차 3교시입니다./ 5일차 3교시입니다.
//        while (day < 6){
//            while (lessen < 4){
//                System.out.println(day + "일차 " + lessen + "교시입니다.");
//                lessen++;
//            }
//            day++;
//        }
        // 이상의 코드를 응용하여
        /*
            2 x 1 = 2
            2 x 2 = 4
             ....
            9 x 9 = 81
         */
        int a = 2;
        while (a < 10){
            int b = 1;
            while (b < 10){
                System.out.println(a + "x" + b + "=" + (a * b));
                b++;
            }
            a++;
        }

    }
}
