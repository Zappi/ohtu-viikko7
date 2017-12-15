package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends PelikomentoOperaatio {

    private static final Scanner scanner = new Scanner(System.in);
    private IO io;
    private Tekoaly tekoaly;

    public KPSTekoaly(IO io) {
        super(new Tuomari());
        this.tekoaly = new Tekoaly();
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
        System.out.print("Tietokone valitsi: " + siirto + "\n");
        return siirto;
    }
}
