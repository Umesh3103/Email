package com.learning;
import java.util.regex.*;

public class EmailValidation {
	private static final Pattern PIN_CODE = Pattern.compile("^[0-9 a-z A-Z]+([_+-.]{0,1}[0-9 a-z A-Z]+)[@][0-9 a-z A-Z]+[.][a-z A-Z]{2,4}");
    private static boolean checkName(String name) {
        return PIN_CODE.matcher(name).matches();
    }

	public static void main(String[] args) {
		System.out.println("Welcome to email validation problem");
		
		boolean flag =checkName("abc.xyz@gmail.com");
		if(flag){
			System.out.println("Valid email");
		}
		else{
			System.out.println("Invalid email");
		}
	}
}
