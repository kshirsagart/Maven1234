package program3;

import java.time.LocalDate;
import java.time.LocalTime;
public class _4CurrentDateAndTime {

	public static void main(String[] args) {
		
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
	}

}
