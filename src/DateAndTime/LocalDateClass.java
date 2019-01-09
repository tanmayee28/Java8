package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Current Date
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		//manually giving datee,month,year
		LocalDate date1=LocalDate.of(2018,9,28);
		System.out.println(date1);
		
		LocalDate date2=LocalDate.parse("2017-03-18");
		System.out.println(date2);
		
		//add days in a current date
		LocalDate tommorrow=LocalDate.now().plusDays(1);
		LocalDate dayafterTommorow=LocalDate.now().plusDays(2);
		
		System.out.println("Tommorrow :"+tommorrow);
		System.out.println("DayAfterTommorrow :"+dayafterTommorow);
		
		//add weeks
		LocalDate add2week=LocalDate.now().plusWeeks(2);
		LocalDate add4week=LocalDate.now().plusWeeks(4);
		
		System.out.println("add2week :"+add2week);
		System.out.println("add4week :"+add4week);
		
		//add months
		LocalDate nextMonth=LocalDate.now().plusMonths(1);
		LocalDate nextnextMonth=LocalDate.now().plusMonths(2);
		
		System.out.println("nextMonth :"+nextMonth);
		System.out.println("nextnextMonth :"+nextnextMonth);
		
		//add years
		LocalDate next2Year=LocalDate.now().plusYears(2).plusMonths(2).plusDays(2);
		LocalDate next5Year=LocalDate.now().plusYears(5);
		
		System.out.println("next2Year :"+next2Year);
		System.out.println("next5Year :"+next5Year);
		
		//get day ,week,month from given day
		DayOfWeek day=LocalDate.of(2017,9,28).getDayOfWeek();
		int day2=LocalDate.parse("2019-09-17").getDayOfMonth();
		int dayyear	=LocalDate.now().getDayOfYear();
		
		System.out.println("Day :"+day);
		System.out.println("Day2 :"+day2);
		System.out.println("dayyear :"+dayyear);
		
		//minus days
		LocalDate dayminus=LocalDate.now().minusDays(10);
		System.out.println("dayminus :"+dayminus);
	}

}
