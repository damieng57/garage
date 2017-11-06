package garage.moteur;

import java.io.Serializable;

public class MoteurDiesel extends Moteur implements Serializable {

    private static final long serialVersionUID = 1l;

    public MoteurDiesel(String cylindre, double prix) {
        super(cylindre, prix);
        this.typeMoteur = TypeMoteur.DIESEL;
    }

}
