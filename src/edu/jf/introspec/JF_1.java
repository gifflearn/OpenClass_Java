package edu.jf.introspec;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JF_1 {

	public static void main(String[] args) {
		// Deux façon de récuperer des objet Class :
		Class c = String.class;
		Class c2 = new String().getClass();
		
		// Utilisation d'un objet Class :
		//
		// connaitre la superclass d'un objet
		System.out.println("La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());
		//
		  //La méthode getInterfaces retourne un tableau de Class
		  Class[] faces = c.getInterfaces();
		  //Pour voir le nombre d'interfaces
		  System.out.println("Il y a " + faces.length + " interfaces implémentées");
		  //On parcourt le tableau d'interfaces
		  for(int i = 0; i < faces.length; i++)
		    System.out.println(faces[i]);
		  
		// La liste des methodes de la classe :
		  //

		Method[] m = c.getMethods();
			                
		System.out.println("\nIl y a " + m.length + " méthodes dans cette classe : \n");
		//On parcourt le tableau de méthodes
		for(int i = 0; i < m.length; i++)
		  {
		    System.out.println(m[i]);

		    Class[] p = m[i].getParameterTypes();
		    for(int j = 0; j < p.length; j++)
		      System.out.println(p[j].getName());

		    System.out.println("----------------------------------\n");
		  }
		
		// les variables de classe :
		  Field[] m2 = c.getDeclaredFields();

		  System.out.println("\nIl y a " + m2.length + " champs dans cette classe : \n");
		  //On parcourt le tableau de méthodes
		  for(int i = 0; i < m2.length; i++)
		    System.out.println(m2[i].getName());
		  
		// La liste des constructeurs :
		  //
		  Constructor[] construc = c.getConstructors();   
		  System.out.println("\n\nIl y a " + construc.length + " constructeurs dans cette classe : \n");
		  //On parcourt le tableau des constructeurs
		  for(int i = 0; i < construc.length; i++){
		    System.out.println(construc[i].getName());

		  Class[] param = construc[i].getParameterTypes();                        
		  for(int j = 0; j < param.length; j++)
		    System.out.println(param[j]);

		  System.out.println("-----------------------------\n");
		  }
			
	}

}
