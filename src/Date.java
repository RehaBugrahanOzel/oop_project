import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {

	int day, month, year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {return day;}

	public void setDay(int day) {this.day = day;}

	public int getMonth() {return month;}

	public void setMonth(int month) {this.month = month;}

	public int getYear() {return year;}

	public void setYear(int year) {this.year = year;}

	public Date CurrentDate () {
		LocalDate currentdate = LocalDate.now();
	    int currentDay = currentdate.getDayOfMonth();
	    int currentMonth = currentdate.getMonthValue();
	    int currentYear = currentdate.getYear();
	    Date date = new Date(currentDay,currentMonth, currentYear);
	    return date;
	}
	
	public long Duration (Date start, Date end) {
		LocalDate dateBefore = LocalDate.of(start.year, start.month, start.day);
	    LocalDate dateAfter = LocalDate.of(end.year, end.month, end.day);
	    long DaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	    return DaysBetween;
	}
}
