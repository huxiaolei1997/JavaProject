package test;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTest {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		System.out.println(localDate.toString() + localTime.toString());
	}
}
