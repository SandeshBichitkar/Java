import java.util.Scanner;
public class Day1_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number=");
    int n=sc.nextInt();
    sc.close();
    int sum=0,temp,r;
    temp=n;
    while(n>0)
    {
    	r=n%10;
    	sum=sum+(r*r*r);
    	n=n/10;
    }
    if(temp==sum)
    	System.out.println("Number is Armstrong ");
    else
    	System.out.println("Number is not Armstrong");
	}

}
