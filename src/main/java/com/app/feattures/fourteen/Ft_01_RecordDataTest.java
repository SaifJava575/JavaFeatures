package com.app.feattures.fourteen;

record StudentRecords(Long rollNo, String name, int age, String email) {

}

public class Ft_01_RecordDataTest {

	public static void main(String[] args) {
		 StudentRecords s = new StudentRecords
	                (24l, "Robert", 24,"info@javatechonline.com");
	         
	        System.out.println(s.name());
	        System.out.println(s.email());
	        System.out.println(s);
	    }
	}


