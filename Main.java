public class Main {
    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer();
        mp.play();
        mp.pause();
        mp.stop();

        StreamingService streaming = new StreamingService();
        streaming.play();
        streaming.pause();
        streaming.stop();
    }

}
