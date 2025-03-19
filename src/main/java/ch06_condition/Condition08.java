package ch06_condition;

import java.util.Scanner;

/*
    사용자에게 score을 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

    score가 0미만이거나 100초과라면 grade = x
    changedscore = 9 ~ 10, grade = A
    changedscore = 8, grade = B
    changedscore = 7, grade = C
    changedscore = 6 , grade = D
    changedscore = 5,4,3,2,1,0 이면, grade = F

    실행 예
    점수를 입력하세요 >>>
    점수를 100점이고, 학점은 A학점입니다.

    if문을 통해서 9미만 및 100 초과로 걸러내서 grade = x
    나머지 부분에 swutch문을 작성하면 구현이 가능할겁니다.

 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int changedscore = 0;
        String grade = "";
        System.out.println("점수를 입력하세요 >>>");
        score = scanner.nextInt();
        changedscore = score / 10;

        if (score < 0 || score >100) {
            grade = "x";
        } else {
            switch (changedscore){
                case 10:
                    grade = "a";
                    break;
                case 9:
                    grade = "a";
                    break;
                case 8:
                    grade = "b";
                    break;
                case 7:
                    grade = "c";
                    break;
                case 6:
                    grade = "d";
                    break;
                default:
                    grade = "f";
            }
        }
//        if (score < 9) {
//            grade = "x";
//        } else {
//            if (score > 100) {
//                grade = "x";
//            } else {
//                if (changedscore > 8) {
//                    grade = "A";
//                } else if (changedscore > 7) {
//                    grade = "B";
//                } else if (changedscore > 6) {
//                    grade = "C";
//                } else if (changedscore > 5) {
//                    grade = "D";
//                } else {
//                    grade = "F";
//                }
//            }
//
//        }
        System.out.println("당신의 점수는 " + score + "이며, 당신의 학점은 " + grade + "이다.");
    }
}
