package ohtu.kivipaperisakset;

import java.util.HashMap;

public class Pelitehdas {
    
    private final HashMap<String, PelikomentoOperaatio> komennot;
    
    public Pelitehdas(IO io) {
        komennot = new HashMap<>();
        komennot.put("a", new KPSPelaajaVsPelaaja(io));
        komennot.put("b", new KPSTekoaly(io));
        komennot.put("c", new KPSParempiTekoaly(io));
    }
    
    public PelikomentoOperaatio hae(String operaatio) {
        return komennot.get(operaatio);
    }
}
