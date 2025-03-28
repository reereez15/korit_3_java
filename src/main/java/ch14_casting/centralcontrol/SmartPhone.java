package ch14_casting.centralcontrol;

public class SmartPhone implements Power{
    @Override
    public void on() {
        System.out.println("스마트폰의 전원을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰의 전원을 끕니다.");
    }
    public void touch(){
        System.out.println("스마트폰 터치를 실행합니다.");
    }

}
