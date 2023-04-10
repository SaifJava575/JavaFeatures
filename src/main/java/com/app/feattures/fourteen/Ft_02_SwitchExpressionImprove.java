package com.app.feattures.fourteen;

public class Ft_02_SwitchExpressionImprove {

	public static String switchCaseSinglePattern(String day) {
		String isTodayHoliday = "";
		switch (day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
		case "FRIDAY":
			isTodayHoliday = "Working Day";
			break;

		case "SATURDAY":
		case "SUNDAY":
			isTodayHoliday = "Holiday";
			break;

		default:
			throw new IllegalArgumentException("What's a " + day);
		}
		return isTodayHoliday;
	}

	// Java 14 new Features
	public static String switchMultiExpression(String day) {
		String isTodayHoliday = switch (day) {
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> isTodayHoliday = "Working Day";

		case "SATURDAY", "SUNDAY" -> isTodayHoliday = "Holiday";
		default -> throw new IllegalArgumentException("What's a " + day);
		};
		return isTodayHoliday;
	}

	public static void main(String[] args) {
		// String res = switchCaseSinglePattern("SUNDAY");
		String res = switchMultiExpression("WEDNESDAY");
		System.out.println(res);

	}

}
