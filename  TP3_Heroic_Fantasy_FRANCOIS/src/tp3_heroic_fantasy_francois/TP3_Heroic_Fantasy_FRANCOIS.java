/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_francois;

/**
 *
 * @author Tanguy
 */
import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import java.util.ArrayList;
import Armes.Arme;
import Armes.Epee;
import Armes.Baton;

public class TP3_Heroic_Fantasy_FRANCOIS {

    public static void main(String[] args) {
        Arme epee1 = new Epee("Excalibur", 7, 5);
        Arme epee2 = new Epee("Durandal", 5, 6);
        Arme baton1 = new Baton("Chêne", 4, 5);
        Arme baton2 = new Baton("Charme", 5, 6);
        Personnage Mage = new Magicien("Gandalf", 65, true);
        Personnage Guerre = new Guerrier("Lannister", 45, true);
        Mage.liste_armes.add(epee2);
        Mage.liste_armes.add(baton2);
        Guerre.liste_armes.add(epee1);
        Guerre.liste_armes.add(baton1);
        Mage.ChoixArme(1);
        Guerre.ChoixArme(1);
        System.out.println(Mage+" "+ Guerre);
        Mage.attaquer(Guerre);
        Guerre.attaquer(Mage);
        
        System.out.println(Mage+" "+ Guerre);
        
        

    }

}
