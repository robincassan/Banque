
public class Lep extends Compte {

	private float tauxLep = 0.015;

	public Lep(float uniqueNumber, float montant, Proprietaire proprietaire, float decouvert) {
		super(uniqueNumber, montant, proprietaire, decouvert);
		// TODO Auto-generated constructor stub
	}

	public void modifierTaux(float nouveauTaux) {
		this.tauxLep = nouveauTaux;
	}

	@Override
	public void verserEspece(float montant) {
		// TODO Auto-generated method stub
		if (this.montant + montant < 7700f) {
			this.montant += montant;
		} else {

			System.out.println(
					"Le montant du versement est trop important, retrait refus�, d�passement du solde maximal autoris� veuillez effectuer un versement d'un montant inf�rieur ");

		}
	}

	@Override
	public void retirerEspece(float montant) {
		// TODO Auto-generated method stub
		if (this.montant - 30.0f > montant) {
			this.montant -= montant;

		}

		System.out.println("Le montant du retrait est sup�rieur au d�couvert autoris� : retrait refus�");
	}

}
