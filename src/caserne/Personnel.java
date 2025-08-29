package caserne;

public class Personnel {
	
	
	private String nom;
	private Adresse adresse;
	private String password;
	private Caserne caserne;
	
	
	public Personnel() {
		this("");
	}
	
	public Personnel (String nom) {
		this.nom = nom;
		this.adresse= new Adresse();
	}
	

	public void displayToConsole() {
		System.out.println(this.getNom());
		if(adresse.isValid()) {
			this.adresse.displayToConsole();
		}
	}
	
	public void setCaserne(Caserne caserne) {
		this.caserne = caserne;
	}
	
	public Caserne getCaserne() {
		return caserne;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		Password check = new Password();
		if(check.isValid(password)) {			
			this.password = password;
		}
	}
	
	public String getNom() {

		return this.nom;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public void setAdresse(String numEtRue, String cp, String ville){
		adresse.setNumeroEtRue(numEtRue);
		adresse.setCodePostal(cp);
		adresse.setVille(ville);
	}

	
}
