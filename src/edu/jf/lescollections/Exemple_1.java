package edu.jf.lescollections;

import java.util.*;

public class Exemple_1 {

	
	public static void main (String args[]) {
	
	
	// cr�ation d'une collection de String
	Collection<String> collection =  new ArrayList<String>() ;

	 // ajout d'�l�ments � cette collection
	collection.add("un") ;
	collection.add("deux") ;
	collection.add("trois") ;
	
	// test d'appartenance de "deux"
	 boolean b1 = collection.contains("deux") ;
	System.out.println(b1) ;  // affiche true

	 // test d'appartenance de "DEUX"
	 boolean b2 = collection.contains("DEUX") ;
	System.out.println(b2) ;  // affiche false
	
	// parcourir les �l�ments de la collection avec
	 // un it�rateur
	Iterator<String> it = collection.iterator() ;
	 while (it.hasNext()) {
		
	    String element = it.next() ;  // retourne un objet de type String
	    System.out.println(element) ;
	}
	
	//Autre m�thode :
	// balayer les �l�ments de la collection avec
	 // un for each
	 // Cette seconde syntaxe est beaucoup plus l�g�re et lisible que la premi�re. 
	 // Elle est largement suffisante lorsque l'on veut juste parcourir ses �l�ments.
	 //Dans les cas o� l'on a besoin d'interagir avec le contenu de la collection 
	 //au travers de l'it�rateur, elle n'est pas utilisable. 
	
	 for (String element : collection) {
		
	    System.out.println(element) ;
	}
	 
	// pattern de conversion d'une collection en tableau
	 String [] tab = collection.toArray(new String[] {}) ;

	  // affichage du contenu du tableau
	  for (String element : tab) {
	 	
	     System.out.println(element) ;
	 }
	  
	  
	
	}
	
}
