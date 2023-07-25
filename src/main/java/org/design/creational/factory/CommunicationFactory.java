package org.design.creational.factory;

public class CommunicationFactory {

    public Communication getProcess(String modeOfCommunication){

        if ("Email".equalsIgnoreCase(modeOfCommunication)){
            return new EmialCommunication();
        } else if ("Mobile".equalsIgnoreCase(modeOfCommunication)) {
            return new MobileCommunication();
        }
        return null;
    }
}
