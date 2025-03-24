package ch00_Review01;
/*
    목표 : 객체지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고,
    이를 Review13Summary 클래스에서 기능을 테스트합니다.

    클래스 설계
    1. 필드
    name -> 캐릭터 이름(공개가능) - 전사
    health -> 체력 -> 읽기만 허용 - 100
    power -> 공격력 -> 같은 패키지만 - 200
    skill -> 스킬이름(자식 클래스만) -> 난무
    exp -> 경험치(외부에서 완전 차단) -> 30

    2. 메서드
    getHealth() -> 체력값을 봔한하는 getter -> public
    atack() -> 공격동작시 "name이 power로 공격!" 출력 -> public
            "name이(가) 경험치 amount을(를) 얻었습니다." -> 두 줄 출력되게.
    heal() -> 체력을 10 회복하고, 현재 체력 출력
                "체력이 10 회복되었습니다. 현재 체력 : health"
    gainExp(int amount) -> call2()유형인데 경험치를 증가시키는 메서드(내부 전용)
        실행 예
        name이 경험치 amount를 얻었습니다.

    3.  Review13Summary 클래스에
            Character character1 = new Character("전사", 25, "난무"),로 생성
    4. 실행 예
        캐릭터 이름 : 전사
        체력 : 100
        전사이(가) 25의 힘으로 공격합니다.
        전사이(가) 경험치 10을(를) 얻었습니다.
        전사의 체력이 회복되었습니다 현재 체력 : 110 -> gainExp에서 로직을 참조 가능

 */
class Character{
    // 필드 선언 -> 접근 지정자는 가이드를 보고 알아서 집어넣으세요
    public String name;
    private int health;
    int power;
    protected String skill;
    private int exp;

    // 생성자
    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100;
        this.exp = 0;
    }

    // getHealth() -> getter
    public int getHealth() {
        return health;
    }
    // attack()
    public void attack(){
        System.out.println(name + "이(가) " + power + "의 힘으로 공격합니다.");
        this.gainExp(10);   // 메서드 내부에서 메서드를 호출한 사례
    }
    // heal() -> call1() 타입으로 작성
    public void heal(){
        health += 10;
        System.out.println(name + "의 체력이 회복 되었습니다. 현재 체력 : " + health);
    }
    // gainExp(int amour)
    private void gainExp(int amour) {
        exp += amour;
        System.out.println(name + "이(가) " + amour + "를 얻었습니다");
    }
}

public class Review13Summary {
    public static void main(String[] args) {
        Character character1 = new Character("전사", 25, "난무");

        // name은 public이기 때문에 직접 참조할 예정.
        System.out.println("캐릭터 이름 : " + character1.name);
        // health는 getter를 통해서 받아올 예정.
        System.out.println("체력 : " + character1.getHealth());
        character1.attack(); //attack만 호출
        character1.heal();
        /*
            전사이(가) 25의 힘으로 공격합니다!
            전사이(가) 경험치를 10얻었습니다. -> attack() 메서드 내에 있는 gainExp(10)이 호출

            class Person {
               private String name;

              public String getName(){
                  return name;
                }

               public void showInfo(){
                System.out.println("이름은 " + this.getName() + "입니다.");
               }
           }
         */
        System.out.println(character1.getHealth() + 1);
    }
}
