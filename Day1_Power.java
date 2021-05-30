import java.util.Scanner;
public class Day1_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a,b;
      int c;
      System.out.println("Enter no to find power=");
      a=sc.nextInt();
      System.out.println("Enter power to find of no=");
      b=sc.nextInt();
     
      System.out.println("power="+Math.pow(a, b));
	}

}
