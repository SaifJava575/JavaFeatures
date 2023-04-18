package com.app.feattures.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface AddFunction {
	int add(int a, int b);
}

public class Ft_05_ForEachLoop {
	
	public static int addMethod(int c , int d) {
		AddFunction fun=(a,b)->{
			return a+b;
		};
		int res=fun.add(c, d);
		return res;
		
	}

	public static void forEachLoop() {
		List<String> list = new ArrayList<String>();
		list.add("Jai");
		list.add("Vivek");
		list.add("Mahesh");
		list.add("Vishal");
		list.add("Naren");
		list.add("Hemant");
		list.add("Vikas");
		list.add("Ajay");

		list.forEach((name) -> System.out.println(name));
	}

	public static void main(String[] args) {
		forEachLoop();
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res=addMethod(a,b);
		System.out.println(res);
	}

}
