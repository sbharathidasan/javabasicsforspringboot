package com.hardware;
public class SmartDevice{
    private String deviceToken="oi boy";
    String calibrationCode="its a code only for packages ";
    protected int firmwareVersion=1234;

    protected class InternalHardwareSpecs{
        public InternalHardwareSpecs(){
            
        }
        public void displaySpecs(){
            System.out.println("hardware spec: Standard chipset v1");
        }
    }
    public void showInternalDetails(){
        System.out.println("privateToken:"+deviceToken);
        System.out.println("default Code:"+calibrationCode);
        System.out.println("protected firmware:"+firmwareVersion);
    }
}
class DeviceLogger{
    void logmessage(String msg){
        System.out.println("[log]:"+msg);
    }
}