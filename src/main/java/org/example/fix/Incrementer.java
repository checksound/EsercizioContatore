package org.example.fix;

public class Incrementer extends Thread {

    private Contatore contatore;

    public Incrementer(Contatore contatore) {
        this.contatore = contatore;
    }

    public void run() {

        for(int i = 0; i < 1_000_000; i++) {
            contatore.increment();
        }

    }


}
