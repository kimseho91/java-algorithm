package homework04_calendar;

import javax.swing.JOptionPane;

import homework04_grade.Grade;
import homework04_grade.GradeService;
import homework04_calendar.MyCalendar;
public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar mycalendar = null;
		MyCalendarService mcs = new MyCalendarService();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.월과 년도 입력 2.날짜 계산 3.평년계산")) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				mycalendar = new MyCalendar();
				String month = JOptionPane.showInputDialog("월을 입력하세요");
				mycalendar.setMonth(Integer.parseInt(month));
				String year = JOptionPane.showInputDialog("년도를 입력하세요");
				mycalendar.setYear(Integer.parseInt(year));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, mcs.getEndDay(mycalendar));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, mcs.isLeapYear(mycalendar));
				break;
			}

		}

	}

}
