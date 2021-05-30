import java.util.Scanner;
public class Day2_Swap2 {

	public static void swap(int x,int y)
	{
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("Swapped value of a and b are="+x+" "+y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5,b=7;
System.out.println("Value before swap are"+a+" "+b);
swap(a,b);
	}

}
