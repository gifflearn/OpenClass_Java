package edu.jf.lescollections;

import java.util.*;

public class Notions_de_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// L'interface List modèlise une liste indexée par des entiers.
		// Lorsque l'on ajoute un objet à une liste, il prend un numéro d'ordre,
		// géré par la liste. Lorsque l'on en retire un, il est de la responsabilité 
		//de l'implémentation de la liste de conserver une numérotation cohérente.

		//On peut donc toujours demander le n ième élément d'une liste.

		//L'interface List étend Collection, et lui ajoute essentiellement deux types de méthodes :
		//celles qui permettent de manipuler les objets directement à partir de leur numéro d'ordre, 
		//et celles qui permettent de parcourir la liste dans un sens ou dans l'autre.	
		
		// création d'une liste de String
		List<String> liste =  new ArrayList<String>() ;

		 // ajout d'éléments à cette liste
		liste.add("un") ;
		liste.add("deux") ;
		liste.add("trois") ;

		// création d'un listIterator sur cette liste
		ListIterator<String> it = liste.listIterator() ;

		
		// add(T t) : permet d'insérer un élément dans la liste à l'endroit où l'on se trouve,
		// c'est-à-dire avant l'élément qui aurait été retourné par un appel à next().
		//Notons que si l'on fait un appel à next() après une telle insertion, ce n'est pas l'élément que
		// l'on vient d'insérer qui est retourné, mais l'élément suivant.
		
		
		 while(it.hasNext()) {
		    // on ajoute un élément supplémentaire après chaque
		    // élément de la liste
		   String element = it.next() ;
		   it.add(element +  " et demi") ;
		}

		 // vérification du résultat
		 for (String s : liste) {
		   System.out.println(s) ;
		}
		
	}

}
