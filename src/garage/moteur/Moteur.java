package garage.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

    private static final long serialVersionUID = 1L;

    TypeMoteur typeMoteur;
    String cylindre;
    double prix;

    public Moteur(String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;

    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Moteur " + this.typeMoteur + " " + cylindre;
    }

}
