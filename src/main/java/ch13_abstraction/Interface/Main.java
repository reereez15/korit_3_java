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
    }
}
