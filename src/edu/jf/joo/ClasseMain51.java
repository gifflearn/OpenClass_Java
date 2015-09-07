package edu.jf.joo;

public class ClasseMain51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

              
			    GVille2[] tableau = new GVille2[6];
			    String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
			    int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

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
			                 
			    //Il ne nous reste plus qu'� d�crire tout notre tableau !
			    for(Object v : tableau){
			     // System.out.println(v.decrisToi()+"\n");
			     // Ne fonctionne pas car decrisToi() n'est pas d�finie pour la classe Object
			     // il faut pr�ciser 	:
			    	System.out.println(((GVille2)v).decrisToi()+"\n"); // transtypage
			    }

	}

}
