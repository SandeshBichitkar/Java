import java.util.Scanner;
public class Day1_PrimeN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to find prime");
int n=sc.nextInt();
int i=0;
String primeNumbers=" ";
int num=0;
for(i=1;i<n;i++)
{
	int counter=0;
	for(num=i;num>=1;num--)
	{
		if(i%num==0)
		{
			counter=counter+1;
		}
	}
	if(counter==2)
	{
		primeNumbers=primeNumbers+i+" ";
	}
	
}
System.out.println("Prime numbers from 1 to n are:");
System.out.println(primeNumbers);
	
	}
}
