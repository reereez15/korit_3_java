package ch12_inheritance;

public class Tiger extends Animal{  //(자식) 클래스명 extends (부모) 클래스명
    // 필드 안쓸겁니다.


    public Tiger() {
        super();
    }

    public Tiger(String animalName) {
        super(animalName);
    }

    public Tiger(int anmalAge) {
        super(anmalAge);
    }

    public Tiger(String animalName, int anmalAge) {
        super(animalName, anmalAge);
    }

    @Override       // 얘가 붙어있다면 해당 메서드는 상속 받은 것
    public String getAnimalName() {
        return super.getAnimalName();       // 키워드 super.메서드명()
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnmalAge() {
        return super.getAnmalAge();
    }

    @Override
    public void setAnmalAge(int anmalAge) {
        super.setAnmalAge(anmalAge);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 움직입니다.");  //여기가 재정의파트
    }

    // Tiger 클래스만의 고유 ㅁ서드
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
