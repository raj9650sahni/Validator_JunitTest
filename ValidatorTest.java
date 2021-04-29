package UserRegis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.Scanner;
import com.UserRegis.URegistration;

public class ValidatorTest {

	private static final String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"
			+ "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})$";
	private static final String firstPattern = "^[A-Z]{1}[a-z]{2,}$";
	private static final String lastPattern = "^[A-Z][a-z]{3,19}$";
	private static final String agePattern = "^[1-9]{1,2}$";
	private static final String phonePattern = "^[1-9]{2}[ ][0-9]{10}$";
	private static final String passwordPattern = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"
			+ "(?=\\S+$).{8,20}$";
	

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue1() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("raj.sahni@bl.co.in", emailPattern));
		}

		@Test
		public void givenEmail_whenNull_shouldReturnFalse() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(false,ur.regex(null, emailPattern));

		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue2() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc@yahoo.com", emailPattern));
		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue3() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc-100@yahoo.com", emailPattern));
		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue4() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc.100@yahoo.com", emailPattern));
		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue5() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc111@abc.com", emailPattern));
		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue6() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc-100@abc.net", emailPattern));
		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue7() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc.100@abc.com.au", emailPattern));
		}

		@Test
		public void givenEmail_whenMatch_shouldReturnTrue8() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc@1.com", emailPattern));
		}
		@Test
		public void givenEmail_whenMatch_shouldReturnTrue9() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc@gmail.com.com", emailPattern));
		}
		@Test
		public void givenEmail_whenMatch_shouldReturnTrue10() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("abc+100@gmail.com", emailPattern));
		}
		
		@Test
		public void givenPassword_whenMatch_shouldReturnTrue1() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("AbcSharma@85763", passwordPattern));
		}
		
		@Test
		public void givenPassword_whenMatch_shouldReturnTrue2() throws Exception {
			URegistration ur = new URegistration();
			assertEquals(true, ur.regex("zbcsharma@85763",passwordPattern));
		}
		
		
	}
	
	

