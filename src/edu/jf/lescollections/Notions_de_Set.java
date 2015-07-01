package edu.jf.lescollections;

import java.util.*;

public class Notions_de_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// dans une méthode main
		 // création du set
		Set<String> set =  new HashSet<String>() ;

		 // ajout d'élément
		System.out.println("J'ajoute un : " + set.add("un")) ;
		System.out.println("J'ajoute deux : " + set.add("deux")) ;

		 // ajout d'un doublon : échec
		System.out.println("J'ajoute encore un : " + set.add("un")) ;

		 // affichage de la taille du set
		System.out.println("Taille du set : " + set.size()) ;

	}

}
