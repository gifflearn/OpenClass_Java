package edu.jf.lesmethodes;

public class Str1 {
	
	public static void main (String[] args){
		
		String nbre = new String("1234567");
		char carac = nbre.charAt(4);   //Renverra ici le caractère 5
		System.out.println("Chaine= "+nbre+" charAT(4)= "+carac);
		
		String chaine = new String("la paix niche"), chaine2 = new String();
		chaine2 = chaine.substring(3,13);   //Permet d'extraire "paix niche"
		System.out.println("Chaine= "+chaine+" substring(3,13)= "+chaine2);
		
		
		String mot = new String("anticonstitutionnellement");
		int n = 0;
		System.out.println("mot= "+mot);
		
		n = mot.indexOf('t');           //n vaut 2
		System.out.println("mot.indexOf('t') "+n);
		n = mot.lastIndexOf('t');       //n vaut 24
		System.out.println("mot.lastIndexOf('t') "+n);
		n = mot.indexOf("ti");          //n vaut 2
		System.out.println("mot.indexOf(\"ti\") "+n);
		n = mot.lastIndexOf("ti");      //n vaut 12
		System.out.println("mot.lastIndexOf(\"ti\") "+n);
		n = mot.indexOf('x');           //n vaut -1
		System.out.println("mot.indexOf('x') "+n);
		
		
	}

}
