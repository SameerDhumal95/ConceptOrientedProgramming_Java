
public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public MyDate()
	{
		this.day=0;
		this.month=0;
		this.year=0;
	}
	
    public MyDate(int day,int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String toString() {
		return "BirthDate day=" + day + ", month=" + month + ", year=" + year + "]";
	}
    
	
}
