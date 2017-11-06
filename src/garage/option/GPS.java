/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage.option;

import static garage.vehicule.Vehicule.formatPrix;
import java.io.Serializable;

public class GPS implements Option, Serializable  {

	private static final long serialVersionUID = 1L;
	
	private final double prix = 113.5;

    public GPS() {
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "GPS ("+formatPrix(prix) + ")";
    }

}
