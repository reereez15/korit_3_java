package ch07_Loops;

import java.util.Scanner;

/*
    whlie문과 for문을 섞은 사례

    1퉈 n까지 합을 구하는 반복문   -> for문
    반복하시겠습니까?  Y/N >>> N이 나올 때까지 반복할 것 -> whlie문
 */
public class Loops06 {
    public static void main(String[] args) {

        // 1. scenner import
        Scanner scanner = new Scanner(System.in);
        boolean isEnded = false;
        String answer = "";

        while (isEnded) {
            int n = 0;
            int sum = 0;
            System.out.println("1부터 몇까지의 합을 구하시겠습니까? >>>");
            n = scanner.nextInt();
            // 1부터 n까지의 합을 구하는 for 반복문을 작성하시오.
            for (int i = 1 ; i < n+1 ; i++) {
                sum += i;
            }
            System.out.println("합은 " + sum + "입니다.");

            System.out.println("반복하시겠습니까? Y/N >>>");
            scanner.nextLine();
            answer = scanner.nextLine();
            if(answer.equals("N")) {
                isEnded = true;
            }

        }


    }
}
