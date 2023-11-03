/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_francois_version_console;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Tanguy
 */
public class ModeNiveaux {

    Partie[][] Niveaux;

    int x;
    int y;
    int nbCoups;

    public ModeNiveaux() {

        nbCoups = 2;
        Niveaux = new Partie[20][3];

        x = 2;
        y = 2;
    }

    public void LancerNiveaux() {
        Random random = new Random();
        int nbC;
        int nbL;
        GrilleDeJeu sauv;
        GrilleDeJeu sauv1;
        GrilleDeJeu sauv2;
        for (int i = 0; i < 20; i++) {

            System.out.println("Vous devez réaliser ces grilles en moins de " + nbCoups + " coups");
            Niveaux[i][0] = new Partie(x, y, nbCoups);
            Niveaux[i][0].initialiserPartie();
            sauv = new GrilleDeJeu(x,y);
            sauv.copierGrille(Niveaux[i][0].grille);
            System.out.println(sauv);
            while (Niveaux[i][0].lancerPartie() == false) {
                System.out.println("recommencez le niveau"+sauv);
                
                Niveaux[i][0].grille .copierGrille(sauv);
                Niveaux[i][0].nbCoups = 0;
            }

            nbC = random.nextInt(y) + 1;
            System.out.println("Vous devez réaliser ces grilles en moins de " + nbCoups + " coups");
            Niveaux[i][1] = new Partie(x, nbC, nbCoups);
            Niveaux[i][1].initialiserPartie();
            sauv1 = new GrilleDeJeu(x,y);
            sauv.copierGrille(Niveaux[i][1].grille);
                    

            while (Niveaux[i][1].lancerPartie() == false) {
                System.out.println("recommencez le niveau");
                Niveaux[i][1].grille .copierGrille(sauv1);
                
                Niveaux[i][1].nbCoups = 0;
            }

            nbL = random.nextInt(x) + 1;
            Niveaux[i][2] = new Partie(nbL, y, nbCoups);
            Niveaux[i][2].initialiserPartie();
            sauv2 = new GrilleDeJeu(x,y);
            sauv.copierGrille(Niveaux[i][2].grille);
            
            while (Niveaux[i][2].lancerPartie() == false) {
                System.out.println("recommencez le niveau");
                
                Niveaux[i][2].grille.copierGrille(sauv2);
                Niveaux[i][2].nbCoups = 0;
            }

            x += 1;
            y += 1;
            nbCoups = (x * y) / 2;

            System.out.println(sauv2 + " " + sauv+ " " + sauv1);

            System.out.println("Niveau " + (i + 1) + " passé");
        }
    }
}
