package edu.jf.flux;

public class Tarif {
	
	// Classe principale de l'application.
	/*
	* Les classes Chantilly et Chocolat correspondent à deux ingrédients qui peuvent être ajoutés aux desserts. 
	* Pour cela ces classes héritent de DecorateurIngredient. Leurs constructeurs prennent en paramètre 
	* le dessert « nature » qui sera stocké dans l’attribut de DecorateurIngrédient. On note, que l’attribut dessert 
	* de la classe mère est déclaré en « protected » ce qui nous permet de se passer des accesseurs. Les méthodes getLibelle() 
	* et getPrix() sont redéfinies et ainsi on ajoute des fonctionnalités. Par exemple la méthode getLibelle() affiche le libellé 
	* du dessert en rajoutant le libellé de l’ingrédient. Le même principe est utilisé pour la méthode getPrix() pour le calcul du prix.
	*/
	
	        // Méthode principale.
	        public static void main(String[] args)
	        {
	                // Création et affichage d'une gaufre au chocolat.
	                Dessert d1 = new Gaufre();
	                d1 = new Chocolat(d1);
	                // ou 
	                Dessert d1b = new Chocolat(new Gaufre());
	                //La variable d1 pointe vers un objet de type Chocolat qui contient dans son attribut dessert un objet de type Gaufre
	                System.out.println(d1);
	                System.out.println(d1b);
	                // Création et affichage d'une crêpe au chocolat et chantilly.
	                Dessert d2 = new Crepe();
	                d2 = new Chocolat(d2);
	                d2 = new Chantilly(d2);
	                //ou
	                Dessert d2b = new Chantilly(new Chocolat(new Crepe()));
	                // la variable d2 elle pointe vers un objet de type Chantilly qui contient dans son attribut dessert 
	                //un objet de type Chocolat qui possède également un attribut dessert contenant un objet de type Crepe
	                System.out.println(d2);
	                System.out.println(d2b);
	        }
	
}
