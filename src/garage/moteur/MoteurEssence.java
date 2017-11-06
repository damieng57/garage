package garage.moteur;

import java.io.Serializable;

public class MoteurEssence extends Moteur implements Serializable {

    private static final long serialVersionUID = 1l;

    public MoteurEssence(String cylindre, double prix) {
        super(cylindre, prix);
        this.typeMoteur = TypeMoteur.ESSENCE;
    }

}
