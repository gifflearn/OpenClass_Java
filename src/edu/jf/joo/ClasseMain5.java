package edu.jf.joo;

import edu.jf.exceptions_.NombreHabitantException;

public class ClasseMain5 {

	public static void main(String[] args) throws NombreHabitantException, NomVilleException {
		// TODO Auto-generated method stub

              
			    GVille2[] tableau = new GVille2[6];
			    String[] tab = {"Marseille", "lille", "ca", "lyon", "paris", "nantes"};
			    int[] tab2 = {123456, -78456, 654987, 75832165, 1594, 213};

			    for(int i = 0; i < 6; i++){
			      if (i <3){
			        GVille2 V = new GVille2(tab[i], tab2[i], "france");
			        tableau[i] = V;
			      }
			                
			      else{
			        Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
			        tableau[i] = C;
			      }
			    }
			                 
			    //Il ne nous reste plus qu'à décrire tout notre tableau !
			    for(Object v : tableau){
			     // System.out.println(v.decrisToi()+"\n");
			     // Ne fonctionne pas car decrisToi() n'est pas définie pour la classe Object
			     // il faut préciser 	:
			    	System.out.println(((GVille2)v).decrisToi()+"\n"); // transtypage
			    }

	}

}
