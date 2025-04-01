package ch18_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date(); // java 내장 클래스로 객체 생성

        ResponseData<String> responseData1 =
                new ResponseData<>("날짜 저장 성공", now.toString());
        ResponseData<Integer> responseData2 =   // Integer<< 사용 이유 = 클래스 타입이기 때문(int는 일반 자료형)
                new ResponseData<>("나이 표시 : ", 38);
        ResponseData<Date> responseData3 =
                new ResponseData<>("날짜 객체 저장 성공", now);
        System.out.println(responseData1);
        System.out.println(responseData2);
        System.out.println(responseData3);
    }
}
