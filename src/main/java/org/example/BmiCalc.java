package org.example;
/*
    이하의 코드에 필요한 로직을 작성하고
    BmiCalcMain에 적용하여 -> 여기에 객체도 생성해야하고.
                         -> getBmi라는 메서드도 호출
    동일한 결과값이 나오도록 작성하시오.

    이 클래스에 getBmiResult 메서드를 call3()으로 정의 하여
    bmiCalc.getBmiResult(); 를 호출했을 때
    실행 예)
    키(cm)를 입력하세요 >>>
    몸무게(kg)를 입력하세요 >>>
    당신의 BMI 지수는 ??아며 ??입니다.

            height = height/100;
        bmi = weight / (height * height);


 */
public class BmiCalc {
    public double getBmi(double height, double weight){
        double bmi = 0; // 지역 변수
        bmi = weight / (height * height);
        height = height * 0.01;

        return bmi;
    }

    public String getResult(double bmi){
        String status = "";

        if (bmi < 18.5){
            status = "저체중";
        } else if (bmi < 23){
            status = "정상";
        } else if (bmi < 25){
            status = "과체중";
        } else {
            status = "비만";
        }
        return status;
    }
    public void getBmiResult(){


    }


}
