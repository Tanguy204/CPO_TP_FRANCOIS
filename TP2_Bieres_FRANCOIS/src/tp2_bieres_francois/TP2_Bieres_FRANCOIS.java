/*
 * Tanguy François TDC 
 * 
 */
package tp2_bieres_francois;

/**
 *
 * @author Tanguy
 */
public class TP2_Bieres_FRANCOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere une2emeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        une2emeBiere.lireEtiquette();
        
        BouteilleBiere une3emeBiere = new BouteilleBiere("86", 8.6, "Ma Lubullule");
        une3emeBiere.lireEtiquette();
        une3emeBiere.Décapsuler();
        System.out.println(une3emeBiere) ;
        
        
    }
    
}
