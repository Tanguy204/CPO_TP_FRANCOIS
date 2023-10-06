/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_francois;

import java.util.Scanner;

/**
 *
 * @author Tanguy
 */
public class TP2_convertisseurObjet_FRANCOIS {

    /**
     * @param args the command line arguments
     */
    public static double main(String[] args) {
        Convertisseur unConvertisseur= new Convertisseur();
        Scanner sc = new Scanner(System.in);
        System.out.println( "Quelle convertion voulez vous faire? " );
        System.out.println(" 1) CelciusVersKelvin");
        System.out.println(" 2) KelvinVersCelsius");
        System.out.println(" 3) CelsiusVersFarenheint");
        System.out.println(" 4) FarenheitVersCelsius ");
        System.out.println(" 5) KelvinVersFarenheint ");
        System.out.println( " 6) FarenheintVersKelvin ");
        int cx = sc.nextInt();
        System.out.println("choisissez maintenant une temperature à convertir");
        double T0= sc.nextInt();
        double T2 = 0;
        double T1 = 0;
        if (cx==1){
            T2 = Convertisseur.CelciusVersKelvin(T0);
        }
        if (cx==2){
            T2=Convertisseur.KelvinVersCelsius(T0);
        }
        if (cx==3){
            T2=Convertisseur.CelsiusVersFarenheint(T0);
        }
        
        if (cx==4){
            T2=Convertisseur.FarenheitVersCelsius(T0);
        }
        if (cx==5){
            T1=Convertisseur.KelvinVersCelsius(T0);
            T2=Convertisseur.CelsiusVersFarenheint(T1);
        }  
        if (cx==6) {
            T1 =Convertisseur.FarenheitVersCelsius(T0);
            T2=Convertisseur.CelciusVersKelvin(T1);
        }  
        return T2;
    }
    
}
