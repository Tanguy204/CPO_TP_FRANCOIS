/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_francois;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
public class TP1_stats_FRANCOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int[] tableauDes = new int[6];

        
        System.out.print("Entrez le nombre d'itérations : ");
        int nombreIterations = scanner.nextInt();

                for (int i = 0; i < nombreIterations; i++) {
            int resultatLancer = random.nextInt(6); 
            tableauDes[resultatLancer]++; 
        }

        
        System.out.println("Résultats des lancers :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) tableauDes[i] / nombreIterations * 100;
            System.out.printf("Face %d : %.2f%%\n", i + 1, pourcentage);
        }
    }
    
}
