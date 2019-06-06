
public class CompteCourant extends Compte {

	public CompteCourant(float uniqueNumber, float montant, Proprietaire proprietaire, float decouvert) {
		super(uniqueNumber, 0.0f, proprietaire, 0.0f);
		// mise à 0 par défaut du montant à la création du compte
		// mise à 0 par défaut du découvert autorisé

	}

// methode modifier le découvert autorisé
	public void modifierDecouvert(float decouvertauto) {
		this.decouvert = decouvertauto;
	}

	// methode verserEspece
	@Override
	public void verserEspece(float montant) {
		this.montant += montant;
	}

	// methode retirerEspece
	@Override
	public void retirerEspece(float montant) {
		if (this.decouvert + this.montant > montant) {
			this.montant -= montant;
		}

		System.out.println("Le montant du retrait est supérieur au découvert autorisé : retrait refusé");
	}

}
