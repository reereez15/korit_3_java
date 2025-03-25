package ch12_arrays;

/*
    1. clacSum / calcAvg 메서드를 완성하고, main 단계의 메서드 호출 부분을 수정해서
    실행 예
    총합 : 몇점
    평균 : 몇점
 */
public class Array06 {

    // 총합을 구하는 메서드
    private int calcSum(int[] scores){
        int sum = 0;
        for (int i = 0 ; i < scores.length ; i++){
            sum += scores[i];
        }
        return sum;
    }
    // 평균을 구하는 메서드
    private double calcAvg(int[] scores){
//        int sum = 0;
        int sum = calcSum(scores);
        double avg = 0;

//        for (int i = 0 ; i < scores.length ; i++){
//            sum += scores[i];
//        }
//        보니까 이 부분이 calcSum과 반복 -> 그리고 이 연산의 결과가 sum
//        sum = calcSum(scores);
        avg = (double) sum / scores.length;
        System.out.println("총합 : " + sum);
        return avg;
    }
    // 등급 인원수를 구하는 메서드 -> 얘는 call3()
    private void countGrade(int [] scores){
        int[] grade ={0, 0, 0, 0, 0};
        for (int i = 0 ; i < scores.length ; i++){
            if (scores[i] > 89){
                grade[0]++;
            }else if (scores[i] > 79){
                grade[1]++;
            }else if (scores[i] > 69){
                grade[2]++;
            } else if (scores[i] > 59) {
                grade[3]++;
            }else {
                grade[4]++;
            }
        }
        System.out.println("A학점 인원 수 : " + grade[0]);
        System.out.println("B학점 인원 수 : " + grade[1]);
        System.out.println("C학점 인원 수 : " + grade[2]);
        System.out.println("D학점 인원 수 : " + grade[3]);
        System.out.println("F학점 인원 수 : " + grade[4]);
    }
//    public void printTotalInfo(int[] scores){       // 내가 만든 코드<<
//        //얘만 실행시키면 합계도 나오고 평균도 나오고, A~F 인원수도 다 나오게 만드시오.
//        Array06 array06 = new Array06();
//        int total = array06.calcSum(scores);
//        System.out.print("총합은 : " + total);
//        double avgScore = array06.calcAvg(scores);
//        System.out.println("평균은 : " + avgScore);
//        array06.countGrade(scores);
//    }
    public void printTotalInfo(int[] scores){ // 강사님 코드 <<
        //얘만 실행시키면 합계도 나오고 평균도 나오고, A~F 인원수도 다 나오게 만드시오.
        System.out.println("총합 : " + calcSum(scores));
//        double avgScore = calcAvg(scores);
        /*
            왜 이런 코드를 작성했는지(기교) :
            calcAvg는 내부에 calcSum을 호출합니다.
            그렇기 때문에 calcAvg내부에 sout(sum)을 작성해두면
            calcAvg을 호출했을 때 sout(sum)도 같이 나올 수 있다는 점을 위에서
            교육상 작성해뒀을 뿐
            평균을 구하는 메서드가 합을 출력하게 된다면 가독성 자체는 해치게 됩니다.

            이런 방법도 있다는 것만 알아두시면 될거같습니다
         */
        System.out.println("평균 : " + calcAvg(scores));
        countGrade(scores);
    }

    public static void main(String[] args) {
        // Arrays06 클래스의 메서드를 호출하기 위한 객체 생성
        Array06 arrays06 = new Array06();
        // 점수 데이터를 사전에 마련해놓겠습니다
        int[] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89};
//
//        int total = arrays06.calcSum(scores);   // 합구하는 메서드
//        System.out.print("총합은 : " + total);
//        double avgScore = arrays06.calcAvg(scores);   // 평균을 구하는 메서드 호출
//        System.out.println("평균은 : " + avgScore);
//        arrays06.countGrade(scores); // A 인원수...F 인원수를 구하는 메서드 호출

        arrays06.printTotalInfo(scores);

    }
}
