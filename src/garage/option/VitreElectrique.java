package garage.option;

import static garage.vehicule.Vehicule.formatPrix;
import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

    private static final long serialVersionUID = 1l;

    private final double prix = 212.35;

    public VitreElectrique() {
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Vitre électrique (" + formatPrix(prix) + ")";
    }

}
