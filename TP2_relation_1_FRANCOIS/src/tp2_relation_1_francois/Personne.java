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
    int nbVoitures ;
    Voiture[] liste_voitures ;
    public Personne( String N, String P){
        nom=N;
        prenom=P;
        liste_voitures = new Voiture [3] ;
        nbVoitures =0 ;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + prenom ;
    return chaine_a_retourner ;
    
    
}
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null){
            return false ;
        }
        if (nbVoitures == 3 ){
                return false;
            }
        liste_voitures[(nbVoitures)]=voiture_a_ajouter;
        nbVoitures+=1 ;
        voiture_a_ajouter.proprietaire=this;
        return true ;       
}
}
