
public class Ldd extends Compte {

	private float tauxLdd;

	public Ldd(float uniqueNumber, float montant, Proprietaire proprietaire, float decouvert) {
		super(uniqueNumber, montant, proprietaire, decouvert);
		this.tauxLdd = 0.01f;
		// TODO Auto-generated constructor stub
	}

	public void modifierTaux(float nouveauTaux) {
		this.tauxLdd = nouveauTaux;
	}

	@Override
	public void verserEspece(float montant) {
		// TODO Auto-generated method stub
		if (this.montant + montant < 12000f) {
			this.montant += montant;
		} else {

			System.out.println(
					"Le montant du versement est trop important, retrait refusé, dépassement du solde maximal autorisé veuillez effectuer un versement d'un montant inférieur ");

		}
	}

	@Override
	public void retirerEspece(float montant) {
		// TODO Auto-generated method stub
		if (this.montant - 15.0f > montant) {
			this.montant -= montant;

		}

		System.out.println("Le montant du retrait est supérieur au découvert autorisé : retrait refusé");
	}
// METHODE APPLIQUER interets

	public void appliquerInteret() {
		this.montant = this.montant * (1 + this.tauxLdd);
	}
}
