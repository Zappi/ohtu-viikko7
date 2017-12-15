package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends PelikomentoOperaatio{

    private static final Scanner scanner = new Scanner(System.in);
    private IO io;
    
     public KPSPelaajaVsPelaaja(IO io) {
        super(new Tuomari());
        this.io = io;
    }
    
    @Override
    public String haeEnsimmainenSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return io.nextString();
    }
    
    @Override
    public String haeToinenSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        System.out.println("");
        return io.nextString();
    }
}
