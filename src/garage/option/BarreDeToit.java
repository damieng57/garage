package garage.option;

import static garage.vehicule.Vehicule.formatPrix;
import java.io.Serializable;

public class BarreDeToit implements Option, Serializable  {
    
    private static final long serialVersionUID = 1l;
    
    private final double prix = 29.9;

    public BarreDeToit() {
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Barre de toit ("+formatPrix(prix)+")";
    }

}
