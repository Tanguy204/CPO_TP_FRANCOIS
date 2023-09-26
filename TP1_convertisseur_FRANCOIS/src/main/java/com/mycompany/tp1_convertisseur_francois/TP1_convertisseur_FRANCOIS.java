/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_francois;

import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
public class TP1_convertisseur_FRANCOIS {

    public static void main(String[] args) {
        System.out.println("Saisissez la température à convertir : ");
        Scanner sc = new Scanner(System.in);
        double T = sc.nextDouble();
        System.out.println( "Quelle convertion voulez vous faire? " );
        System.out.println(" 1) CelciusVersKelvin");
        System.out.println(" 2) KelvinVersCelsius");
        System.out.println(" 3) CelsiusVersFarenheint");
        System.out.println(" 4) FarenheitVersCelsius ");
        System.out.println(" 5) KelvinVersFarenheint ");
        System.out.println( " 6) FarenheintVersKelvin ");
        int cx = sc.nextInt();
        if (cx==1){
            double T2=CelciusVersKelvin(T);
        }
        if (cx==2){
            double T2=KelvinVersCelsius(T);
        }
        if (cx==3){
            double T2=CelsiusVersFarenheint(T);
        }
        
        if (cx==4){
            double T2=FarenheitVersCelsius(T);
        }
          
        
            
        }
        
         

     public static double CelciusVersKelvin(double tC){
         double TK= tC+273.15;
        return TK;
         }
     public static double KelvinVersCelsius(double tC){
         double TK= tC-273.15;
        return TK;
         }
     public static double CelsiusVersFarenheint(double tC){
         double TK= tC*1.8 + 32;
        return TK;
         }
     public static double FarenheitVersCelsius(double tC){
         double TK= (tC-32)/1.8 ;
        return TK;
         }
}  
     
