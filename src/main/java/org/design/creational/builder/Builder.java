package org.design.creational.builder;

import java.awt.*;

public interface Builder {
    Builder setDimension(Dimension dimension);

    Builder setCeliingHeight(int celiingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(Color wallColor);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
