package com.app;
import com.security.SecurityCamera;
public class MainApp{
public static void main(String[] args){
    SecurityCamera cam=new SecurityCamera();
    cam.testAccess();
}
}