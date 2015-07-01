package edu.jf.inputclavier;

import java.util.Scanner;

public class Sdz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double tempTO=0;
		int aConvertir=0;
		String choix = "Start",degA=null,degB=null;
		
		System.out.println("Programme de convertisseeurs de températures");
		System.out.println("--------------------------------------------");
		
		
		while (!(choix.equals("0") || choix.equals("1") || choix.equals("2")) ) {
			
			System.out.println("Quelle conversion voulez-vous faire ?");
			System.out.println("Tapez 1 pour le convertisseur Celsius - Fahrenheit");
			System.out.println("Tapez 2 pour le convertisseur Fahrenheit - Celsius");
			System.out.println("Tapez 0 pour sortir");
			choix = sc.nextLine();
			
			
			if (choix.equals("1") || choix.equals("2") ) {
	
				System.out.println("Quelle est la temperature à convertir ?");
				aConvertir = sc.nextInt();
				sc.nextLine();
				
				switch(choix) {
				case "1" :
					// conversion C vers F
					tempTO = arrondi((double)(((9.0/5.0) * aConvertir) + 32.0),1);
					degA = "Celsius";
					degB = "Farhenheit";
					break;
				case "2" :
					// conversion F vers C
					tempTO = arrondi((double)(((aConvertir - 32) * 5) / 9),1);
					degB = "Celsius";
					degA = "Farhenheit";
					break;
				}
				System.out.println("La temperature de "+aConvertir+" degrés " +degA+ " est équivalente à "+tempTO+" degrés "+degB);
				choix = "New";
			} else if (choix.equals("0")) {
				System.out.println("Bye bye");
				break;
			} else { 
				System.out.println("Entrez une valeur correcte !!!");
				System.out.println("------------------------------");
				int i = 0xFE;
				System.out.println("variable i = " + i);
				System.out.println("");
			}
		
			
		 }
		
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
