package org.example.fix2;

public class Contatore {
    private int value;
    public void increment() {
        synchronized(this) {
            value++;
        }
    }

    public int getValue() {
        synchronized(this) {
            return value;
        }
    }
}
