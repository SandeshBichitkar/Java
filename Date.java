package package3;

    public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date()
	{
		System.out.println("_-----Default Constructor---------");
		
		
	}
	public Date(int day,int month,int year)
	{
		
		System.out.println("-------parameterised constructor-----");
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public void setDate(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
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
	public void display()
	{
		System.out.println("Date="+day+"/"+month+"/"+year );
	}
}
