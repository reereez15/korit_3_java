package ch15_objects.Teacher;

import ch15_objects.teacher;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    //AllArgsConstructor
    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    // toString을 override하여
    // 누구누구선생님의 근무지는 무슨무슨 학교입니다.
    // 로 출력될 수 있게끔 재정의 하시오.

    @Override
    public String toString() {
        return name + "선생님의 근무지는 " + schoolName + " 학교입니다.";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        teacher teacher = (teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
