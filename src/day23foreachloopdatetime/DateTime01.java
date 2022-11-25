package day23foreachloopdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		// Java da LocalDate class'i var.
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1); // 2022-09-15   standart format
		
		System.out.println(date1.plusDays(3)); //tarihe 3 ekledi
		System.out.println(date1.plusMonths(2)); // 2 ay ekledi 
		System.out.println(date1.plusYears(2)); // 2 yil ekledi
		
		System.out.println(date1.plusDays(3).plusMonths(2));  // 3 gun ve 2 ay eklendi.
		
		System.out.println(date1.minusDays(11)); // 11 gun geri gitti
		System.out.println(date1.minusMonths(11)); // 2021-10-15   11 ay geri gitti.
		System.out.println(date1.minusYears(5)); // 5 yil geri giti 
		
		System.out.println(date1.plusYears(3).minusMonths(5)); //2025-04-15  3 yil ekledi 5 ay geri geldi.
		
		
		//Java da LocalTime class i var
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		System.out.println(time1.plusMinutes(12)); // 12 dakika ekledi
		System.out.println(time1.plusHours(3)); // 3 saat ekledi.
		System.out.println(time1.minusMinutes(13)); // 13 dakika geri geldi.
		
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
		
		// baska ulkelerin saatini bulmak
		LocalTime time3 = LocalTime.now(ZoneId.of("Europe/London"));
		System.out.println(time3);

		// tarihlerin formatlarini degistirmek
		// tarihlerin formatlarini degistirmek icin DateTimeFormatter class'ini kullaniriz.
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd:MMM:yyyy");
		System.out.println(date1.format(dtf1));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd:MM:yyyy");
		System.out.println(date1.format(dtf2));
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM:dd:yyyy");
		System.out.println(date1.format(dtf3));
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d/MM/yy");
		System.out.println(date1.format(dtf4));
		
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMMM/yyyy");
		System.out.println(date1.format(dtf5));
		
		
		//Zaman Formati deistirmek
		
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(time1.format(dtf6));
		
		DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(time1.format(dtf7));
		
	}

}
