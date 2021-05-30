import java.util.Scanner;
public class Day1_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a,b,t;
System.out.println("Enter the first no=");
a=sc.nextInt();
System.out.println("Enter second no=");
b=sc.nextInt();
t=a;
a=b;
b=t;
System.out.println("swaped no are ="+a+" "+b);
	}

}
