package edu.jf.generic;
class TSolo<T> {
	public TSolo() {
		this.valeur = null;
	}
	public TSolo(T pval){
		this.valeur = pval;
	}
	public void setValeur( T pval) {
		this.valeur = pval;
	}
	public T getValeur() {
		return this.valeur;
	}
	
	private T valeur;
}
public class Gen2 {

	public static void main(String[] args) {
		
		TSolo<Integer> val = new TSolo<Integer>(12);
		int nbre = val.getValeur();
		
		TSolo<Double> val2 = new TSolo<Double>(12.);
		double nbre2 = val2.getValeur();
		
		TSolo<String> val3 = new TSolo<String>("Toto");
		String chaine = val3.getValeur();

		
	}

}
