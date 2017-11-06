package garage.vehicule;

public class Lagouna extends Vehicule {
    
    private double prixBase = 23123.0;
    private String modele = "Lagouna";
    private Marque marque = Marque.RENO;

    public Lagouna() {
        super(); // Facultatif car appel implicite dans le cas d'un constructeur sans paremètre
        
        // Par facilité, j'utilise super pour définir le prix de base du véhicule
        // et les éléments spécifique à 1 véhicule. Evitant l'Override de la méthode
        // toString();
        super.prixBase = this.prixBase;
        super.modele = this.modele;

        // Utilisation d'un setter pour dire que je sais le faire aussi :p
        // Remplace super.marque = this.marque;
        setMarque(marque);
    }
}
