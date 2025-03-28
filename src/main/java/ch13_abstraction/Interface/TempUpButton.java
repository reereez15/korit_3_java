package ch13_abstraction.Interface;

public class TempUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "온도를 계속 " + super.onUp();
    }
}
