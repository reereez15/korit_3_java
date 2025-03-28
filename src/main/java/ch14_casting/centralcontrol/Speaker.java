package ch14_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println();
    }

    @Override
    public void off() {
        System.out.println();
    }
    public void changeEqual() {
        System.out.println("스피커의 이퀄라이저를 변경합니다.");
    }
}
