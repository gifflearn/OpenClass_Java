package edu.jf.flux;
import java.io.Serializable;

class Game implements Serializable{
	private String nom, style;
	private double prix;
	//Maintenant, cette variable ne sera pas sérialisée
	  //Elle sera tout bonnement ignorée !
	  private transient Notice notice;  // transient

	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}

	public String toString(){
		return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu : " + this.prix + "\n";
	}	
}
