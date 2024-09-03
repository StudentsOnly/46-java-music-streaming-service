package org.digitalcareerinstitute;

public class MediaPlayer implements MusicPlayer {
    private Song currentSong;
    private Enum playbackStatus = PlaybackStatus.STOPPED;

    public MediaPlayer(Song currentSong) {
        this.currentSong = currentSong;
    }

    @Override
    public void play() {
        System.out.println(currentSong.title() + " is playing.");  //Display a message indicating that the song is playing
        playbackStatus = PlaybackStatus.PLAYING;   // and set the playback status to "playing."

    }

    @Override
    public void pause() {
        System.out.println(currentSong.title() + " is paused.");   // Display a message indicating that the song is paused
        playbackStatus = PlaybackStatus.PAUSED;   // and set the playback status to "paused."
    }

    @Override
    public void stop() {
        System.out.println("Playback has stopped.");    //  Display a message indicating that playback has stopped
        playbackStatus = PlaybackStatus.STOPPED;    // and set the playback status to "stopped."
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public Enum getPlaybackStatus() {
        return playbackStatus;
    }
}
