/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;



/**
 *
 * @author Tanguy
 */
public class Guerrier extends Personnage  {
    boolean cheval; 
    
    public Guerrier(String nom, int nivVie, boolean cheval){
        super(nom , nivVie);
        this.cheval=cheval;
    }
    public void finalize() {
        Personnage.nbPerso-=1;
        Personnage.nbGuerrier-=1;
    }
    public void attaquer(Personnage victime){
        victime.estAttaqué(30);
    }
    
    
}
