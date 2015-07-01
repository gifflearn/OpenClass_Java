package edu.jf.lescollections;

import java.util.*;

public class Notions_de_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// L'interface List mod�lise une liste index�e par des entiers.
		// Lorsque l'on ajoute un objet � une liste, il prend un num�ro d'ordre,
		// g�r� par la liste. Lorsque l'on en retire un, il est de la responsabilit� 
		//de l'impl�mentation de la liste de conserver une num�rotation coh�rente.

		//On peut donc toujours demander le n i�me �l�ment d'une liste.

		//L'interface List �tend Collection, et lui ajoute essentiellement deux types de m�thodes :
		//celles qui permettent de manipuler les objets directement � partir de leur num�ro d'ordre, 
		//et celles qui permettent de parcourir la liste dans un sens ou dans l'autre.	
		
		// cr�ation d'une liste de String
		List<String> liste =  new ArrayList<String>() ;

		 // ajout d'�l�ments � cette liste
		liste.add("un") ;
		liste.add("deux") ;
		liste.add("trois") ;

		// cr�ation d'un listIterator sur cette liste
		ListIterator<String> it = liste.listIterator() ;

		
		// add(T t) : permet d'ins�rer un �l�ment dans la liste � l'endroit o� l'on se trouve,
		// c'est-�-dire avant l'�l�ment qui aurait �t� retourn� par un appel � next().
		//Notons que si l'on fait un appel � next() apr�s une telle insertion, ce n'est pas l'�l�ment que
		// l'on vient d'ins�rer qui est retourn�, mais l'�l�ment suivant.
		
		
		 while(it.hasNext()) {
		    // on ajoute un �l�ment suppl�mentaire apr�s chaque
		    // �l�ment de la liste
		   String element = it.next() ;
		   it.add(element +  " et demi") ;
		}

		 // v�rification du r�sultat
		 for (String s : liste) {
		   System.out.println(s) ;
		}
		
	}

}
