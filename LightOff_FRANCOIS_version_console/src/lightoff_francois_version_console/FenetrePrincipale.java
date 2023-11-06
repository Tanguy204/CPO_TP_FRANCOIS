/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_francois_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

/**
 *
 * @author Tanguy
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;
    int nbCoupsMax;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();

        int nbLignes = 10;
        int nbColonnes = 10;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(36, 36, grille.matriceCellules[i][j], i, j); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
                bouton_cellule.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CelluleGraphique bouton_cellule = (CelluleGraphique) e.getSource();
                        int ligne = bouton_cellule.getLigne();
                        int colonne = bouton_cellule.getColonne();
                        // Vous avez maintenant les coordonnées (ligne, colonne) du bouton cliqué.
                        System.out.println("Bouton cliqué à la ligne : " + ligne + ", colonne : " + colonne);
                    }
                });
                 PanneauGrille.add(bouton_cellule);
                        }
        }
                
                initialiserPartie();
            }
        

    

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.genererMatriceAleatoire(10);
    }
    

   
    public boolean lancerPartie() {
        System.out.println(grille);
        while (grille.cellulesToutesEteintes() == false && nbCoups != nbCoupsMax) {

            System.out.println("Si vous voulez switcher : \n - une ligne tapez 1\n - une colonnes tapez 2\n - une diagonale tapez 3");
            int LoCoD = scanner.nextInt();

            if (LoCoD == 1 || LoCoD == 2) {

                System.out.println("Quelle ligne ou colonne voulez vous switcher ?");
                int cx = scanner.nextInt() - 1;

                if (LoCoD == 1) {
                    grille.activerLigneDeCellules(cx);
                } else {
                    grille.activerColonneDeCellules(cx);
                }
                
                
            } else {

                System.out.println("Si vous voulez switcher:\n - une diagonale montante tapez 1 \n - une diagonale descendante tapez 2");
                int MoD = scanner.nextInt();
                int diagx = 0;
                int diagy = 0;
                if (grille.nbLignes != grille.nbColonnes) {
                    if (grille.nbColonnes < grille.nbLignes) {
                        System.out.println("Sur quelle  ligne voulez vous que votre diagonale commence ?");
                        int debut = scanner.nextInt();
                        diagx = debut;

                    }
                    if (grille.nbColonnes > grille.nbLignes) {
                        System.out.println("Sur quelle colonne voulez vous que votre diagonale commence ?");
                        int debut = scanner.nextInt();
                        diagy = debut;
                    }
                }

                if (MoD == 2) {
                    grille.activerDiagonaleDescendante(diagx, diagy);
                } else {
                    grille.activerDiagonaleMontante(diagx, diagy);
                }

            }
            nbCoups += 1;
            System.out.println(grille);

        }

        if (nbCoups <= nbCoupsMax && grille.cellulesToutesEteintes() == true) {
            
            System.out.println("Bravo vous avez gagné au bout de " + nbCoups + " coups");
            return true;
        }
            
            else {
                System.out.println(grille + "vous avez perdu");
                return false;

            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FenetrePrincipale().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables
}
