package edu.jf.joo;

public class ClasseMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//D�finition d'un tableau de villes null
		GVille2[] tableau = new GVille2[6];
		        
		//D�finition d'un tableau de noms de Villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers �l�ments du tableau seront des Villes
		//et le reste des capitales
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
		for(Object obj : tableau){
		  System.out.println(obj.toString()+"\n");
		}
		// fonctionne bien si methode toString red�finie dans GVille2 et Capitale
		//sinon  la m�thode toString ulis�e sera celle de la classe objet et le r�sultat sera diff�rent
		
		
		
		
		//System.out.println(v.toString());
		//Est �quivalent �
		//System.out.println(v);
		//si toString a �t� redefini dans la classe de v ( GVille2) 
		
		
		
	}
}
