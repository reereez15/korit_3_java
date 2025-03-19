package ch06_condition;

import java.util.Scanner;

/*
    ?? if(Rested if condition sentence)
        if 문 내애 if문이 연속적으로 작성할 수 있습니다

        형식 :
        if (조건문1){
            실행문1
            if (조건문1-a){
                실행문1-a
            } else if(조건식1 - b) {
                실행문1 - b
            } else {
                실행문1-c
            }
        } else if(조건식2) {
            실행문2
            if(조건식2-a) {
                실행문2-a
                } else {
                    실행문2-b
                }
            } else {
                실행문3
        }
 */
public class Condition06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

            score가 0보다 작고 100초과 라면 x
            score 90 ~ 100, grade = A
            score 80 ~ 90, grade = B
            score 70 ~ 80, grade = C
            score 60 ~ 70, grade = D
            score 50 ~ 59, grade = F

            실행 예) #2
            점수를 입력하세요 >>> 92
            입력한 점수는 92점이며 학점은 A학점입니다.
         */
        // 1. Scanner import

        // 2. int score 선언(및 초기화)
        int score = scanner.nextInt();
        // 3. string grade 선언(및 초기화)
        String grade = "";
        // 4. scanner를 입력 받기 위한 안내문 작성
        System.out.println("점수를 입력하세요 >>>");
        score = scanner.nextInt();
        // 중첩 if 사용사례
//        if (score < 0) {
//            grade = "x";
//        } else {            // 예의 조건은 grade >= 0이 됩니다.
//            if (score > 100){
//                grade = "x";
//            }
//        } else{        //이 부분의 조건은 grade>=0 && grade <= 100이 됩니다
//                if (score > 90) {
//                grade = "A";
//                } else if (score > 80) {
//                grade = "B";
//                 } else if (score > 70) {
//                grade = "C";
//                 } else if (score > 60) {
//                grade = "D";
//                 } else {
//                grade = "F" ;
//            }
//        }

        //
        //
        if (score > 100 || score < 0) {
            grade = "X";
        } else {        //이 부분의 조건은 grade>=0 && grade <= 100이 됩니다
            if (score > 90) {
                grade = "A";
            } else if (score > 80) {
                grade = "B";
            } else if (score > 70) {
                grade = "C";
            } else if (score > 60) {
                grade = "D";
            } else {
                grade = "F";


                System.out.println("당신의 점수는 " + score + "점이며, 학점은 " + grade + "입니다.");

            }
        }
    }
}