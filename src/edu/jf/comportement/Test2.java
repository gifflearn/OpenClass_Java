package edu.jf.comportement;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage pers = new Guerrier();
	    pers.soigner();		
	    pers.setSoin(new Operation());
	    pers.soigner();
	}

}
