package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {

        IO io = new KonsoliIO();

        while (true) {

            tulosta();
            String syote = io.nextString();
            Pelitehdas pelitehdas = new Pelitehdas(io);
            if (syote.endsWith("a") || syote.endsWith("b") || syote.endsWith("c")) {
                pelitehdas.hae(syote).pelaa();
            } else {
                break;
            }

        }
    }

    private static void tulosta() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
}
