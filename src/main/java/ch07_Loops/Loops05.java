package ch07_Loops;

public class Loops05 {
    public static void main(String[] args) {
        // 1교시 1일차 입니다 ~ 3일차 3교시입니다.
//        for (int i = 1 ; i < 6 ; i++) {
//            for (int j = 1 ; j < 4 ; i2++){
//                System.out.println(i + "일차 " + j + "교시입니다." );
//            }
//        }
        // 이상의 코드를 활용하여 구구단을 완성하시오.

//        for (int a = 2 ; a < 10 ; a++){
//            for (int b = 1 ; b < 10 ; b++) {
//                System.out.print(a + "x" + b + "=" + (a * b));
//
//
//            }
//        }

     /*
        1 2 3 4 5 6 7 8 9 10
        .........
        91 92 93 94 95 96 97 98 99 100
     */
        // 반복을 100
//        for (int c = 1 ; c < 101 ; c++){
//            System.out.print(c + " ");
//            if (c % 10 ==0){
//            }
//            System.out.println();
//        }
//

        for (int d = 1 ; d < 101 ; d+= 10 ) {
            System.out.println(d + " " + (d + 1) + " " + (d + 2) + " " + (d + 3) + " " + (d + 4) + " " + (d + 5) + " " + (d + 6) + " " + (d + 7) + " " + (d + 8) + " " + (d + 9) + " " + (d + 10));

        }



    }

}
