package edu.jf.inputclavier;
import java.util.Scanner;

public class convalex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rep1=0, reponse=0, fini=0;
		
		while (rep1 == 0) {
			System.out.println("Entrer une temp à convertir");
			reponse =sc.nextInt();
			fini = reponse *9/5+32;
			System.out.println("Temp C : " +reponse + "Temp F : "+fini);
		}
		
		sc.close();
	}

}
