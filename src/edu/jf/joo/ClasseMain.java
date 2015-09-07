package edu.jf.joo;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville ville1 = new Ville();
		Ville ville2 = new Ville("Marseille",123456789,"France");
		Ville ville3 = new Ville();
		
		//Par contre, notre objet pr�sente un gros d�faut : les variables d'instance 
		//qui le caract�risent sont accessibles dans votre classe contenant votre main ! 
		// Ceci implique que vous pouvez directement modifier les attributs de la classe
		// Pas bien !!
		  Ville ville =  new Ville();
		    System.out.println(ville.nomVille);
		    ville.nomVille = "la tête à toto ! ! ! !";
		    System.out.println(ville.nomVille);
		                
		    ville2.nomPays = "La tête à tutu ! ! ! ! ";
		    System.out.println(ville2.nomPays);
		  
		    //C'est tr�s risqu�, et la plupart des programmeurs Java vous le diront. 
		    //Dans la majorit� des cas, nous allons contr�ler les modifications des variables de classe,
		    //de mani�re � ce qu'un code ext�rieur ne fasse pas n'importe quoi avec nos objets !
		    //En plus de �a, imaginez que vous souhaitiez faire quelque chose � chaque fois qu'une valeur change ; 
		    //si vous ne prot�gez pas vos donn�es, ce sera impossible � r�aliser�
		    //C'est pour cela que nous prot�geons nos variables d'instance en les d�clarant private
		    
		    
		    
		    GVille v = new GVille();
		    System.out.println("Le nombre d'instances de la classe Ville est : " + GVille.nbreInstances);
		    System.out.println("Le nombre d'instances de la classe Ville est : " + GVille.getNbreInstancesBis());
		    
		    GVille v1 = new GVille("Marseille", 123456, "France");
		    System.out.println("Le nombre d'instances de la classe Ville est : " + GVille.nbreInstances);
		    System.out.println("Le nombre d'instances de la classe Ville est : " + GVille.getNbreInstancesBis());
		    
		    GVille v2 = new GVille("Rio", 321654, "Brésil");
		    System.out.println("Le nombre d'instances de la classe Ville est : " + GVille.nbreInstances);
		    System.out.println("Le nombre d'instances de la classe Ville est : " + GVille.getNbreInstancesBis());
		      
		    
		    System.out.println("\n\n"+v1.decrisToi());
		    System.out.println(v.decrisToi());
		    System.out.println(v2.decrisToi()+"\n\n");
		    System.out.println(v1.comparer(v2));
		    

		    System.out.println("\n v = "+v.getNomVille()+" ville de  "+v.getNbreHabitants()+ " habitants se situant en "+v.getNomPays());
		    System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		    System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		            
		    /*
		      Nous allons interchanger les Villes v1 et v2
		      tout �a par l'interm�diaire d'un autre objet Ville.        
		    */       
		    GVille temp = new GVille();
		    temp = v1;
		    v1 = v2;
		    v2 = temp;
		           
		    System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		    System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

		    /*       
		      Nous allons maintenant interchanger leurs noms
		      cette fois par le biais de leurs mutateurs.
		    */   
		    v1.setNomVille("Hong Kong");
		    v2.setNomVille("Djibouti");
		          
		    System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		    System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
	}

}
