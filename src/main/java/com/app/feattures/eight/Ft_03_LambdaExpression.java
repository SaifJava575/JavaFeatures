package com.app.feattures.eight;

@FunctionalInterface // It is optional
interface Drawable {
	public void draw();
}

public class Ft_03_LambdaExpression {

	public static void lamdaMethods() {
		int width = 10;

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}

	public static void main(String[] args) {
		lamdaMethods();
	}

}
