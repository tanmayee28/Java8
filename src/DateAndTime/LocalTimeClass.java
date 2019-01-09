package DateAndTime;

import java.time.LocalTime;

public class LocalTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println("time :"+time);
		
		LocalTime lotime=LocalTime.parse("06:30").plusHours(18);
		System.out.println(lotime);
		
		LocalTime tm=LocalTime.of(12,30).minusMinutes(12).minusSeconds(75);
		System.out.println("tm :"+tm);
	
		int hr=	LocalTime.now().getHour();
		int min	=LocalTime.now().getMinute();
		int sec	=LocalTime.now().getSecond();
		int nsec=LocalTime.now().getNano();
		
		System.out.println("Hours :"+hr);
		System.out.println("Minutes :"+min);
		System.out.println("Seconds :"+sec);
		System.out.println("Nano Seconds :"+nsec);
		
		LocalTime m=LocalTime.MAX;
		System.out.println("Max time :"+m);
		
		LocalTime minimum=LocalTime.MIN;
		System.out.println("Minimum :"+minimum);
		
		LocalTime noon=LocalTime.NOON;
		System.out.println("NOON :"+noon);
	}

}
