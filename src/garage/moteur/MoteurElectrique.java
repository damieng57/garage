package garage.moteur;

import java.io.Serializable;

public class MoteurElectrique extends Moteur implements Serializable {

    private static final long serialVersionUID = 1l;

    public MoteurElectrique(String cylindre, double prix) {
        super(cylindre, prix);
        this.typeMoteur = TypeMoteur.ELECTRIQUE;
    }

}
