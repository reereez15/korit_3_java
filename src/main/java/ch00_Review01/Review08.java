package ch00_Review01;
/*
    Constructor(생성자) : 객체가 생성될 때 호출되는 특별한 메서드
    특징 :
        1) 클래스명과 생성자 명은 동일
        2) 기본 생성자 / 매개변수 생성자
            a. 기본생성자 : 정의하지 않아도 defult로 있지만.
                생성자를 하나라도 정의하는 순간 기본 생성자도 적어야됨
            b. 매개변수 생성자 : 객체를 생성할 때 필수적으로 요구되어지는
                속성을 명시한 생성자
        3) return이 없다. call1()이거나(기본생성자) / call2()거나(매개변수 생성자)
        4) 형식
            a.기본생성자
                클래스명(){}
            b. 매개변수 생성자
                클래스명(매개변수1,매개변수2){
                this.매개변수1 = 매개변수1;
                this.매개변수2 = 매개변수2;
            }
        생성방법
            1) 일일이 타이핑한다.
            2) 햄버거 -> code -> generate한다
            3) alt + ins 한다.

 */
class  Building {
    // 필드 선언
    boolean elevator;
    boolean stair;
    int wall;
    int door;
    int window;
    String title;


    public Building (){
    }
    public Building(String title){
        this.title = title;
    }
    public Building(boolean elevator, boolean stair, int wall, int door, int window, String title){
        this.elevator = elevator;
        this.stair = stair;
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.title = title;
    }
    void showInfo(){
        System.out.println("이 건물은 " + title + "이고," + "벽이 " + wall + "개, 문이 " + door + "개, 창문이 " + window + "개 있습니다"  );
        System.out.println("엘리베이터 유무 : " + elevator);
        System.out.println("계단 유무 : " + stair);
    }

}

    // 기본 생성자 정의

    // 이름만 있는 매개변수 생성자 정의

    // 전부 다 있는 매개변수 생성자 정의

    /*
        Review08 클래스에서 Building 클래스의 객체를 생성
        1. building1 -> 기본생성자로 정의
            엘리베이터 - 없음
            계단 - 없음
            벽 - 5
            문 - 2
            창문 - 6
            이름 - 재팬아이티타운
        2. building2  -> 이름만 있는 생성자로 정의.
            엘리베이터 - 있음
            계단 - 있음
            벽 - 8
            문 - 4
            창문 - 230
            이름 - 코리아아이티타운
        3. building3  -> 전부 다 사용한 매개변수 생성자로 정의
            엘리베이터 - 없음
            계단 - 있음
            벽 - 3
            문 - 1
            창문 - 0
            이름 - 컴퓨터 타운
        4. showInfo() 메서드를 정의 -> call1() 유형으로 정의
        building4.showInfo(); 와 같은 방식으로 호출
        실행 예
        이 건물은 컴퓨터타운이고, 벽이 3개, 문이 1개, 창문이 0개 있습니다.
        엘리베이터 유무 : false
        계단 유무 : true
     */


public class Review08 {
    public Review08() {
    }
    public static void main(String[] args) {
        Building building = new Building();
        Building building2 = new Building("코리아아이티타운");
        Building building3 = new Building(false, true, 3, 1, 0,"컴퓨터 타운");

        building.elevator = false;
        building.stair = false;
        building.wall = 5;
        building.door = 2;
        building.window = 6;
        building.title = "재팬아이티타운";

        building2.elevator = true;
        building2.stair = true;
        building2.wall = 8;
        building2.door = 4;
        building2.window = 230;
//        building2.title = "코리아아이티타운";

//        building3.elevator = false;
//        building3.stair = true;
//        building3.wall = 3;
//        building3.door = 1;
//        building3.window = 0;
//        building3.title = "컴퓨터타운";

        building.showInfo();
        building2.showInfo();
        building3.showInfo();
    }
}
