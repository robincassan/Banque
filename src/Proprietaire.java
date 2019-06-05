import java.util.ArrayList;

public abstract class Proprietaire {

	private String nom;
	private String adresse;
	private ArrayList<Compte> comptes;

	public Proprietaire(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public abstract String getType();
}
