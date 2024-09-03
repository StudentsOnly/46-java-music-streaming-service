package org.digitalcareerinstitute;

public class Main{

    public static void main(String[] args) {

        Song nothingElseMatters = new Song("Nothing else matters", 3.2);
        System.out.println("Song " +
                "\nTitle: " + nothingElseMatters.title() +
                "\nDuration: " + nothingElseMatters.duration() + " min");
        System.out.println();

        System.out.println("Media Player starting ...");
        MediaPlayer mediaPlayer = new MediaPlayer(nothingElseMatters);
        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.stop();
        System.out.println();

        System.out.println("Streaming Service starting ...");
        StreamingService streamingService = new StreamingService(nothingElseMatters);
        streamingService.play();
        streamingService.pause();
        streamingService.stop();
    }
}
