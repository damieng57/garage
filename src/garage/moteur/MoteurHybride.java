package garage.moteur;

import java.io.Serializable;

public class MoteurHybride extends Moteur implements Serializable {

    private static final long serialVersionUID = 1l;

    public MoteurHybride(String cylindre, double prix) {
        super(cylindre, prix);
        this.typeMoteur = TypeMoteur.HYBRIDE;
    }

}
