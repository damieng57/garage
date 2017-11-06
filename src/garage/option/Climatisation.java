package garage.option;

import static garage.vehicule.Vehicule.formatPrix;
import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private final double prix = 347.3;

    public Climatisation() {
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Climatisation ("+formatPrix(prix)+ ")";
    }

}
