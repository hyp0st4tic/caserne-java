package caserne;

public class Pompier extends Personnel{
	
	private String grade;
	
	public Pompier(String grade, String nom) {
		super(nom);
		this.grade = grade;
	}

}
