import java.util.Scanner;
public class Day3_CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size=");
		size=sc.nextInt();
		char[] arr=new char[size];
		System.out.println("Enter your Character");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		String str=new String(arr);
		System.out.println("string is=");
		System.out.println(arr);
	}

}
