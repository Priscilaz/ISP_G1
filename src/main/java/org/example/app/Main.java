package org.example.app;


import org.example.devices.DisposableCamera;
import org.example.devices.Phone;
import org.example.interfaces.Powerable;
import org.example.interfaces.Rechargeable;

public class Main {
    public static void main(String[] args) {

        // Dispositivo recargable
        Powerable phone = new Phone();
        phone.turnOn();
        ((Rechargeable) phone).charge();
        phone.turnOff();

        System.out.println("-----------------------");

        // Dispositivo NO recargable
        Powerable camera = new DisposableCamera();
        camera.turnOn();
        camera.turnOff();
    }
}

