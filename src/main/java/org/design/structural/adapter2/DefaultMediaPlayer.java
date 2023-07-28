package org.design.structural.adapter2;

public class DefaultMediaPlayer implements MediaPlayer{
    @Override
    public void play(String fileToPlay, String fromToPlay) {
        System.out.println("playing "+fileToPlay+"."+fromToPlay);
    }
}
