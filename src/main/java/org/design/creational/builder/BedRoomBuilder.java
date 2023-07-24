package org.design.creational.builder;

import java.awt.*;
import java.util.ArrayList;

public class BedRoomBuilder implements Builder {
    private Dimension dimension;
    private int celiingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hadEnsuite;
    private RoomListBuilder roomListBuilder;

    public BedRoomBuilder() {
    }

    @Override
    public BedRoomBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public BedRoomBuilder setCeliingHeight(int celiingHeight) {
        this.celiingHeight = celiingHeight;
        return this;
    }

    @Override
    public BedRoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public BedRoomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public BedRoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public BedRoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public BedRoomBuilder setDouble(boolean isDouble) {
        this.isDouble = isDouble;
        return this;
    }

    public BedRoomBuilder setHadEnsuite(boolean hadEnsuite) {
        this.hadEnsuite = hadEnsuite;
        return this;
    }

    public BedRoom createBedRoom(){
        return new BedRoom(dimension,celiingHeight,floorNumber,wallColor,numberOfWindows,numberOfDoors,isDouble,hadEnsuite);
    }

    public RoomListBuilder addRoomToList(){
        BedRoom bedroom = createBedRoom();
        this.roomListBuilder.addBedRoom(bedroom);
        return this.roomListBuilder;
    }

    @Override
    public String toString() {
        return "BedRoomBuilder{" +
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
