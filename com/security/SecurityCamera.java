package com.security;
import com.hardware.SmartDevice;
public class SecurityCamera extends SmartDevice{
    public void testAccess(){
        System.out.println("Accessing parent protected firmware: "+ firmwareVersion);
        InternalHardwareSpecs specs=new InternalHardwareSpecs();
        specs.firmware();
        displaySpecs();
    }
}