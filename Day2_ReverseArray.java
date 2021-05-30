import java.util.Scanner;
public class Day2_ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int[] arr=new int [5];
		System.out.println("Enter the elements of array");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are=");
		for(i=4;i<5;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
