package edu.jf.tableau;

import java.util.Scanner;

public class Tbl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	char tableauCharactere[] = {'a','b','c','d','e','f','g'};
	char reponse=' ', carac=' ';
	boolean trouve = false;
	Scanner sc = new Scanner(System.in);
	
		do{
				System.out.println("Entrez un caractere");
				carac = sc.nextLine().charAt(0);
				trouve = false;
				
				for ( char tbCar : tableauCharactere) {
					
					if (tbCar==carac) {
						System.out.println("Trouvé");
						trouve = true;
						break;
					} 
				}
				if (!trouve) System.out.println("Pas trouvé!");
				
				  do{
					    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
					    reponse = sc.nextLine().charAt(0);
				  }while(reponse != 'N' && reponse != 'O' && reponse != 'n' && reponse != 'o');
				  	
		}while (reponse =='O' || reponse =='o');

   }
}