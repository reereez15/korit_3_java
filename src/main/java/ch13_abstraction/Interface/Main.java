package ch13_abstraction.Interface;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton()
    main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.
 */
public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new ChannelDownButton(), new ChannelUpButton(), new PowerButton(),
                new VolumeDownButton(), new VolumeUpButton());
        ACController acController = new ACController(new TempDownButton(), new TempUpButton(), new PowerButton());
        // 전원 on, off
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        // 채널 DOWN
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        // 채널 UP
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        // 음량 DOWN
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        // 음량 UP
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();

        //물론 메인으로 넘어와서 VolumeUpButton을 생성해서 기능을 동작시킬수는 있습니다.
        // VolumeUpButton volumeUpButton = new VolumeUpButton();
        // System.out.println(volumeUpButton.onUp());   //얘가 논리적이진 않은것 같다.
        // 기본적으로는 tvRemoteController의 일부 기능으로 사용하기 위해 field로 쓰겠다.
        System.out.println();
        /*
            과제 TempDownButton, TempUpButton, ACController 파일을 생성하고
            정의하여
            Main에 ACController 객체를 생성하고

            전원이 켜졌습니다.

            온도를 한 칸 내립니다
            온도를 계속 내립니다.

            온도를 한 칸 올립니다.
            온도를 계속 올립니다.

            전원이 꺼졌습니다.
         */
        acController.onPressedPowerButton();
        System.out.println();
        acController.onPressedTempDownButton();
        acController.onDownTempDownButton();
        System.out.println();
        acController.onPressedTempUpButton();
        acController.onUpTempUpButton();
        System.out.println();
        acController.onPressedPowerButton();
    }
}
