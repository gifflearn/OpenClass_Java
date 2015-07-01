package edu.jf.joo;


class Chien extends Canin implements Rintintin {

public Chien(){
		
	}
	
	public Chien(String couleur,int poids){
		this.couleur = couleur;
		this.poids = poids;
		
	}
	
	void crier() {
		// TODO Auto-generated method stub
	    System.out.println("J'aboie sans raison !"); 
	}

	@Override
	public void faireCalin() {
		// TODO Auto-generated method stub
		System.out.println("Je te fais un GROS CÂLIN");   
	}

	@Override
	public void faireLechouille() {
		// TODO Auto-generated method stub
		System.out.println("Je fais de grosses léchouilles...");
	}

	@Override
	public void faireLeBeau() {
		// TODO Auto-generated method stub
		System.out.println("Je fais le beau !");
	}

}
