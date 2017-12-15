package ohtu.kivipaperisakset;

public abstract class PelikomentoOperaatio {

    protected Tuomari tuomari;

    public PelikomentoOperaatio(Tuomari tuomari) {
        this.tuomari = tuomari;
    }

    public void pelaa() {
        String ekanSiirto, tokanSiirto;
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");

        do {
            ekanSiirto = haeEnsimmainenSiirto();
            tokanSiirto = haeToinenSiirto();
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
        } while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto));
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public abstract String haeEnsimmainenSiirto();

    public abstract String haeToinenSiirto();

}
