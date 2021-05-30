import java.util.Scanner;
public class Day1_GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter no1");
a=sc.nextInt();
System.out.println("Enter no2");
b=sc.nextInt();
System.out.println("Enter no3");
c=sc.nextInt();
sc.close();
if(a>b&&a>c)
{
	System.out.println("a is greatest");
}
else if(b>a&&b>c)
{
	System.out.println("b is greatest");
}
else if(c>a&& c>b)
{
	System.out.println("c is greatest");
	
}
else
{
	System.out.println("all numbers are equal i.e A=B=c");
}
	}

}
