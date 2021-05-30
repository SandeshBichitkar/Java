import java.util.Scanner;
public class Day1_OddevenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number to find sum");
int n=sc.nextInt();
int evensum=0,oddsum=0,i;
for(i=1;i<=n;i++)
{
	if(i%2==0)
	{
		evensum=evensum+i;
	}
	else
	{
		oddsum=oddsum+i;
	}
}
System.out.println("Even number sum is="+evensum);
System.out.println("Odd number sum is="+oddsum);
	}

}
