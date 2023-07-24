package org.design.creational.builder;

public class ComputerBuilder {

    private Computer computer;
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(){
        this.computer = new Computer();
    }
    public ComputerBuilder setHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
        return this;
    }

    public Computer build(){
        return new Computer(HDD,RAM,isGraphicsCardEnabled,isBluetoothEnabled);
    }
}
