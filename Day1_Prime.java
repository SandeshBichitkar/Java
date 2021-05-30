import java.util.Scanner;
public class Day1_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a,i;
System.out.println("Please enter a number=");
		a=sc.nextInt();
		boolean flag=true;
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println(+a+" "+ "is aprime number");
			
		}
		else
		{
			System.out.println(+a+" "+ "is not a prime number");
		}
		
		
	}

}
