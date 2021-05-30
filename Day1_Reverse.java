import java.util.Scanner;
public class Day1_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
	int n=sc.nextInt();
	int sum=0;
	while(n>0)
	{
		int a=n%10;
	    sum=sum*10+a;
	    n=n/10;
	}
	System.out.println("Reverse number is="+sum);
	
	
	}

}
