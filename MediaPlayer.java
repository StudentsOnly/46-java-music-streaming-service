public class MediaPlayer implements MusicPlayer {
    private String currentSong = "Highway to hell";
    private String playbackStatus;

    @Override
    public void play() {
        System.out.println("Playing " + currentSong);
        playbackStatus = "playing";
    }

    @Override
    public void stop() {
        System.out.println("Playback has stopped");
        playbackStatus = "stopped";
    }

    @Override
    public void pause() {
        System.out.println("Song " + currentSong + "is paused");
        playbackStatus = "paused";
    }
}
