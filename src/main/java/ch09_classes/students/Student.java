package ch09_classes.students;
/*
    1. student 클래스의 필드를 정의 하시오.
        1) int studentCode
        2) String name
        3) double score

    2. 기본 생성자를 정의하고, 객체를 생성했을 때
        "기본 생성자로 객체가 생성되었습니다" 라고 출력될 수 있도록 코드를 작성

    3. int studentCode를 매개변수호 하는 매개변수 생성자를 정의하고,
        "int 매개변수 생성자로 객체가 생성되었습니다" 라고 출력되도록 코드를 작성

    4. String name를 매개변수로 하는 매개변수 생성자를 정의하고
        "String 매개변수 생성자로 객체가 생성되었습니다" 라고 출력되도록 코드를 작성

    5. studentCode, name을 매개변수로 하는 매개변수 생성자를 정의하고
        "int, String 매개변수 생성자로 객체가 생성되었습니다" 라고 출력되도록 코드를 작성

    6. studentCode, name, score을 매개변수로 하는 매개변수 생성자를 정의하고
        "int, String, double 매개변수 생성자로 객체가 생성되었습니다" 라고 출력되도록 코드를 작성

    7. studentMain 클래스를 ㅏㅁㄴ들고, 해당 객체명과 속성을 가질 수 있도록 작성
        1) student1 2025001 / 김일 / 4.5 -> 기본생성자
        2) student2 2025002 / 김이 / 100 -> int 매개변수 생성자
        3) student3 2025003 / 김삼 / 95.8 -> String 매개변수 생성자
        4) student4 2025004 / 김사 / 4.0  -> int, String 매개변수 생성자
        5) student5 2025005 / 김오 / 80.7 -> int, String, double 매개변수 생성자

    8. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드를 call1타입으로 정의

    9. 실행 예
        기본 생성자로 객체가 생성되었습니다
        int 매개변수 생성자로 객체가 생성되었습니다
        String 매개변수 생성자로 객체가 생성되었습니다
        int, String 매개변수 생성자로 객체가 생성되었습니다
        int, String, double 매개변수 생성자로 객체가 생성되었습니다

        김일 학생의 정보입니다.
        학번 : 2025001
        이름 : 김일
        점수 : 4.5

        김이 학생의 정보입니다.
        ...

 */
public class Student {
    int studentCode;
    String name;
    double score;

    Student(){
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }
    Student(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다");
        this.studentCode = studentCode;
    }
    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다");
        this.name = name;
    }
    Student(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
    }
    Student(int studentCode, String name, double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
    void shiwInfo() {
        System.out.println(name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
        // System.out.println("점수 : " + score + "\n"); 개행추가
        // System.out.println("\n"+ name + " 학생의 정보입니다."); 개행추가
    }
}
