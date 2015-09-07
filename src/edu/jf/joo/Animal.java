package edu.jf.joo;
//
abstract class Animal {
	
	protected String couleur;
	protected int poids;
	  
	abstract void crier();
	abstract void deplacement();
	
	protected void boire() {
		System.out.println("Je bois de l'eau");
		
	}
	
	protected void manger(){
		System.out.println("Je mange de la viande");
	}
	
	public String toString() {
		String str = "Je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids;
	    return str;
	}
}
