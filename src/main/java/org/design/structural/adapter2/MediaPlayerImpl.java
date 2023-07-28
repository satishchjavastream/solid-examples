package org.design.structural.adapter2;

public class MediaPlayerImpl implements MediaPlayer{
    MediaPlayerAdapter mediaPlayerAdapter;
    MediaPlayer mediaPlayer;

    @Override
    public void play(String fileToPlay, String fromToPlay) {
        if (fromToPlay.equalsIgnoreCase("mp3")){
            mediaPlayer = new DefaultMediaPlayer();
            mediaPlayer.play(fileToPlay,fromToPlay);
        }else{
            AdvanceFormat advanceFormat = new AdvanceFormat();
            advanceFormat.setResolution("720p");
            mediaPlayerAdapter = new MediaPlayerAdapter(advanceFormat);
            mediaPlayerAdapter.play(fileToPlay,fromToPlay);
        }
    }
}
