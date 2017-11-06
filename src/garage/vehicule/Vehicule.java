package garage.vehicule;

import garage.option.Option;
import garage.moteur.Moteur;
import garage.moteur.TypeMoteur;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Vehicule implements Option, Serializable {

    // Par simplicité, je garde un serialVersionUID basique
    private static final long serialVersionUID = 1l;

    protected double prixBase;
    protected double prixOptions;
    protected String modele;
    protected ArrayList<Option> options = new ArrayList<Option>();
    protected Marque marque;
    protected Moteur moteur;
    protected TypeMoteur typeMoteur;

    public Vehicule() {

    }


    @Override
    public String toString() {
        // getPrix() correspond au prix des options!
        return "+ Voiture " + getMarque() + " : " + this.modele + " " + this.moteur + " (" + formatPrix(this.prixBase)+") " + "Options: " + getOptions() + " d'une valeur totale de " + formatPrix(getPrix()) + " €";
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    public Marque getMarque() {
        return this.marque;
    }
    
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    /**
     * Retourne la liste des options sous forme de tableau
     *
     * @return Tableau d'Option
     */
    public ArrayList<Option> getOptions() {
        return this.options;
    }

    /**
     * Cette fonction permet d'obtenir le prix du véhicule de base et des
     * options. Implementation de l'interface Option.
     *
     * @return Prix du véhicule avec les options choisies
     */
    @Override
    public double getPrix() {
        double optionsPrix = 0;
        for (Option option : options) {
            optionsPrix += option.getPrix();
        }
        return this.prixBase + optionsPrix;

    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
    
    public static String formatPrix (double value) {
        DecimalFormat df = new DecimalFormat("#.00€");
        return df.format(value);
    }

}
