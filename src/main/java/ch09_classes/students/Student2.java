package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(String name, int studentCode) {
        this.name = name;
        this.studentCode = studentCode;
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void shiwInfo() {
        System.out.println("\n" + name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }

}