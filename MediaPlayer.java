public class MediaPlayer implements MusicPlayer {
    private String currentSong;
    private PlaybackStatus playbackStatus;

    @Override
    public void play(String song) {
        this.currentSong = song;
        this.playbackStatus = PlaybackStatus.PLAYING;
        System.out.println("Playing " + song);
    }

    @Override
    public void pause() {
        if (this.playbackStatus == PlaybackStatus.PLAYING) {
            this.playbackStatus = PlaybackStatus.PAUSED;
            System.out.println("Paused " + this.currentSong);
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    @Override
    public void stop() {
        if (this.playbackStatus == PlaybackStatus.PLAYING || this.playbackStatus == PlaybackStatus.PAUSED) {
            this.playbackStatus = PlaybackStatus.STOPPED;
            System.out.println("Stopped " + this.currentSong);
        } else {
            System.out.println("No song is currently playing.");
        }
    }
}
