/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_francois_version_console;

import java.util.Random;

/**
 * Cette classe représente une grille de jeu qui contient des cellules
 * lumineuses.
 *
 * @author Tanguy
 */
public final class GrilleDeJeu {

    Random random = new Random();
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Constructeur de la grille de jeu.
     *
     * @param p_nbLignes Le nombre de lignes dans la grille.
     * @param p_nbColonnes Le nombre de colonnes dans la grille.
     */
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

    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne].eteindreCellule();
            }
        }
    }

    /**
     * Active une ligne, une colonne ou une diagonale aléatoire de cellules.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int Qdiag = 0;
        if (nbColonnes > nbLignes) {
            Qdiag = random.nextInt(Math.abs(nbColonnes - nbLignes));
        }
        int compt = random.nextInt(4);
        int qligne = random.nextInt(nbLignes);
        int qcolonne = random.nextInt(nbColonnes);
        int x;
        int y = 0;
        int z = 0;
        if (nbColonnes >= nbLignes) {
            x = nbLignes;
            if (nbColonnes > nbLignes) {
                y = Qdiag;
            }
        } else {
            z = Qdiag;
            x = nbColonnes;
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
        if (compt == 0) {

            for (int colonne = x; colonne > 0; colonne--) {
                int ligne = nbLignes - colonne;
                matriceCellules[ligne + z][colonne - 1 + y].activerCellule();

            }
        }

    }

    /**
     * Génère une matrice de cellules aléatoire en activant un certain nombre de
     * lignes, colonnes ou diagonales aléatoirement.
     *
     * @param nbTours Le nombre de tours de génération aléatoire.
     */
    public void genererMatriceAleatoire(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 1; i <= nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }

    }

    /**
     * Active toutes les cellules d'une ligne spécifiée.
     *
     * @param idLigne L'indice de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            matriceCellules[idLigne][colonne].activerCellule();
        }

    }

    public void activerColonneDeCellules(int idColonne) {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            matriceCellules[ligne][idColonne].activerCellule();
        }

    }

    public void activerDiagonaleDescendante(int x, int y) {
        int i = nbColonnes;
        int diagx=0;
        int diagy=0;
        if (x!=0){
            diagx = x - 1;
        }
         if (y!=0){
            diagy = y - 1;
         }
        if (nbColonnes < nbLignes) {
            i = nbColonnes;
        }
        if (nbColonnes > nbLignes) {
            i = nbLignes;
        }
        for (int colonne = 0; colonne < i; colonne++) {
            matriceCellules[colonne + diagx][colonne + diagy].activerCellule();
        }

    }

    public void activerDiagonaleMontante(int x, int y) {
        int diagx = 0;
        int diagy = 0;
        int i = nbColonnes;
        if (nbColonnes < nbLignes) {
            i = nbColonnes;
            diagx = Math.abs(i - x);
            diagy = 0;
            
        }
        if (nbColonnes > nbLignes) {
            i = nbLignes;
            diagy = (y - 1);
            
            diagx = 0;
        }
        i -= 1;
        for (int compt = i; compt >= 0; compt--) {
            int ligne;
            ligne = compt + diagx;
            int colonne;
            colonne = i - compt + diagy;
            System.out.println("a" + ligne + colonne + diagx + diagy);
            matriceCellules[ligne][colonne].activerCellule();

        }

    }

    /**
     * Vérifie si toutes les cellules de la grille sont éteintes.
     *
     * @return true si toutes les cellules sont éteintes, sinon false.
     */
    public boolean cellulesToutesEteintes() {
        
        for (int i=0;i<nbLignes;i++){
            for (int j=0;j<nbColonnes;j++){
                if( matriceCellules[i][j].getEtat()==true){
                    return false;
                }
                    
            }
        }
        return true;

    }
    public void copierGrille(GrilleDeJeu matrice) {
        

        
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                this.matriceCellules[i][j].copierCellule( matrice.matriceCellules[i][j]);
            }
        }

        

        
    }

    

    /**
     * Remplace la méthode toString pour obtenir une représentation textuelle de
     * la grille.
     *
     * @return Une chaîne de caractères représentant la grille avec de O quand 
     * c'est éteint et des X quand c'est allumé.
     */
    @Override
    public String toString() {
        String grille = "   |";
        String lignedetiret = "----";
        for (int i = 1; i <= nbColonnes; i++) {
            grille += (" " + i + " |");
            lignedetiret += "----";
        }
        grille += "\n" + lignedetiret + "\n";

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            grille += (" " + (ligne + 1) + " |");

            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                grille += (" " + matriceCellules[ligne][colonne] + " |");
            }
            grille += "\n" + lignedetiret + "\n";
        }

        return grille;
    }
}
