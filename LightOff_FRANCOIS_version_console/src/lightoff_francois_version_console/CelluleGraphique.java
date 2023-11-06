/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_francois_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Tanguy
 */
public class CelluleGraphique extends JButton {

    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int longueur;
    int ligne;
    int colonne;

    public CelluleGraphique(int lar, int longu, CelluleLumineuse cel,int li, int co) {
        celluleLumineuseAssociee = cel;
        largeur = lar;
        longueur = longu;
        ligne=li;
        colonne=co;
        
    }
    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        //this.setText(celluleLumineuseAssociee.toString());
        if (celluleLumineuseAssociee.estEteint()) {
            g.setColor(Color.red);
        }
        g.fillOval(0, 0, 30 , 30);
    }
}


