/*
 * 
 * 
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez deux entiers");
        int entier1 = sc.nextInt();
        int entier2 = sc.nextInt();
        System.out.println("les entiers sont" + entier1 +" et "+ entier2);
        System.out.println("la somme"+ (entier1+entier2 ));
        int dif = entier1-entier2;
        System.out.println( "la différence" + dif );
        System.out.println("le produit" + entier1*entier2 );
        System.out.println("le quotient entier est " + entier1/entier2 + "et un reste de"+ (entier1%entier2));
    }
}
