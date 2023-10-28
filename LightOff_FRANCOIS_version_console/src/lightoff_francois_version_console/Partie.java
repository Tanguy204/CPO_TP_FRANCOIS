/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_francois_version_console;

import java.util.Scanner;

/**
 *Cette classe représente une partie du jeu. Elle gère l'interaction avec le joueur et le déroulement du jeu.
 *
 * @author Tanguy
 */
public class Partie {
    boolean etat;
    GrilleDeJeu grille;
    int nbCoups;
    Scanner scanner = new Scanner(System.in);
    int nbCoupsMax;
    /**
     *Constructeur de la partie. Il initialise une nouvelle grille de jeu selon les dimensions
     * spécifiées par le joueur.
     */
    public Partie(int x , int y, int z) {
        
        grille = new GrilleDeJeu(x, y);
        nbCoups = 0;
        etat = false;
        nbCoupsMax=z;

    }

    /**
     *Initialise une nouvelle partie en générant une matrice aléatoire de cellules lumineuses.
     */
    public void initialiserPartie() {
        
        grille.genererMatriceAleatoire(100);
        while (grille.cellulesToutesEteintes() == true) {
            grille.genererMatriceAleatoire(100);
        }
        

    }

    /**
     *Lance la partie en demandant au joueur de choisir des actions pour allumer et éteindre des cellules.
     * La partie continue jusqu'à ce que toutes les cellules soient éteintes.
     */
    public void lancerPartie() {
        initialiserPartie();
        System.out.println(grille);
        while (grille.cellulesToutesEteintes() == false && nbCoups!=nbCoupsMax) {
            
            
            System.out.println("Si vous voulez switcher un ligne taper 1, si vous voulez switcher une colonnes taper 2, ou une diagonale taper 3");
            int LoCoD = scanner.nextInt();
            
            if (LoCoD == 1 || LoCoD == 2) {
                
                System.out.println("Quelle colonne ou ligne voulez vous switcher ?");
                int cx = scanner.nextInt() - 1;
                
                if (LoCoD == 1) {
                    grille.activerLigneDeCellules(cx);
                } else {
                    grille.activerColonneDeCellules(cx);
                }
            } else {
                
                System.out.println("Voulez vous switcher une diagonale montante ou descendante ?\n taper 1 pour montante ou 2 pour descendante");
                int cx = scanner.nextInt();
                int diagx = 0;
                int diagy = 0;
                if (grille.nbLignes != grille.nbColonnes) {
                    if (grille.nbColonnes < grille.nbLignes) {
                    System.out.println("Sur quelle  ligne voulez vous que votre diagonale commence ?");
                        int debut = scanner.nextInt();
                        diagx =  debut;
                    
                    }
                    if (grille.nbColonnes > grille.nbLignes) {
                        System.out.println("Sur quelle colonne voulez vous que votre diagonale commence ?");
                        int debut = scanner.nextInt();
                        diagy =debut;
                    }
                    }
                    

                    
                
                if (cx == 2) {
                    grille.activerDiagonaleDescendante(diagx, diagy);
                } else {
                    grille.activerDiagonaleMontante(diagx, diagy );
                }
                
 }
          nbCoups += 1;
          System.out.println(grille);
          
          }      
        
        if (nbCoups<=nbCoupsMax && grille.cellulesToutesEteintes() == true){
            System.out.println("Bravo Vous avez gagné au bout de " + nbCoups);
            etat=true;
        if (nbCoups> nbCoupsMax && grille.cellulesToutesEteintes() == false){
              System.out.println("vous avez perdu, recomencez");
                
        }
        
    }
}
}
