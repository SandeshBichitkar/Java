import java.util.Scanner;
public class Day3_2DArray {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		System.out.println("Enter element of array=");
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//coloum
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Elements of array are=");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
