
public abstract class Compte {

	protected float uniqueNumber;
	protected float montant;
	protected Proprietaire proprietaire;
	protected float decouvert;

	public Compte(float uniqueNumber, float montant, Proprietaire proprietaire, float decouvert) {
		super();
		this.uniqueNumber = uniqueNumber;
		this.montant = montant = 0f;
		this.proprietaire = proprietaire;
		this.decouvert = decouvert = 0f;
	}

	public float getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(float uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

// methode abstraite verserespece
	public abstract void verserEspece(float montant);

// methode abstraite retirerespece
	public abstract void retirerEspece(float montant);

	// méthode virement
	public void virement(Compte compte2, float montant) {

		if (this.proprietaire == compte2.getProprietaire()) {
			compte2.retirerEspece(montant);
			this.verserEspece(montant);
		} else {
			compte2.retirerEspece(montant + 1);
			this.verserEspece(montant);

		}

		System.out.println("Le montant est supérieur au découvert autorisé : virement refusé");
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

}
