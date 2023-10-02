package ra.bt3;

public class Main {
    public static void main(String[] args) {
        Playable dt1 = new AudioPlayer();
        dt1.play();
        Playable dt2 = new VideoPlayer();
        dt2.play();
    }
}
