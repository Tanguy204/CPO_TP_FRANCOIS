/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_francois;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
public class TP1_GuessMyNumber_FRANCOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("choisissez votre niveau de difficulté taper 1 pour facile et 2 pour normale et 3 pour difficile");
        int N = sc.nextInt();
        System.out.println("Essaye de deviner le nombre. ");
        int d=101;
        int T=0;
        while (d!=n){
            
            d = sc.nextInt();
            T+=1;
            if (d<n){
                System.out.println("Le chiffre est plus grand que "+d);  
                } 
            if (d>n){
                System.out.println("Le chiffre est plus petit que "+d);
            }
            
        }
        System.out.println("Vous avez gagné au bout de " + T + " tentatives"); 
    }
    
}
