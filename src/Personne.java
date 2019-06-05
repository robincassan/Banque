
public class Personne extends Proprietaire {
	private String dateOfBirth;

	public Personne(String nom, String adresse, String dateOfBirth) {
		super(nom, adresse);
		this.dateOfBirth = dateOfBirth;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Personne";
	}

}
