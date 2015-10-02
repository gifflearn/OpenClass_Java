package edu.jf.flux;

public class Chocolat extends decorateurIngredient {
	 // Constructeur qui prend en paramètre le dessert.
    public Chocolat(Dessert d)
    {
            dessert = d;
    }
    
    // On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chocolat.
    public String getLibelle()
    {
            return dessert.getLibelle()+", chocolat";
    }
    
    // On additionne le prix du dessert et le prix de l'ingrédient chocolat.
    public double getPrix()
    {
            return dessert.getPrix()+0.20;
    }
    
    /*Il est tout à fait possible de transformer la classe Chocolat en classe abstraite qui servira de modèle 
     * à des classes concrètes ChocolatNoir, ChocolatBLanc... L’implémentation ne devrait pas être délicate. 
     * Il faut juste penser que les classes concrètes comme ChocolatNoir devront implémenter toutes les méthodes 
     * abstraites de DecorateurIngredient et de Chocolat.*/
}
