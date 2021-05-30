import java.util.Scanner;
public class Customer {
private String name;
private String email;
private int age ;
private double creditLimit;




public void acceptInfo()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
name=sc.nextLine();

System.out.println("Enter email:");
email=sc.nextLine();

System.out.println("Enter age:");
age=sc.nextInt();
System.out.println("Enter creditLimit:");
creditLimit=sc.nextDouble();
	//sc.close();
}
public void setCreditLimit(double creditL)
{
	creditLimit=creditL;
}
public double getCreditLimit()
{
	return  creditLimit;

}
public void displayInfo()
{
	
	System.out.println("Name:"+name);
	//System.out.println("email:"+email);
	//System.out.println("age:"+age);
	System.out.println("creditLimit:"+creditLimit);
	
	

}

}
