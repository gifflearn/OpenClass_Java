package edu.jf.tableau;

public class Tbl2 {


	public static void main(String[] args) {
	
		
		String tabl[][] = {{"toto", "titi", "tutu"}, {"tata", "tete", "tyty"}};
		 
		 for(String str[] : tabl)
		 {
		  	for(String str2 : str)
		  	{
		      	System.out.println("La valeur est  = " + str2);
		  	}
		  
		 }
		 
		 String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		 int o = 0, p = 0;
		  
		 for(String sousTab[] : tab)
		 {
		   o = 0;
		   for(String str : sousTab)
		   {     
		     System.out.println("La valeur de la nouvelle boucle est  : " + str);
		     System.out.println("La valeur du tableau à l'indice ["+p+"]["+o+"] est : " + tab[p][o]);
		     o++;
		   }
		   p++;
		 }
		 
		
		
	}
	
	
}