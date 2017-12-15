package ohtu.kivipaperisakset;

import java.util.Scanner;


public class KonsoliIO implements IO{
    private Scanner lukija;

    public KonsoliIO() {
        lukija = new Scanner(System.in);
    }
    
    @Override
    public String nextString() {
        return lukija.next();
    }

    @Override
    public void print(String input) {
        System.out.println(input);
    }
    
    
}
