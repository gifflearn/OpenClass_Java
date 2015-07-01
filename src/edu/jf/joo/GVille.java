package edu.jf.joo;

public class GVille {
	
	 
	 
	private String nomVille;
	  private String nomPays;
	  private int nbreHabitants;
	  private char categorie;
	  
	//Variables publiques qui comptent les instances
	  public static int nbreInstances = 0;

	  //Variable privée qui comptera aussi les instances
	  private static int nbreInstancesBis = 0; 
	  

	  /**
	 * @return the nbreInstances
	 *  Toutes les méthodes de classe n'utilisant que des variables de classe doivent être déclarées static.
	 *  On les appelle des méthodes de classe, car il n'y en a qu'une pour toutes vos instances. 
	 *  Par contre ce n’est plus une méthode de classe si celle-ci utilise des variables d'instance en plus de 
	 *  variables de classe…
	 */
	public static int getNbreInstancesBis() {
		return nbreInstances;
	}


	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @return the nbreHabitants
	 */
	public int getNbreHabitants() {
		return nbreHabitants;
	}

	/**
	 * @return the categorie
	 */
	public char getCategorie() {
		return categorie;
	}


	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @param nomPays the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @param nbreHabitants the nbreHabitants to set
	 */
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}
	
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}

	  
	  
	  //Constructeur par défaut
	  public GVille(){
	    System.out.println("Création d'une ville !");      
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	    this.setCategorie();
	  //On incrémente nos variables à chaque appel aux constructeurs
	    nbreInstances++;
	    nbreInstancesBis++;
	  } 
	  
	  //Constructeur avec paramètres
	  //J'ai ajouté un « p » en première lettre des paramètres.
	  //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
	  public GVille(String pNom, int pNbre, String pPays)
	  {
	    System.out.println("Création d'une ville avec des paramètres !");
	    nomVille = pNom;
	    nomPays = pPays;
	    nbreHabitants = pNbre;
	    this.setCategorie();
	  //On incrémente nos variables à chaque appel aux constructeurs
	    nbreInstances++;
	    nbreInstancesBis++;
	  } 
	  
	  //Définit la catégorie de la ville
	  private void setCategorie() {
	 
	    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
	    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

	    int i = 0;
	    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
	      i++;

	    this.categorie = categories[i];
	  }

	  //Retourne la description de la ville
	  public String decrisToi(){
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
	  }

	  //Retourne une chaîne de caractères selon le résultat de la comparaison
	  public String comparer(GVille v1){
	    String str = new String();

	    if (v1.getNbreHabitants() > this.nbreHabitants)
	      str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille;
	     
	    else
	      str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille();
	     
	    return str;
	  }
}
