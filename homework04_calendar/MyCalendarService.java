package homework04_calendar;
import homework04_calendar.MyCalendar;

public class MyCalendarService {
	public String getEndDay(MyCalendar mycalendar) {
		String endDay = "";
		int month = mycalendar.getMonth();
		switch (month) {
		case 1 : case 5 : case 7 : case 8 : case 10 : case 12 :
			endDay = "31일";
			break;
		case 3 : case 4 : case 9 : case 11 :
			endDay = "30일";
			break;
		case 2 : case 6 :
			endDay = "29일";
			break;
		}
		
		return endDay = String.format("%d월은 %s일 입니다.",month,endDay);
	}
	
	public String isLeapYear(MyCalendar mycalendar) {
		String leapYear = "";
		int year = mycalendar.getYear();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			leapYear = String.format("%d년은 윤년입니다. \n",year);
		}else {
			leapYear = String.format("%d년은 평년입니다. \n",year);
		}
		return leapYear;
	}
}
