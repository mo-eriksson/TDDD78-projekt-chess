package se.liu.ida.anter491.tddd78.lab2;


public class Date
{
    private int year;
    private Month month;
    private int day;

    public Date(final int year, final Month month, final int day) {
	this.year = year;
	this.month = month;
	this.day = day;
    }

    public int getYear() {
	return year;
    }

    public Month getMonth() {
	return month;
    }

    public int getDay() {
	return day;
    }

    @Override
    public String toString() {
	return getYear() + "/" + month.getName() + "/" + getDay();
    }

    public static void main(String[] args) {
	//Month march = new Month("march", Month.getMonthNumber("march"),Month.getMonthDays("march"));
	//Date testDate = new Date(2000, march, 10);
	//System.out.println(month.getName());


    }
}
