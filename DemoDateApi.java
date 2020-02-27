package com.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import javax.print.attribute.standard.Chromaticity;

public class DemoDateApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1981, Month.JULY, 11);
		System.out.println(d1);
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.of(04, 13);
		System.out.println(t2);
		
		LocalTime t3 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t3);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		System.out.println(ZoneId.systemDefault());
		
		System.out.println("\nAdd 1 week to current date");
		LocalDate d2 = LocalDate.now().plusWeeks(1);
		System.out.println(d2);
		System.out.println(LocalDate.now().plus(1, ChronoUnit.WEEKS));
		
		System.out.println("\nGet next tuesday");
		System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		
		System.out.println("\nGet second saturday of next month");
		LocalDate d3 = LocalDate.now();
		
		LocalDate d4 = LocalDate.of(d3.getYear(), d3.getMonth().plus(1), 1);
		System.out.println(d4.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
		
		
	}

}
