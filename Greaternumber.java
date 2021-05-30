import java.util.Scanner;
public class Greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int no1,no2;
     System.out.println("Enter no1=");
     no1=sc.nextInt();
     System.out.println("Enter no2=");
     no2=sc.nextInt();
     int result;
     result=no1+no2;
     System.out.println("Addition="+result);
     result=no1-no2;
     System.out.println("Subtraction="+result);
     result=no1*no2;
     System.out.println("Multiplication="+result);
     result=no1/no2;
     System.out.println("Division="+result);
	}

}
