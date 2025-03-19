package ch06_condition;
/*
    if - else if - else문

    형식 :
    if(조건문1){
        실행문1
    }else if(조건문2){
        실행문2
    } else if(조건문3){
        실행문3
    } else(조건문4) {
        실행문4
    }
 */
import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        String reting = "";
        System.out.println("당신의 포인트를 입력하세요 >>>>");
        point = scanner.nextInt();
        if(point > 80) {
            reting = "VIP";
        }   else  if (point > VIP_POINT){
            System.out.println("회원의 등급 : GOLD");
        }   else  if (point > GOLD_POINT){
            System.out.println("회원의 등급 : SILVER");
        }   else  if (point > SILVER_POINT){
            System.out.println("회원의 등급 : BRONZE");
        }   else {
            reting = "일반";
        }
        System.out.println("당신의 등급은 : " + reting);
    }
}
