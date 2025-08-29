package caserne;

public class Prog {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnel marc = new Personnel("Marc");
		marc.setAdresse("14 rue du bambou", "14880", "colleville");
		marc.displayToConsole();
		
		Password pass = new Password();
		
		System.out.println(pass.checkSpecialChars("Max123456@"));
		
	}

}
