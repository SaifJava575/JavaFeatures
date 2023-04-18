package com.app.feattures.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
}

public class Ft_06_ComparatorLambdaExpression {

	public static void ComparatorLambdaExpression() {
		List<Student> list = new ArrayList<Student>();

		// Adding Students
		list.add(new Student(1, "Nidhi"));
		list.add(new Student(3, "Parbhjot"));
		list.add(new Student(2, "Amani"));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Student student : list) {
			System.out.println(student.rollNo + " " + student.name);
		}
	}

	public static void filterLambda() {
		List<Student> list=new ArrayList<Student>();  
		 
        //Adding Students  
        list.add(new Student(1,"Nidhi"));  
        list.add(new Student(3,"Parbhjot"));  
        list.add(new Student(2,"Amani"));  

        // using lambda to filter data  
        Stream<Student> filtered_data = list.stream().filter(s -> s.rollNo > 2);  
 
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                student -> System.out.println(student.name)  
        );  
	}

	public static void main(String[] args) {
		//ComparatorLambdaExpression();
		filterLambda();
	}

}
