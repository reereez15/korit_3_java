package ch13_abstraction.Interface;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(ChannelDownButton channelDownButton, ChannelUpButton channelUpButton,
                              PowerButton powerButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이제 저 필드(객체)들을 이용한 메서드 정의
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }
    public void onPressedChannelDownButton(){
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드와 onUpChannelUpButton()
    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton(){
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton(){
        System.out.println(volumeUpButton.onUp());
    }
}
