package ch16_bean.persons;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일",20);
        Person person2 = new Person("김이");      // final 때문에 필수

        person2.setAge(38);

        System.out.println(person1);
        System.out.println(person2);

        Personlombok person3 = new Personlombok("김삼"); //충돌 때문에 수정
        Personlombok person4 = new Personlombok("김사", 14);

        person3.setAge(17);

        System.out.println(person3);
        System.out.println(person4);

        //이상을 실행시켜봤을 때 person1,2를 불러냈을 때 콘솔창에 찍히는 방식과
        // person3,4 를 불러냈을 때 콘솔창에 찍히는 방식이 다르다는 것을 알 숭 있습니다.
        // 이는 intellij 자체에서의 toString()의 재정의한 default 방식과
        // project lombok 상에서의 tpString() 메서드의 재정의 방식이 차이가 납니다.

        // 그렇다면 Personlombok상에서의 toString()메서드를 우리 입맛대로 수정하고싶다면
        // 어떻게 해야될까요.
//        Personlombok person5 = new Personlombok();    // name 필드의 @NonNull 때문에 오휴 발생한.

        // Personlombok의 toString() 메서드를 수정하여
        // 이름 : 김오
        // 나이 : 14
        // 로 출력될 수 있도록 재정의하시오.
    }
}
