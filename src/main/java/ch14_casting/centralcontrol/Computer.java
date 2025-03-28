package ch14_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on(){
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off(){
        System.out.println("컴퓨터의 전원을 끕니다.");
    }
    // 이제 업캐스팅돼서 배열 내부에 있는 각 객체들을 다시
    // 다운 캐스팅 한 후에 고유 메서드들을 호출 시키는 작업을 합니다.
    public void compute() {
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}
