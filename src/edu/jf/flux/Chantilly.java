package edu.jf.flux;

public class Chantilly extends decorateurIngredient {

	// Constructeur qui prend en paramètre le dessert.
    public Chantilly(Dessert d)
    {
            dessert = d;
    }
    
	@Override
	// On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chantilly.
	public String getLibelle() {
		// TODO Auto-generated method stub
		return dessert.getLibelle()+", chantilly";
	}

	@Override
	// On additionne le prix du dessert et le prix de l'ingrédient chantilly.
	public double getPrix() {
		// TODO Auto-generated method stub
		return dessert.getPrix()+0.50;
	}

}
