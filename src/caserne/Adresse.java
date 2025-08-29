package caserne;

public class Adresse {
	
	private String numeroEtRue;
	private String codePostal;
	private String ville;
	
	public Adresse() {
		this("", "", "");
	}
	
	public Adresse(String numeroEtRue, String codePostal, String ville) {
		this.numeroEtRue = numeroEtRue;
		this.codePostal = codePostal;
		this.ville = ville;	
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	public void setNumeroEtRue(String numeroEtRue) {
		this.numeroEtRue = numeroEtRue;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getCodePostal() {
		return codePostal;
	}
	
	public String getNumeroEtRue() {
		return numeroEtRue;
	}
	
	public String getVille() {
		return ville;
	}

	public void displayToConsole() {
		System.out.println(this.getNumeroEtRue()+" "+this.getCodePostal()+" "+this.getVille());
	}
	
	public boolean isValid() {
		if(this.getCodePostal() != "" && this.getNumeroEtRue() != "" && this.getVille() != "") {
			return true;
		}
		else {
			return false;
		}
	}
	
}
