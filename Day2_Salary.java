import java.util.Scanner;
public class Day2_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
double salary;
System.out.println("Enter salary of employee");
salary=sc.nextDouble();
double hra,da;
if(salary<=10000)
{
	hra=(salary*20)/100;
	da=(salary*80)/100;
}
else if(salary>10000 && salary<20000)
{
	hra=(salary*25)/100;
	da=(salary*80)/100;
}
else
{
	hra=(salary*30)/100;
	da=(salary*95)/100;
}
double gross=hra+da+salary;
System.out.println("Salary="+gross);
	}

}
