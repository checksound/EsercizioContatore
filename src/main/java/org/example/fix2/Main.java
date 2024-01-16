package org.example.fix2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contatore contatore = new Contatore();

        Incrementer t1 = new Incrementer(contatore);
        Incrementer t2 = new Incrementer(contatore);

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long tempoEsecuzione = System.currentTimeMillis() - start;

        System.out.println(contatore.getValue() + " in ms: " + tempoEsecuzione);
    }
}