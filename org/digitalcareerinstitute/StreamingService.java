package org.digitalcareerinstitute;

public class StreamingService implements MusicPlayer {
    private Song currentSong;
    private Enum playbackStatus = PlaybackStatus.STOPPED;

    public StreamingService(Song currentSong) {
        this.currentSong = currentSong;
    }

    @Override
    public void play() {
        System.out.println(currentSong.title() + " is playing.");  //Display a message indicating that the Streaming is playing
        playbackStatus = PlaybackStatus.PLAYING;   // and set the playback status to "playing."

    }

    @Override
    public void pause() {
        System.out.println(currentSong.title() + " is paused.");   // Display a message indicating that the Streaming is paused
        playbackStatus = PlaybackStatus.PAUSED;   // and set the playback status to "paused."
    }

    @Override
    public void stop() {
        System.out.println("Streaming has stopped.");    //  Display a message indicating that Streaming has stopped
        playbackStatus = PlaybackStatus.STOPPED;    // and set the playback status to "stopped."
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public Enum getPlaybackStatus() {
        return playbackStatus;
    }
}
