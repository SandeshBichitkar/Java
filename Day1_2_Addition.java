import java.util.Scanner;
public class Day1_2_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a,b;
		System.out.println("Enter no1=");
		a=sc.nextInt();
		System.out.println("Enter no2=");
        b=sc.nextInt();
        System.out.println("Addition of a and b is="+(a+b));
        System.out.println("Please enter first character=");
        char x=sc.next().charAt(0);
        System.out.println("Please enter second character=");
        char y=sc.next().charAt(0);
        System.out.println("Addition of "+x+" and "+y+" is:"+(x+y));
        sc.close();
     
	}

}
