package com.app.feattures.seventeen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ft_04_SinglelineJavaListInitialization {
	
	public static void main(String[] args) {
		
		//JAVA 9 Features
		List<String> phonetics = Arrays.asList("alpha", "beta", "charile");
		System.out.println(phonetics);
		
		//Modify the java17 features
		ArrayList<String> phonetics1 = new ArrayList<String>() {{
			  add("alpha");
			  add("beta");
			  add("charlie");
			}};
			System.out.println(phonetics1);
	}

}
