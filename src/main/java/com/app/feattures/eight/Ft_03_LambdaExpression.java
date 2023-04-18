package com.app.feattures.eight;

@FunctionalInterface // It is optional
interface Drawable {
	public void draw();
}

@FunctionalInterface
interface MulInterface {
	int mul(int a, int b);
}

@FunctionalInterface
interface HelloWorld {
	String sayHello(String name);
}

public class Ft_03_LambdaExpression {

	public static void lamdaMethods() {
		int width = 10;
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}

	public static int lambdaMul() {
		MulInterface mul = (a, b) -> {
			return a * b;
		};
		int res = mul.mul(10, 20);
		return res;
	}

	public static String multipleStatementLambdaExapression() {
		HelloWorld helFun = (String name) -> {
			String title = "Sekh";
			return title + name;
		};
		String res = helFun.sayHello("Saifuddin");
		return res;
	}

	// Lambda Expression With thread
	public static void threadLambda() {
		Runnable r2 = () -> {
			System.out.println("Thread2 is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}

	public static void main(String[] args) {
		lamdaMethods();
		int res = lambdaMul();
		System.out.println(res);

		String ans = multipleStatementLambdaExapression();
		System.out.println(ans);
		
		threadLambda();
	}

}
