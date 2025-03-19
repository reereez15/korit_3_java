package ch06_condition;
/*
    if - else문 : if 다음에 있는 조건식이 true 일때는 if 문 내의 {} 실행문이
                 실행 / false인 경우에는 else에 딸린 {} 실행문이 실행
    형식 :
    if(조건식) {
         실행문1
     } else{            // else의 경우 if가 false 일때만 실행되기 때문에
        실행문2          // 별도의 조건식이 존재하지 않습니다.
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num = -10;
        if ((num < 0)){
            System.out.println("num은 음수입니다.");
        } else {
            System.out.println("num은 0이거나 음수입니다.");
        }




    }
}
