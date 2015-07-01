package edu.jf.lescollections;

import java.util.*;

public class Exemple_1 {

	
	public static void main (String args[]) {
	
	
	// création d'une collection de String
	Collection<String> collection =  new ArrayList<String>() ;

	 // ajout d'éléments à cette collection
	collection.add("un") ;
	collection.add("deux") ;
	collection.add("trois") ;
	
	// test d'appartenance de "deux"
	 boolean b1 = collection.contains("deux") ;
	System.out.println(b1) ;  // affiche true

	 // test d'appartenance de "DEUX"
	 boolean b2 = collection.contains("DEUX") ;
	System.out.println(b2) ;  // affiche false
	
	// parcourir les éléments de la collection avec
	 // un itérateur
	Iterator<String> it = collection.iterator() ;
	 while (it.hasNext()) {
		
	    String element = it.next() ;  // retourne un objet de type String
	    System.out.println(element) ;
	}
	
	//Autre méthode :
	// balayer les éléments de la collection avec
	 // un for each
	 // Cette seconde syntaxe est beaucoup plus légère et lisible que la première. 
	 // Elle est largement suffisante lorsque l'on veut juste parcourir ses éléments.
	 //Dans les cas où l'on a besoin d'interagir avec le contenu de la collection 
	 //au travers de l'itérateur, elle n'est pas utilisable. 
	
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
