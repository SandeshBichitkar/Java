import java.util.Scanner;
public class Day2_Swap {

	public static void swap()
	{
		int a,b,t;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Value of a nd b are="+a+ " "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("swapped value of a and b are="+a+ " "+b);
		
		
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swap();
		
		
	}

}
