package org.example.fix;

public class Contatore {

    private int value;

    public synchronized void increment() {
        value ++;
    }

    public synchronized int getValue() {
        return value;
    }
}
