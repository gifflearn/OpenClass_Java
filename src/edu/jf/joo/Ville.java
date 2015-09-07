package edu.jf.joo;

public class Ville {

	  String nomVille;
	  String nomPays;
	  int nbreHabitants;
	  
	  //Constructeur par défaut
	  public Ville(){
	    System.out.println("Création d'une ville !");      
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	  } 
	  
	  //Constructeur avec paramètres
	  //J'ai ajouté un p en première lettre des paramètres.
	  //Ce n'est pas une convention, mais ca peut être un bon moyen de les repérer.
	  public Ville(String pNom, int pNbre, String pPays)
	  {
	    System.out.println("Création d'une ville avec des paramètres !");
	    nomVille = pNom;
	    nomPays = pPays;
	    nbreHabitants = pNbre;
	  } 
}
