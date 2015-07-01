package edu.jf.joo;


public class Test {
		  public static void main(String args[]){
		    
			  // on n'instancie pas la classe animal mais un objet de type Chien ( ou Loup ) que nous avons placé 
			  // dans un objet de type Animal ( ou Objet )
			  
			 // premiere utilisation possible
			    Animal chien = new Chien();
			    chien.crier();
		    
		    
		    // Deuxieme
			  Object obj = new Loup();
			  ((Loup)obj).manger();
			  
			  
			  // On peut utiliser une variable de type Object comme référence à un objet Loup, à un objet Chien
			  //
			  // cette facon ne marche pas
			  // Loup l = obj;
			  //
			  // Celle oui : il faut transtyper !!
			  Loup l = (Loup)obj;
	 
		    
		  }
		}

