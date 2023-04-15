package com.app.feattures.seven;

public class Ft_01_SwitchCaseSelector {

	public static void switchcase(String day) {
		switch (day) { // switch on String selector
		case "MON":
			System.out.println("Monday");
			break;
		case "TUE":
			System.out.println("Tuesday");
			break;
		case "WED":
			System.out.println("Wednesday");
			break;
		case "THU":
			System.out.println("Thursday");
			break;
		case "FRI":
			System.out.println("Friday");
			break;
		case "SAT":
			System.out.println("Saturday");
			break;
		case "SUN":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		String day = "SAT";
		switchcase(day);
	}

}
