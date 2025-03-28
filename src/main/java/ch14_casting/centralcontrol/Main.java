package ch14_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체를 생성하겠습니다.
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();

        CentralControl centralControl = new CentralControl(new Power[6]);

        centralControl.addDevice(computer1);    // 업캐스팅이 임시적으로 일어남
        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);
        centralControl.powerOff();


        // Tv class / Speaker / clas르 추가 하여  Power를 ompelemen 받으시고, 메서드
        // 오버레이 하신 다음에
        // mian 배열에 집어넣고,
        //powerOn() / powerOff()

        // 추가된 객체 생성
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();
        SmartPhone smartPhone1 = new SmartPhone();

        centralControl.addDevice(speaker1);
        centralControl.addDevice(tv1);
        centralControl.addDevice(smartPhone1);

        centralControl.powerOn();
        centralControl.powerOff();
        centralControl.displayInfo();
        centralControl.performSpecificMethod();
    }
}
