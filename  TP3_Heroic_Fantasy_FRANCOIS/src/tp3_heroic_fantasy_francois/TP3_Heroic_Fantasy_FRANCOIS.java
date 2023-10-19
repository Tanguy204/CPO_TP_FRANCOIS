/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_francois;

/**
 *
 * @author Tanguy
 */


import java.util.ArrayList;

public class TP3_Heroic_Fantasy_FRANCOIS {

    
    public static void main(String[] args) {
        Arme epee1 = new Epee ("Excalibur", 7, 5 ) ;
        Arme epee2 = new Epee ("Durandal", 5, 6 ) ;
        Arme baton1 = new Baton ("Chêne", 4, 5 ) ;
        Arme baton2 = new Baton ("Charme", 5, 6 ) ;
        ArrayList<Arme> listeArmes = new ArrayList<>(); 

        listeArmes.add(epee1);
        listeArmes.add(epee2);
        listeArmes.add(baton1);
        listeArmes.add(baton2);
        for (Arme arme : listeArmes) {
                System.out.println(arme);
        }
        Personnage perso1= new Magicien("Gandalf",65,true);
        Personnage perso4= new Guerrier("Lannister", 45, true);
        
        ArrayList<Personnage> listePerso = new ArrayList<>(); 

        listePerso.add(perso1);
        listePerso.add(perso4);
        perso1.liste_armes = listeArmes;
        perso1.ChoixArme(4);
    }
    
}
