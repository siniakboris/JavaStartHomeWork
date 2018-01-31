package com.gmail.siniakboris;

import java.util.Calendar;
import java.util.Date;

public class Milliseconds {

	public static long millisec(long a, long b) {
		long c = a - b;
		return c;
	}

	public static void main(String[] args) {

		Calendar calendarOne = Calendar.getInstance();
		int month = calendarOne.get(Calendar.MONTH);
		calendarOne.set(Calendar.MONTH, month - 1);

		Calendar calendarTwo = Calendar.getInstance();

		Date dateOne = calendarOne.getTime();
		Date dateTwo = calendarTwo.getTime();

		long timeOne = dateOne.getTime();
		long timeTwo = dateTwo.getTime();

		System.out.println(millisec(timeTwo, timeOne));
	}

}
