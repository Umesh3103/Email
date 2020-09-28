package com.learning;
import java.util.regex.*;

public class EmailValidation {
	private static final Pattern PIN_CODE = Pattern.compile("^[0-9 a-z A-Z]+");
    private static boolean checkName(String name) {
        return PIN_CODE.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to email validation problem");
		
		boolean flag =checkName("abc");
		if(flag){
			System.out.println("Valid email");
		}
		else{
			System.out.println("Invalid email");
		}
	}
}
