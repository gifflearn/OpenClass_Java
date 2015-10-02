package edu.jf.flux;

import java.text.NumberFormat;

public abstract class Dessert {
	
	
	/* on ne doit pas pouvoir instancier la classe Dessert (en effet, on peut commander une gaufre, une crêpe 
	 * mais pas un dessert car trop vague). Pour autant il n'y avait pas de méthode abstraite à ajouter dans 
	 * cet exemple minimaliste (mais on pourrait très bien en ajouter).
	 */
	
	
	private String libelle;// Libellé du dessert.
    private double prix;// Prix du dessert.
    
    // Accesseurs en lecture pour le libellé et le prix.
    public String getLibelle()
    {
            return libelle;
    }
    public double getPrix()
    {
            return prix;
    }
    
    // Accesseurs en écriture pour le libellé et le prix.
    protected void setLibelle(String libelle)
    {
            this.libelle = libelle;
    }
    protected void setPrix(double prix)
    {
            this.prix = prix;
    }
    
    // Méthode utilisée pour l'affichage d'un dessert.
    public String toString()
    {
            NumberFormat format=NumberFormat.getInstance();
            format.setMinimumFractionDigits(2);// 2 chiffres après la virgule suffisent pour l'affichage.
            return getLibelle()+" : "+format.format(getPrix())+"€";
    }
}
