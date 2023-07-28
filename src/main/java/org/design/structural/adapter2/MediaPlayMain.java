package org.design.structural.adapter2;

public class MediaPlayMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.play( "mySong","mp3");
        mediaPlayer.play("mySongInNewFormat","avi");
    }
}
