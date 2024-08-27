## Exercise: Interfaces - Music Streaming Service

#### Objective:

Practice working with interfaces in Java by creating a music streaming service.

#### Description:

You should create an interface called MusicPlayer with methods for basic music playback operations like play, pause, and stop. Implement two classes, MediaPlayer and StreamingService, both of which implement the MusicPlayer interface. Each class should provide its own implementation of the methods.

#### Guidelines:

#### MusicPlayer Interface:

Create an interface called MusicPlayer with the following methods:

- void play - to play a specific song.
- void pause - to pause the currently playing song.
- void stop - to stop playback.

#### MediaPlayer Class:

Create a class called MediaPlayer that implements the MusicPlayer interface.

Include instance variables for the currently playing song and the playback status.

#### Implement the methods:

- play - Display a message indicating that the song is playing and set the playback status to "playing."
- pause - Display a message indicating that the song is paused and set the playback status to "paused."
- stop - Display a message indicating that playback has stopped and set the playback status to "stopped."

#### StreamingService Class:

Create a class called StreamingService that also implements the MusicPlayer interface.
Include instance variables for the currently playing song and the playback status.

#### Implement the methods:

- play - Display a message indicating that the song is streaming and set the playback status to "streaming."
- pause - Display a message indicating that streaming is paused and set the playback status to "paused."
- stop - Display a message indicating that streaming has stopped and set the playback status to "stopped."

#### Main Application:

In the main method, create instances of MediaPlayer and StreamingService.
Perform play, pause, and stop operations on both players and display the results.
