package org.design.structural.adapter2;

public class MediaPlayerAdapter implements  MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;
    AdvanceFormat advanceFormat;

    public MediaPlayerAdapter(AdvanceFormat advanceFormat) {
        advanceMediaPlayer = new AVOPlayer();
        this.advanceFormat = advanceFormat;
    }

    @Override
    public void play(String fileToPlay, String fromToPlay) {
        advanceFormat.setFormateToPlay(fileToPlay);
        advanceFormat.setFileToPlay(fromToPlay);
        advanceMediaPlayer.playAdvanceFormat(advanceFormat);
    }
}
