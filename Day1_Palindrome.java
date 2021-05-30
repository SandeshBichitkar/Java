import java.util.Scanner;
public class Day1_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n, temp,sum=0;
System.out.println("Enter number to check palindrome");
n=sc.nextInt();
temp=n;
while(n>0)
{
	int a=n%10;
	sum=sum*10+a;
	n=n/10;
	
}
if(sum==temp)
{
	System.out.println("Number is palindrome");
	
	
}
else
{
	System.out.println("Number is not prime");
}




sc.close();
	}

}
