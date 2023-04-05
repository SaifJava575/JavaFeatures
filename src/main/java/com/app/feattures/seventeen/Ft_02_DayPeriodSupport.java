package com.app.feattures.seventeen;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ft_02_DayPeriodSupport {

	public static void main(String[] args) {
		String currentDaySupport = DateTimeFormatter.ofPattern("h:m B").format(LocalTime.now());
		System.out.println(currentDaySupport);

	}

}
