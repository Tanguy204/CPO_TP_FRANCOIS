/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_francois;

/**
 *
 * @author Tanguy
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
        nbConversions = 0 ;
    }
    @Override
        public String toString () {
        return "nb de conversions"+ nbConversions;
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
     public static double FarenheitVersKelvin(double tC){
         double TK= (tC + 459.67) / 1.8 ;
         return TK;
     }
     public static double KelvinVersFarenheit(double tC){
         double TK=(tC * 1.8) - 459.67;
         return TK ;
     }
    }
    

