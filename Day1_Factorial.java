import java.util.Scanner;
public class Day1_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int x,i,fact=1;
System.out.println("Enter the no to find Factorial");
x=sc.nextInt();
for(i=1;i<=x;i++)
{
    fact=fact*i;
	
}

System.out.println("factorial is="+fact);
	}

}
