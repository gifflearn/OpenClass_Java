package edu.jf.exceptions_;

public class NombreHabitantException extends Exception {

	public NombreHabitantException() {
		System.out.println("Vous essay� d'instancier une classe ville avec un nombre d'habitants n�gatif !");
	}
	public NombreHabitantException(int nbre)
	{
	  System.out.println("Instanciation avec un nombre d'habitants n�gatif.");
	  System.out.println("\t => " + nbre);
	}
}
