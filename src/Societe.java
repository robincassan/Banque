
public class Societe extends Proprietaire {
	private String gerant;

	public Societe(String nom, String adresse, String gerant) {
		super(nom, adresse);
		this.gerant = gerant;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Societe";
	}

}
