/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_francois;

import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
import java.util.ArrayList;
public abstract class Personnage {
    String nom;
    int nivVie;
    ArrayList<Arme> liste_armes = new ArrayList<Arme>();
    int nbArmes;
    Arme arme_en_main;
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + nivVie ;
    return chaine_a_retourner ;
    
    }
    public Personnage(String nom, int nivVie){
        this.nom=nom;
        this.nivVie=nivVie;
        nbArmes=0;
        arme_en_main=null;
        
          
    }
    public boolean ajouter_arme( Arme armeenplus) {
        if (nbArmes == 5 ){
                return false;
            }
        liste_armes.add(armeenplus);
        nbArmes+=1 ;
        armeenplus.pos=nbArmes-1;
        
        return true ;       
}
    public void ChoixArme(){
        Scanner sc = new Scanner(System.in);
        for (Arme arme : liste_armes) {
                System.out.println( arme +" "+ arme.pos );
        }
        System.out.println("Choisissez l'arme que vous voulez prendre en indiquant sa position dans la liste");
        int cx = sc.nextInt();
        int pos=cx-1;
        int size=liste_armes.size();
        while (cx>size || cx<0)  {
           System.out.println("La position que vous avez choisie ne correspond à aucun arme veuillez ressaisir ");
            cx = sc.nextInt();
            pos=cx-1;
            size=liste_armes.size(); 
        }
        
        Arme choix =liste_armes.get(pos );    
        arme_en_main = choix;  
        System.out.println("Vous avez bien l'arme en main");
        
        }
    }

      
    
   
    

