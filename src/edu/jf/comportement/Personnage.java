package edu.jf.comportement;

public abstract class Personnage {
	
	  // PAr default une personnage est pacifiste,ne donne aucun soin et marche
	  //Nos instances de comportement
	  // 
	  // les variables d'instances 
	  
	  //1) des objets (Combatcouteau,Combats pistolets ....) de ( ou référencer par un )  "type" espritCombatif ( c'est une interface implemanter par ces objets )
	  //
	  protected EspritCombatif espritCombatif = new Pacifiste();
	  //2) idem pour soin
	  protected Soin soin = new AucunSoin();
	  //3) idem pour déplacement
	  protected Deplacement deplacement = new Marcher();

	  // Les constructeurs :
	  //
	  //Constructeur par d�faut
	  public Personnage(){}
		
	  //Constructeur avec param�tres
	  public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
	    this.espritCombatif = espritCombatif;
	    this.soin = soin;
	    this.deplacement = deplacement;
	  }
	  
	  // Les mutateurs 
	  //
	  // les getters
	  //
	  //M�thode de d�placement de personnage
	  public void seDeplacer(){
	    //On utilise les objets de d�placement de fa�on polymorphe
	    deplacement.deplacer();
	  }

	  // M�thode que les combattants utilisent
	  public void combattre(){
	    //On utilise les objets de d�placement de fa�on polymorphe
	    espritCombatif.combat();
	  }
		
	  //M�thode de soin
	  public void soigner(){
	    //On utilise les objets de d�placement de fa�on polymorphe
	    soin.soigne();
	  }
	  
	  //
	  // Les setters
	  //
	  //Red�finit le comportement au combat
	  public void setEspritCombatif(EspritCombatif espritCombatif) {
	    this.espritCombatif = espritCombatif;
	  }

	  //Red�finit le comportement de Soin
	  public void setSoin(Soin soin) {
	    this.soin = soin;
	  }

	  //Red�finit le comportement de d�placement
	  public void setDeplacement(Deplacement deplacement) {
	    this.deplacement = deplacement;
	  }
	  
	  
	  
}
