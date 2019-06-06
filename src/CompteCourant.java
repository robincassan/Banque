
public class CompteCourant extends Compte {

	public CompteCourant(float uniqueNumber, float montant, Proprietaire proprietaire, float decouvert) {
		super(uniqueNumber, 0.0f, proprietaire, 0.0f);
		// mise � 0 par d�faut du montant � la cr�ation du compte
		// mise � 0 par d�faut du d�couvert autoris�

	}

// methode modifier le d�couvert autoris�
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

		System.out.println("Le montant du retrait est sup�rieur au d�couvert autoris� : retrait refus�");
	}

}
