/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_francois_version_console;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Tanguy
 */
public class LightOff_FRANCOIS_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenue sur LightOff");
        System.out.println("Taper 1 pour jouer en mode libre ou taper 2 pour les niveaux");
        int LoN = scanner.nextInt();
        if (LoN==2){
            ModeNiveaux niveau = new ModeNiveaux();
            niveau.LancerNiveaux();
        }
        if (LoN==1  ){
            System.out.println("indiquer le nombre de ligne que vous voulez sur votre grille");
            int x = scanner.nextInt();
            System.out.println("indiquer le nombre de colonne que vous voulez sur votre grille");
            int y = scanner.nextInt();
            System.out.println("indiquer le nombre de coups max pour réaliser la grille");
            int nbC = scanner.nextInt();
            Partie partie1= new Partie(x,y,nbC);
            partie1.initialiserPartie();
            partie1.lancerPartie();
        }  
        
                
    }
    
}
