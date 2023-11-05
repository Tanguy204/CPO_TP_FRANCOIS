/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_francois_version_console;

/**
 *Cette classe représente une cellule lumineuse qui peut être activée et éteinte.
 *
 * @author Tanguy
 */
public class CelluleLumineuse {

    private boolean etat;

    /**
     *Constructeur par défaut. Initialise la cellule en état éteint.
     */
    public CelluleLumineuse() {
        etat = false;

    }
    public void copierCellule(CelluleLumineuse cellule) {
        this.etat=cellule.etat;
    }

    /**
     *Active la cellule lumineuse en la mettant dans l'état allumé.
     */
    public void activerCellule() {
        if (etat == false) {
            etat = true;
        }
        else {
            etat = false;
        }
    }
        
    /**
     *Éteint la cellule lumineuse en la mettant dans l'état éteint.
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     Vérifie si la cellule est éteinte.
     *
     * @return true si la cellule est éteinte, false sinon.
     */
    public boolean estEteint(){
     return !etat;
    }

    /**
     Obtient l'état actuel de la cellule lumineuse.
     *
//     * @return true si la cellule est allumée, false si elle est éteinte.
     */
    public boolean getEtat(){
    return etat;
}
@Override
    public String toString() {
        
        if (etat==true){
            return "X";
        }
        else {
            return"O";
        }
       
}
}