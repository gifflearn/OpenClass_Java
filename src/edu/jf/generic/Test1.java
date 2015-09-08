package edu.jf.generic;
class Solo {
	public Solo() {
		this.valeur = null;
	}
	public Solo(Object pval){
		this.valeur = pval;
	}
	public void setValeur( Object pval) {
		this.valeur = pval;
	}
	public Object getValeur() {
		return this.valeur;
	}
	
	private Object valeur;
}
public class Test1 {

	public static void main(String[] args) {
		
		Solo val = new Solo(12);
		int nbre = (Integer)val.getValeur();

	}

}
