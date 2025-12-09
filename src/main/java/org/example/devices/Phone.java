package org.example.devices;

import org.example.interfaces.Powerable;
import org.example.interfaces.Rechargeable;

public class Phone implements Powerable, Rechargeable {

    @Override
    public void turnOn() {
        System.out.println("Phone is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Phone is turning off.");
    }

    @Override
    public void charge() {
        System.out.println("Phone is charging.");
    }
}
