import java.util.Scanner;
public class Employee {
private int id;
private String name;
private double basicSalary;
private double hra;
private double medical;
private double pf;
private double pt;
private double netSalary;
private double grossSalary;
 
public void acceptInfo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id=");
	id=sc.nextInt();
	System.out.println("Enter name=");
	name=sc.next();
	System.out.println("Enter basicSalary=");
	basicSalary=sc.nextDouble();
	System.out.println("Enter Medical=");
	medical=sc.nextDouble();
sc.close();
}
	private void calculateSalary()
	{
		hra=(basicSalary*50)/100;
		pf=(basicSalary*12)/100;
		pt=200.00;
		grossSalary=basicSalary+medical+hra;
		netSalary=grossSalary-(pt+pf);
		
		
	}
	public void displayInfo()
	{
		calculateSalary();
		System.out.println("Employee id="+id);
		System.out.println("Employee name="+name);
		System.out.println("Employee basic salary="+basicSalary);	
		System.out.println("Employee grossSalary="+grossSalary);
		System.out.println("Employee netSalary="+netSalary);
		
		
	}

}
