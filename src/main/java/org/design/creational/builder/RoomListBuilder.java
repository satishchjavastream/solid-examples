package org.design.creational.builder;

import java.util.ArrayList;

public class RoomListBuilder {
    private ArrayList<BedRoom> listOfRooms;

    public RoomListBuilder addList(){
        this.listOfRooms = new ArrayList<>();
        return this;
    }

    public RoomListBuilder addBedRoom(BedRoom room){
        listOfRooms.add(room);
        return this;
    }

    public BedRoomBuilder addBedRoom(){
        return new BedRoomBuilder();
    }

    public ArrayList<BedRoom> buildList(){
        return listOfRooms;
    }

}
