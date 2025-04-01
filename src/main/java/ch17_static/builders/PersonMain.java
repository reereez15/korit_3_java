package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체인 person1을 만든다고 가정하면
//        Person person1 = new Person("안근수", 38, "부산");
        Person person1 = new Person.Builder()
                .name("김일")
                .age(24)
                .address("울산")
                .build();
        System.out.println(person1);
    }
}
