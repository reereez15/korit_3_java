package ch13_abstraction.Interface;

public class VolumeDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 내립니다.");
    }
    @Override
    public void onDown() {
        System.out.println("음량을 계속 내립니다.");
    }
}
