package ch14_casting.animals;
/*

 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1; // 업캐스팅 # 1
        animal1.makeSound();    // 개가 짖습니다. 재정의 된 method가 호출
//        animal1.fetch();      // 호출 불가 : 당연하게도 animal은 Dog

        dog1.fetch();  // Dog1을 animal1에 대입했다고 해서 dog1이 사라지는건 도 아닐것이다

        Animal animal2 = new Dog();  // 업캐스팅 # 2 -> 얘가 시험에 자주 나옵니다.
        animal2.makeSound();         // 개가 짖습니다. 마찬가지로 재정의된 method 호출

        Animal animal3 = new Animal();
        animal3.makeSound();        // 동물이 소리를 냅니다.

        // instanceof 연산자 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);    // true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);    // true

        // object가 인스턴스이거나 '하위 클래스의 인스턴스인 경우'
        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);    // true
        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);    // true

        System.out.println("----- animal2는 animal1과 사실상 같기 때문에 그러려니하고 animal3 검증합니다");
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);    // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);    // false

        System.out.println("↑ 업캐스팅");
        System.out.println("↓ 다운 캐스팅");
        /*
            다운 캐스팅은 '명시적으로 이루어져야합니다.
            (클래스명)객체명; -> (int)2, 3 과 같은 방식으로
            그래서 이제는 기본 자료형에서 벗어나서 참조 자료형까지 고려하셔야합니다.
         */

        Dog dog2 = (Dog) animal2;   // 다운캐스팅 방법
        dog2.makeSound();
        dog2.fetch();               // animal2는 Animal 클래스에 종속돼있기 때문에
        // Dog의 고유 메서드사용이 불가능 했고(공통 메서드는 재정의된 버전).
        // 지금은 대놓고 Dog 클래스의 객체이기 때문에 .fetch() 사용 가능

        // Dog dog3= (Dog) animal3;   // 빨간줄 안뜨는데 오류 발생
                //dog3.makeSound();         // 얘는 오류가 발생합니다.
                // 문제점 :

                /*
                    애초에 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
                    다운캐스팅이 불가능합니다.

                    즉 이를 막기 위해서는
                 */
                Animal animal4 = new Dog();
                // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야만 합니다.

                // 그렇다면 animal3 사례에서와 같은 오류 발생을 막기 위한 다운 캐스팅은
                // instanceof 연산자를 통한 조건식을 작성함으로써 이루어질 수 있습니다.

                System.out.println("animal4 검증 파트");
                if(animal4 instanceof Dog) {    // 얘가 true라면 animal4는 Dog 클래스와 관련있음
                    Dog dog4 = (Dog) animal4;   // 위의 조건식이 통과되면 다운캐스팅

                    dog4.makeSound();
                    dog4.fetch();
                }

                System.out.println("animal3는 다운캐스팅 안되는거 알았으니까 한 번 안전한 다운캐스팅 도전");
                if(animal3 instanceof Dog) {
                    Dog dog3 = (Dog) animal3;

                    dog3.makeSound();
                    dog3.fetch();
                } else {
                    System.out.println("불가능한 다운캐스팅입니다.");
                }

    }
}
