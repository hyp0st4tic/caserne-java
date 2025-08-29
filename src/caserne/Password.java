package caserne;

public class Password {
	
	private int minSize;
	private int minSpecialChars;
	public static String specialChars="@&#*-[]";
	
	public Password() {
		this(8, 1);
	}
	
	public Password(int minSize, int minSpecialChars) {
		this.minSize = minSize;
		this.minSpecialChars = minSpecialChars;
	}
	
	public boolean checkSpecialChars(String password) {
		int specialCharsCount = 0;
			for(int i =0;i<password.length();i++) {
				for(int j=0;j<specialChars.length();j++) {
					if(password.charAt(i) == specialChars.charAt(j)) {
						specialCharsCount++;
					}
				}
			}
			return specialCharsCount >= minSpecialChars;
		}
	
	public boolean checkSize(String password) {
		return password!=null && password.length()>=minSize;
	}
	
	public boolean isValid(String password) {
		return checkSize(password) && checkSpecialChars(password);
	}

}
