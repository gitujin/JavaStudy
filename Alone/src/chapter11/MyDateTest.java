package chapter11;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			return(this.day == date.day && this.month == date.month && this.year == date.year);
		}
		return false;
	}
	
	public int hashCode() {
		return day * 10 + month * 101 + year * 102;
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
