/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_francois_version_console;

import java.util.Random;

/**
 *
 * @author Tanguy
 */
public final class GrilleDeJeu {

    Random random = new Random();
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne] = new CelluleLumineuse();
            }
        }

    }

    public void eteindreToutesLesCellules() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        int Qdiag = random.nextInt(Math.abs(nbColonnes-nbLignes));
        int compt = random.nextInt(4);
        int qligne = random.nextInt(nbLignes);
        int qcolonne = random.nextInt(nbColonnes);
        int  x;
            int y=0;
            int z=0;
            if (nbColonnes>=nbLignes){
                x = nbLignes;
                if (nbColonnes>nbLignes){
                    y=Qdiag;
                }
            }
                else {
                    z=Qdiag;
                    x=nbColonnes;
                }
        if (compt == 1) {
            for (int ligne = 0; ligne < nbLignes; ligne++) {
                matriceCellules[ligne][qcolonne].activerCellule();

            }
        }
        if (compt == 2) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[qligne][colonne].activerCellule();

            }
        }
        if (compt == 3) {
            
                for (int colonne = 0; colonne < x; colonne++) {
                    matriceCellules[colonne][colonne].activerCellule();
                }
        }
        if (compt==0){
            
                
            
            
            
                for (int colonne = x ; colonne > 0; colonne--) {
                    int ligne = nbLignes-colonne;
                    matriceCellules[ligne+z][colonne-1+y].activerCellule();
                
            }
            }

        }
    

public void genererMatriceAleatoire(int nbTours){
        eteindreToutesLesCellules();
        for (int i = 1; i<=nbTours; i++){
            activerLigneColonneOuDiagonaleAleatoire();
        }
        
    }
    public void activerLigneDeCellules(int idLigne){
        for (int colonne = 0; colonne <= nbColonnes; colonne++) {
                matriceCellules[idLigne][colonne].activerCellule();
    }
    
    }
    public void activerColonneDeCellules(int idColonne){
        for (int ligne = 0; ligne <= nbLignes; ligne++) {
                matriceCellules[ligne][idColonne].activerCellule();
    }
        
}
    public void activerDiagonaleDescendante() {
        for (int colonne = 0; colonne <= nbColonnes; colonne++) {
                        matriceCellules[colonne][colonne].activerCellule();
        }
        
    }
    public void activerDiagonaleMontante() {
        for (int colonne = nbColonnes; colonne >= 0; colonne--) {
                        matriceCellules[colonne][nbColonnes-colonne].activerCellule();
                    }
        
    }
    public boolean cellulesToutesEteintes(){
        boolean check = false;
        int ligne = 0;
        int colonne = 0;
        while (check==false && ligne<=nbLignes && colonne<=nbColonnes){
            while (check==false && ligne<=nbLignes && colonne<=nbColonnes){
                
                check = matriceCellules[ligne][colonne].getEtat() ;
                ligne+=1;
            }
            ligne=1;
            colonne+=1;
        }
        if (colonne ==nbColonnes+1){
            return true ;
        } else {
            return false;
        }
    }
    @Override
public String toString() {
        String grille ="   |";
        for (int i = 1; i<=nbColonnes; i++){
            grille+=(" "+i+" |");
        }
        grille+="\n";
        
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            grille+=(" "+(ligne+1)+" |");
        
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                
                grille +=(" "+matriceCellules[ligne][colonne]+" |");
            }
            grille+="\n";
        }
        
        
        
        
        
        
        
        return grille;
}
}
