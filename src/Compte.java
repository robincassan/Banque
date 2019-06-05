
public class Compte {
	private float uniqueNumber;
	private float montant;
	private Proprietaire proprietaire;
	private float decouvert;

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

// methode verserespece
	public float verserEspece(float versement) {
		return this.montant + versement;

	}

// methode retirerespece
	public float retirerEspece(float retrait) {
		return this.montant - retrait;
	}

	// methode virement
	public void virement(Compte compte2, float montant) {
		if (this.proprietaire == compte2.proprietaire) {
			this.montant += montant;
			compte2.montant -= montant;
		}
		this.montant += montant;
		compte2.montant -= montant - 1;
	}

}
