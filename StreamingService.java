public class StreamingService implements MusicPlayer {
    private String currentSong = "Highway to hell 2";
    private String playbackStatus;

    @Override
    public void play() {
        System.out.println("Streaming " + currentSong);
        playbackStatus = "streaming";
    }

    @Override
    public void stop() {
        System.out.println("Streaming has stopped");
        playbackStatus = "stopped";
    }

    @Override
    public void pause() {
        System.out.println("Streaming is paused");
        playbackStatus = "paused";
    }
}
