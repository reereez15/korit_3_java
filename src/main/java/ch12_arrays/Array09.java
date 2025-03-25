package ch12_arrays;

import java.util.Scanner;

/*
    String[] 선언하고
            1번 학생 이름 : 강수림
            2번 학생 이름 : 기준성
            3번 학생 이름 : 김미진
            4번 학생 이름 : 김준식
            5번 학생 이름 : 문성진
            6번 학생 이름 : 심민호
            7번 학생 이름 : 양지은
            8번 학생 이름 : 유지현
            9번 학생 이름 : 윤현지
            10번 학생 이름 : 이동규
            11번 학생 이름 : 이예성
            12번 학생 이름 : 이정화
            13번 학생 이름 : 전용남
            14번 학생 이름 : 채수원
            15번 학생 이름 : 한영진

    일반 for 문으로 출력(이건 복붙)
    향상된 for문으로 이름만 출력하겠습니다.
 */
public class Array09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>>");
        int indexNum = scanner.nextInt();
        String[] students = new String[indexNum];
        scanner.nextLine();
        //입력 part는 일반 for문
        for (int i = 0 ; i < students.length ; i++){    //students.length == indexNum
            System.out.print((i+1) + "번 학생 등록 : ");
            students[i] = scanner.nextLine();
        }
        //출력 part는 일반 for문 한 번 향상된 for문 한 번 해서 두번 출력됩니다.
        // 일반 for 문
        for (int i = 0 ; i < students.length ; i++){
            System.out.print(students[i] + " ");
        }
        // 향상된 for 문
        for (String student : students){
            System.out.print(student + " ");
        }

    }
}
