package caserne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testIsValid {

	private Password pc;
	
	@BeforeAll
	void setup() {
		pc = new Password();
	}
	
	@Test
	void testIsValid() {
		pc.isValid("password");
	}

}
