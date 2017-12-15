package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends PelikomentoOperaatio{

    private static final Scanner scanner = new Scanner(System.in);
    private Tuomari tuomari;
    private TekoalyParannettu tekoaly;
    private IO io;

    public KPSParempiTekoaly(IO io) {
        super(new Tuomari());
        this.tekoaly = new TekoalyParannettu(20);
         this.io = io;
    }
    

   @Override
    public String haeEnsimmainenSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return io.nextString();
    }
    
    @Override
    public String haeToinenSiirto() {
        String siirto = tekoaly.annaSiirto();
        System.out.print("Tietokone valitsi: " +siirto + "\n");
        return siirto;
    }
}
