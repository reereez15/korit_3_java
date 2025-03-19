package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            문자열 입력
            next() : 띄어쓰기를 포함하지 않고 입력 받음
            nextLine() : 띄어쓰기를 포함하고 엔터키 기준으로 데이터를 입력 받음

            실행 예
            이름을 입력하세요 >>> 여러분 이름
            주소를 입력하세요 >>> 여러분 주소 (시 / 구 까지 도 / 시 까지)
            나이를 입력하세요 >>> 여러분 나이

            이름 : 여러분 이름
            주소 : 여러분 주소
            나이 : 여러분 나이
            내년 나이 : 여러분 나이 + 1
         */
        Scanner scanner = new Scanner(System.in);

        // 질문 부분 -> System.out.print
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요 >>> ");
        String home = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();
//        System.out.println();                   // 한칸띄우기용
//        System.out.println("\n이름 : " + name);  // 한칸띄우기용
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + home);
        System.out.println("나이 : " + age);
        System.out.println("내년 나이 : " + (age + 1));
    }
}
