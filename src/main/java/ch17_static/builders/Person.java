package ch17_static.builders;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    // 기존 생성자의 코드들(1 12 13 123 2 23 3 )이 코드 낭비도 심하고 실제로 쓰일지에 대한 확신도 없어서
    // 빌더 패턴이 생겨났다.

    // 빌더 패턴
    private Person(Builder builder){    // argument 대입이 아니라
        // builder 객체의 속성값을 그대로 Person 생성자에 대입하여
        // Person 객체를 생성하겠다는 의미. private이라서
        // builder를 통해서만 객체 생성이 가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    // 객체를 생성하는 main 단계에서 일반 생성자가 아니라
    // Builder를 통해 Person 객체를 생성할 거라서

    public static class Builder{
        private String name;
        private int age;
        private String address;

        // 이하의 코드는 일단 method에 해당
        // 대부분의 경우 동사는 행위를 나타내기 때문에 동사로 작성되지만
        // Builder 패턴의 경우 대입될 필드의 이름과 동일한
        // 메서드 명을 짓습니다.
        // 즉, Builder.name("안근수"); 와 같은 식으로 코드 작성이 되며,
        // 이 Person 객체는 name에 "안근수" 라는 속성값을 갖게 됩니다.
        public Builder name(String name){
            this.name = name;
            return this;
        }
        // Builder.name("안근수").age(38); << 체이닝 메서드
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        // 이상의 코드까지는 필드에 속성값을 집어넣는 메서드들이였습니다.

        public Person build(){
            return new Person(this);
        }

    }

}
