package ch12_inheritance;

public class Animal {
    // 필드 생성
    private String animalName;
    private int anmalAge;

    // 생성자 자동 생성하세요.

    public Animal() {
    }
    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public Animal(int anmalAge) {
        this.anmalAge = anmalAge;
    }
    public Animal(String animalName, int anmalAge) {
        this.animalName = animalName;
        this.anmalAge = anmalAge;
    }
    // setter / getter 자동 생성하세요
    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public int getAnmalAge() {
        return anmalAge;
    }
    public void setAnmalAge(int anmalAge) {
        this.anmalAge = anmalAge;
    }

    // 자동 생성 말고 사용할 메서드 하나 정의
    public void move(){
        System.out.println("움직입니다.");
    }
}
