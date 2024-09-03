public class Main {
    public static void main(String[] args) {

        MusicPlayer mediaPlayer = new MediaPlayer();
        MusicPlayer streamingService = new StreamingService();


        mediaPlayer.play("Aerosmith - Dream On");
        mediaPlayer.pause();
        mediaPlayer.stop();


        streamingService.play("John Lennon - Imagine");
        streamingService.pause();
        streamingService.stop();
    }
}
