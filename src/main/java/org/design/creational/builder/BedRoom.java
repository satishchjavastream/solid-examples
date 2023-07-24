package org.design.creational.builder;

import java.awt.Dimension;
import java.awt.Color;
public class BedRoom {
    private Dimension dimension;
    private int celiingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hadEnsuite;

    public BedRoom(Dimension dimension, int celiingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hadEnsuite) {
        this.dimension = dimension;
        this.celiingHeight = celiingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hadEnsuite = hadEnsuite;
    }

    @Override
    public String toString() {
        return "BedRoom{" +
                "dimension=" + dimension +
                ", celiingHeight=" + celiingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", isDouble=" + isDouble +
                ", hadEnsuite=" + hadEnsuite +
                '}';
    }
}
