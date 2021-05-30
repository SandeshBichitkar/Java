import java.util.Scanner;
public class Date {
private int date;//hide from outside the world
//private is accessible in class only hidden outside the class
private int month;
private int year;
 

public void acceptInfo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter date:");
	date=sc.nextInt();// date,month,year are local variable inside the function
	System.out.println("Enter month:");
	month=sc.nextInt();
	System.out.println("Enter year:");
	year=sc.nextInt();
	
}
public void setDate(int date1)
{
	date=date1;
}
public void displayInfo()
{
	System.out.println("Date:"+date);
	System.out.println("month="+month);
	System.out.println("year="+year);
}

}
