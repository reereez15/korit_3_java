package org.example;

import java.util.Scanner;

/*
    BMI 게산기를 작성하시오.

    1. 사용자에게 키(cm)와 몸무게를 입력받으시오.
    2. 수학적 연상을 통해서 BMI지수를 산출하시오.
        BMI 지수 = 몸무게 / 키의 제곱
    3. 18.5 미만은 저체중
       23 미만은 정상
       25 미만은 과체중
       25 이상은 비만
    4. 실행 예
        키(CM)를 입력하세요. >>> 172;
        몸무게(KG)를 입력하세요. >>> 70;
        당신의 BMI는 ??이며, 저체중/정상/과체중/비만 입니다

        와 같이 출력일 수 있도록 작성하시오
 */
public class BmiCalcMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double bmi = 0;
//
//        System.out.println("키(cm)를 입력하세요. >>>");
//        double height = scanner.nextDouble();
//        height = height/100;
//        System.out.println("몸무게(kg)를 입력하세요. >>>");
//        double weight = scanner.nextDouble();
//
//        bmi = weight / (height * height);
//
//        String status;
//        if (bmi < 18.5){
//            status = "저체중";
//        } else if (bmi < 23){
//            status = "정상";
//        } else if (bmi < 25){
//            status = "과체중";
//        } else if (bmi >= 25){
//            status = "비만";
//        } else {
//            status = "잘못된 입력입니다.";
//        }
//
//
//        System.out.println("당신의 BMI는 " + bmi + "이며 " + status + "입니다.");
        // 사용할 class들을 import
//        Scanner scanner = new Scanner(System.in);
//        BmiCalc bmiCalc = new BmiCalc();
//
//        // 사용할 변수 목록 선언 및 초기화
//        double height = 0;
//        double weight = 0;
//        double bmi = 0;
//        String result = "";
//        System.out.println("키(cm)를 입력하세요. >>>");
//        height = 172;
//        System.out.println("몸무게(kg)를 입력하세요. >>>");
//        weight = 70;
//
//
////        System.out.println(bmiCalc.getBmi(height,weight));
//        bmi = bmiCalc.getBmi(height,weight);    // 메서드의 결과값이 bmi
//        result = bmiCalc.getResult(bmi);
////        String result2 = bmiCalc.getResult(bmiCalc.getBmi(height, weight));
//
////        if (bmi < 18.5){
////            status = "저체중";
////        } else if (bmi < 23){
////            status = "정상";
////        } else if (bmi < 25){
////            status = "과체중";
////        } else {
////            status = "비만";
////        }
////
//        System.out.println();
//        System.out.println("당신의 BMI는 " + bmi + "이며 " + result+ "입니다.");

//        이 클래스에 getBmiResult 메서드를 call3()으로 정의 하여
//        bmiCalc.getBmiResult(); 를 호출했을 때
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.getBmiResult();


    }
}
