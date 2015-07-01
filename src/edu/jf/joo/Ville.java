package edu.jf.joo;

public class Ville {

	  String nomVille;
	  String nomPays;
	  int nbreHabitants;
	  
	  //Constructeur par d�faut
	  public Ville(){
	    System.out.println("Cr�ation d'une ville !");      
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	  } 
	  
	  //Constructeur avec param�tres
	  //J'ai ajout� un � p � en premi�re lettre des param�tres.
	  //Ce n'est pas une convention, mais �a peut �tre un bon moyen de les rep�rer.
	  public Ville(String pNom, int pNbre, String pPays)
	  {
	    System.out.println("Cr�ation d'une ville avec des param�tres !");
	    nomVille = pNom;
	    nomPays = pPays;
	    nbreHabitants = pNbre;
	  } 
}
