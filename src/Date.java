import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {

	int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public Date() {
		super();
	}

	public Date CurrentDate () {
		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		int currentMonth = currentdate.getMonthValue();
		int currentYear = currentdate.getYear();
		Date date = new Date(currentDay,currentMonth, currentYear);
		return date;
	}

}
