/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutindewindows;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastien-javary
 */
public class Repertoire {

    public List<Repertoire> rep = new ArrayList();
    public String nom = "";
    public Repertoire parent = null;

    public Repertoire(String n) {
        this.nom = n;
    }

    public void addChildren(Repertoire enfant) {
        enfant.parent = this;
        this.rep.add(enfant);
    }

    public void afficherNom() {
        //Probleme dans l'ordre
        String intentation = "";
        for (int i = 0; i < getIndente(); i++) {
            intentation += indentation();
        }
        System.out.println(intentation+this.nom);
        for (Repertoire repertoire : rep) {
            repertoire.afficherNom();
        }
    }

    //pourquoi on l'utilise
    public int getIndente() {
        //il manque quelquechose
        if (this.parent == null) {
            return 0;
        } else {
            return this.parent.getIndente() + 1;
        }
    }

    //tab 
    //le nbr de tab = nbr de parent 
    public String indentation() {
        return "\t";
    }
}
