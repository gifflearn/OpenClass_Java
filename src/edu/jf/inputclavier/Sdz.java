package edu.jf.inputclavier;

import java.util.Scanner;

public class Sdz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Saisissez un entier : ");
	    int i = sc.nextInt();
	    System.out.println(i + " Saisissez une chaîne : ");
	    
	    //On vide la ligne avant d'en lire une autre ( n'est pas fait par nextInt )
	    //nextLine est la seule instruction à repositionner la tete de lecture
	    sc.nextLine();
	    
	    String str = sc.nextLine();      
	    System.out.println(str + " 5FIN ! ");
	    sc.close();
		
	}

}
