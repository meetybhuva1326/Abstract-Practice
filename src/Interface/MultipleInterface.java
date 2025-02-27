package Interface;

interface AudioPlayer {
    void play();
}

interface AudioRecorder {
    void record();
}

interface AudioSystem extends AudioPlayer, AudioRecorder {

}

interface FMPlayer {
    void playFM();
}

abstract class BaseMusicSystem implements AudioSystem, FMPlayer {

    @Override
    public void play() {
        System.out.println("Play audio");
    }

    @Override
    public void record() {
        System.out.println("Record audio");
    }

}

class MyMusicSystem extends BaseMusicSystem {

    @Override
    public void playFM(){
        System.out.println("Play FM");
    }

    public void switchOff(){
        System.out.println("Switch off");
    }

}

public class MultipleInterface {

    public static void main(String[] args) {

        MyMusicSystem mSystem = new MyMusicSystem();
        mSystem.play();
        mSystem.record();
        mSystem.playFM();
        mSystem.switchOff();

        AudioPlayer audioPlayer = mSystem;
        audioPlayer.play();

        AudioRecorder audioRecorder = mSystem;
        audioRecorder.record();

        FMPlayer fmPlayer = mSystem;
        fmPlayer.playFM();

        AudioSystem audioSystem = mSystem;
        audioSystem.play();
        audioSystem.record();
    }

}
