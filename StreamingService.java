public class StreamingService implements MusicPlayer {
    private String currentSong;
    private PlaybackStatus playbackStatus;

    @Override
    public void play(String song) {
        this.currentSong = song;
        this.playbackStatus = PlaybackStatus.STREAMING;
        System.out.println("Streaming " + song);
    }

    @Override
    public void pause() {
        if (this.playbackStatus == PlaybackStatus.STREAMING) {
            this.playbackStatus = PlaybackStatus.PAUSED;
            System.out.println("Paused streaming of " + this.currentSong);
        } else {
            System.out.println("StreamingService: No song is currently streaming.");
        }
    }

    @Override
    public void stop() {
        if (this.playbackStatus == PlaybackStatus.STREAMING || this.playbackStatus == PlaybackStatus.PAUSED) {
            this.playbackStatus = PlaybackStatus.STOPPED;
            System.out.println("Stopped streaming of " + this.currentSong);
        } else {
            System.out.println("No song is currently streaming.");
        }
    }
}
