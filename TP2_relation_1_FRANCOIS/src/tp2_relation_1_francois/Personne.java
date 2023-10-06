/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_francois;

/**
 *
 * @author Tanguy
 */
public class Personne {
    
    String nom ;
    String prenom ;
    public Personne( String N, String P){
        nom=N;
        prenom=P;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + prenom ;
    return chaine_a_retourner ;
    
    
}
}
