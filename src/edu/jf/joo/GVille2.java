package edu.jf.joo;

import edu.jf.exceptions_.NombreHabitantException;

public class GVille2 {

	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;

	// Variables publiques qui comptent les instances
	public static int nbreInstances = 0;

	// Variable priv�e qui comptera aussi les instances
	protected static int nbreInstancesBis = 0;

	/**
	 * @return the nbreInstances Toutes les m�thodes de classe n'utilisant que
	 *         des variables de classe doivent �tre d�clar�es static. On les
	 *         appelle des m�thodes de classe, car il n'y en a qu'une pour
	 *         toutes vos instances. Par contre ce n�est plus une m�thode de
	 *         classe si celle-ci utilise des variables d'instance en plus de
	 *         variables de classe�
	 */
	public static int getNbreInstancesBis() {
		return nbreInstances;
	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/**
	 * @return the nbreHabitants
	 */
	public int getNbreHabitants() {
		return nbreHabitants;
	}

	/**
	 * @return the categorie
	 */
	public char getCategorie() {
		return categorie;
	}

	/**
	 * @param nomVille
	 *            the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @param nomPays
	 *            the nomPays to set
	 */
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	/**
	 * @param nbreHabitants
	 *            the nbreHabitants to set
	 */
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}

	/**
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}

	// Constructeur par d�faut
	public GVille2() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
		// On incr�mente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
	}

	// Constructeur avec param�tres
	// J'ai ajout� un � p � en premi�re lettre des param�tres.
	// Ce n'est pas une convention, mais �a peut �tre un bon moyen de les
	// rep�rer.
	public GVille2(String pNom, int pNbre, String pPays)
			throws NombreHabitantException, NomVilleException { // Attention ne permets pas de lever plusieurs exceptions mais l'une ou l'autre 

		if (pNbre < 0)
			throw new NombreHabitantException(pNbre);
		if (pNom.length() <3)
			throw new NomVilleException("Le nom de la ville est inferieur à 3 caracteres : "+pNom);
		else {
			System.out.println("Création d'une ville avec des paramètres !");
			nomVille = pNom;
			nomPays = pPays;
			nbreHabitants = pNbre;
			this.setCategorie();
			// On incrémente nos variables à chaque appel aux constructeurs
			nbreInstances++;
			nbreInstancesBis++;
		}
	}

	// D�finit la cat�gorie de la ville
	private void setCategorie() {

		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000,
				5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length
				&& this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
	}

	// Retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays
				+ ", elle comporte : " + this.nbreHabitants
				+ " habitant(s) => elle est donc de cat�gorie : "
				+ this.categorie;
	}

	public String toString() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays
				+ ", elle comporte : " + this.nbreHabitants
				+ " => elle est donc de cat�gorie : " + this.categorie;
	}

	// Retourne une cha�ne de caract�res selon le r�sultat de la comparaison
	public String comparer(GVille2 v1) {
		String str = new String();

		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNomVille() + " est une ville plus peupl�e que "
					+ this.nomVille;

		else
			str = this.nomVille + " est une ville plus peupl�e que "
					+ v1.getNomVille();

		return str;
	}

	// red�finition des m�thodes hashCode() et equals()

	public int hashCode() {
		// On d�finit un multiplication impair, de pr�f�rence un nombre premier
		// Ceci afin de garantir l'unicit� du r�sultat final
		final int prime = 31;
		// On d�finit un r�sultat qui sera renvoy� au final
		int result = 1;
		// On ajoute en eux la multiplication des attributs et du multiplicateur
		result = prime * result + categorie;
		result = prime * result + nbreHabitants;
		// Lorsque vous devez g�rer des hashcodes avec des objets dans le mode
		// de calcul
		// Vous devez v�rifier si l'objet n'est pas null, sinon vous aurez une
		// erreur
		result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
		result = prime * result
				+ ((nomVille == null) ? 0 : nomVille.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		// On v�rifie si les r�f�rences d'objets sont identiques
		if (this == obj)
			return true;

		// On v�rifie si l'objet pass� en param�tre est null
		if (obj == null)
			return false;

		// On s'assure que les objets sont du m�me type, ici de type Ville
		// La m�thode getClass retourne un objet Class qui repr�sente la classe
		// de votre objet
		// Nous verrons �a un peu plus tard...
		if (getClass() != obj.getClass())
			return false;

		// Maintenant, on compare les attributs de nos objets
		GVille2 other = (GVille2) obj;
		if (categorie != other.categorie)
			return false;
		if (nbreHabitants != other.nbreHabitants)
			return false;
		if (nomPays == null) {
			if (other.nomPays != null)
				return false;
		} else if (!nomPays.equals(other.nomPays))
			return false;

		if (nomVille == null) {
			if (other.nomVille != null)
				return false;
		} else if (!nomVille.equals(other.nomVille))
			return false;

		return true;
	}

	public final int maMethode() {
		// M�thode ne pouvant pas �tre surcharg�e
		return 2;
	}
}
