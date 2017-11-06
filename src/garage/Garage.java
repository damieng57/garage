package garage;

import garage.vehicule.Vehicule;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Garage implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<Vehicule> garage = new ArrayList<>();

    // SuppressWarnings pour ligne this.garage = (ArrayList<Vehicule>) ois.readObject();
    /**
     * L'appel d'une instance garage provoque l'affichage des véhicules stockés
     * en accédant au fichier save.ser
     *
     */
    @SuppressWarnings("unchecked")
    public Garage() {

        // Chargement du garage depuis le fichier save.ser
        File file = new File("save.ser");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                setGarage((ArrayList<Vehicule>) ois.readObject());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Aucune voiture sauvegardée !");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();

        }
    }

    public void addVoiture(Vehicule voiture) {
        this.getGarage().add(voiture);

        // Enregistrement des objets dans un fichier sérialisé. En réalite, on ajoute
        // le tableau contenu dans la variable garage. Chaque appel supprime les éléments
        // prcédents et insère le nouveau tableau.
        // Pour économiser la fermeture des ressources (fonction close(), j'utilise un try with ressources
        try (FileOutputStream fos = new FileOutputStream("save.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(this.getGarage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        // Pour le fun, ajout dans un fichier texte également
        saveInTxt();
        
    }

    @Override
    public String toString() {
        System.out.println("***************************\n" + "*  Garage OpenClassRooms  *\n" + "***************************\n");
        for (Vehicule vehicule : getGarage()) {
            System.out.println(vehicule);
        }
        return "Nombre total de véhicules : " + String.valueOf(this.getGarage().size());
    }

    /**
     * @return le garage (l'ensemble des véhicules stockés dans le tableau)
     */
    public ArrayList<Vehicule> getGarage() {
        return this.garage;
    }

    /**
     * @param garage Insert la liste récupérée du fichier save.ser dans la
     * variable garage
     */
    public void setGarage(ArrayList<Vehicule> garage) {
        this.garage = garage;
    }

    public void saveInTxt() {
        File file = new File("save.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            for (Vehicule vehicule : garage) {
                bw.write(vehicule.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
