package garage.option;

import static garage.vehicule.Vehicule.formatPrix;
import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

    private static final long serialVersionUID = 1l;
    
    private final double prix = 562.9;

    public SiegeChauffant() {
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Siège chauffant (" + formatPrix(prix) + ")";
    }

}
