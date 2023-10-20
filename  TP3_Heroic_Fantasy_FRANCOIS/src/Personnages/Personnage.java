/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
import java.util.ArrayList;
public abstract class Personnage {
    String nom;
    int nivVie;
    public  ArrayList<Arme> liste_armes = new ArrayList<>();
    int nbArmes;
    Arme arme_en_main;
    public static int nbPerso=0;
    public static int nbGuerrier=0;
    
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom +" avec "+ nivVie+ "hp et " ;
    return chaine_a_retourner ;
    
    }
    public Personnage(String nom, int nivVie){
        this.nom=nom;
        this.nivVie=nivVie;
        nbArmes=0;
        arme_en_main=null;
        nbPerso+=1;
        nbGuerrier+=1;
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
    public void ChoixArme(int choix){
        int pos=choix-1;
        while (pos<0 || pos>liste_armes.size()) {
            System.out.println("L'arme que vous avez choisie n'existe pas, veuillez rechoisir un arme");
            Scanner sc = new Scanner(System.in);
            pos = sc.nextInt()-1;
        }
        Arme ArmeCx =liste_armes.get(pos );    
        arme_en_main = ArmeCx;  
        System.out.println("Vous avez bien "+ arme_en_main+" en main");
        
        
        }
    }

      
    
   
    

