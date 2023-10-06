/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_francois;

/**
 *
 * @author Tanguy
 */
public class Voiture {
    String Modele ;
    String Marque ;
    int PuissanceCV ;
    public Voiture( String M, String MQ , int P){
        Modele=M;
        Marque=MQ;
        PuissanceCV=P;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Marque + Modele + "\n"+PuissanceCV;
    return chaine_a_retourner ;
}
}
