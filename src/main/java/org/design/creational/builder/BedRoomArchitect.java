package org.design.creational.builder;

import java.awt.*;
import java.util.ArrayList;

public class BedRoomArchitect {
    public static void main(String[] args) {

        BedRoom room = new BedRoom(new Dimension(200,100),133,2,Color.yellow,2,1,true,true);

        BedRoom roomBuilder = new BedRoomBuilder().setDimension(new Dimension(200,100)).setCeliingHeight(100).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(1).setDouble(true).setHadEnsuite(true).createBedRoom();

        BedRoom room2 = new BedRoomBuilder().setDimension(new Dimension(150,100)).setCeliingHeight(200).createBedRoom();

        ArrayList<BedRoom> rooms = new RoomListBuilder().addList().addBedRoom(room).addBedRoom(room2).buildList();

    /*    ArrayList<BedRoom> bedRooms = new RoomListBuilder().addList()
                                            .addBedRoom().setFloorNumber(2).addRoomToList()
                                            .addBedRoom().setFloorNumber(1).addRoomToList()
                                            .buildList();*/

        System.out.println(roomBuilder);
        //System.out.println(room2);
       // System.out.println(rooms);
       System.out.println(rooms);
    }
}
