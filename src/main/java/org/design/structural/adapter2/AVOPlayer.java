package org.design.structural.adapter2;

public class AVOPlayer implements AdvanceMediaPlayer{
    @Override
    public void playAdvanceFormat(AdvanceFormat advanceFormat) {
        System.out.println("playing using Advance media player "+advanceFormat.getFileToPlay()+"."+advanceFormat.getFileToPlay()+"In resolution "+advanceFormat.getResolution());
    }

}
