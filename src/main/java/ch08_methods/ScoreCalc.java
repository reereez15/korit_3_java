package ch08_methods;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균을 내는 프로그램을 구현할 예정
 */
public class ScoreCalc {







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double avg = 0.0;
        int numOfSubs = 0;

        //3과목의 점수를 입력 받고, 총합과 평균 점수를
        //콘솔창에 출력하시오.

        // 실행 예
        // 몇 과목의 점수를 입력하시겠습니까? >>> 3
        // 1 과목의 점수를 입력하세요 >>> 100
        // 2 과목의 점수를 입력하세요 >>> 90
        // 3 과목의 점수를 입력하세요 >>> 95
        // 총합은 285.0점이며, 평균은 95.0점입니다.

//        System.out.println("몇 과목의 점수를 입력하시겠습니까? >>>");
//        numOfSubs = scanner.nextInt();
//        System.out.println("1 과목의 점수를 입력하세요 >>>");
//        sum += scanner.nextDouble();
//        System.out.println("2 과목의 점수를 입력하세요 >>>");
//        sum += scanner.nextDouble();
//        System.out.println("3 과목의 점수를 입력하세요 >>>");
//        sum += scanner.nextDouble();
//        avg = sum / 3;
//        System.out.println("총합은 " + sum + "점이며, 평균은 " + avg + "입니다.");

        // 이상의 코드를 기준으로 필요한 부분을 반복문으로 바꾸는 refactoring을 작성하시오.

        System.out.println("몇 과목의 점수를 입력하시겠습니까? >>>");
        numOfSubs = scanner.nextInt();
        for (int i = 0 ; i < numOfSubs ; i++) {
            System.out.println((i+1) + " 과목의 점수를 입력하세요 >>>" );
            sum += scanner.nextDouble();
        }
        avg = sum / numOfSubs;
        System.out.println("총합은 " + sum + "점이며, 평균은 " + avg + "입니다.");
    }
}
