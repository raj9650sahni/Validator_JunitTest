package com.UserRegis;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URegistration {
	
	
	public boolean regex(String exp, String regexName) {

		Pattern p = Pattern.compile(regexName);
		Matcher m = p.matcher(exp);
		boolean b = m.matches();
		if (b == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public int choose() {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}


}
