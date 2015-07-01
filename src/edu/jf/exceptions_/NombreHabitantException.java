package edu.jf.exceptions_;

public class NombreHabitantException extends Exception {

	public NombreHabitantException() {
		System.out.println("Vous essayé d'instancier une classe ville avec un nombre d'habitants négatif !");
	}
	public NombreHabitantException(int nbre)
	{
	  System.out.println("Instanciation avec un nombre d'habitants négatif.");
	  System.out.println("\t => " + nbre);
	}
}
