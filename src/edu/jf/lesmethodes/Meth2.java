package edu.jf.lesmethodes;

public class Meth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exemples de surchage de m�thode
		
		String[] tabStr = {"toto", "titi", "tata"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};

		//La m�thode avec un tableau de String sera invoqu�e
		parcourirTableau(tabStr);
		//La m�thode avec un tableau d'int sera invoqu�e
		parcourirTableau(tabInt);
		//La m�thode avec un tableau de String � deux dimensions sera invoqu�e
		parcourirTableau(tabStr2);

	}

	
	 static void parcourirTableau(String[] tabBis)
	  {
	    for(String str : tabBis)
	      System.out.println(str);
	  }  
	 
	 static void parcourirTableau(int[] tabBis)
	  {
	    for(int str : tabBis)
	      System.out.println(str);
	  } 
	 
	 static void parcourirTableau(String[][] tab)
	 {
	   for(String tab2[] : tab)
	   {
	     for(String str : tab2)
	       System.out.println(str);
	   }
	 }
	 
	 static void parcourirTableau(String[][] tab, int i)
	 {
	   for(String tab2[] : tab)
	   {
	     for(String str : tab2)
	       System.out.println(str);
	   }
	 }
}
