import java.util.Scanner;

public class Day2_Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] array=new int[10];
		System.out.println("Enter element of array");
		int i;
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Elements of array");
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		int max=array[0];
		for(i=0;i<n;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Sum of the elemnets in array="+sum);
		float avg;
		avg=sum/n;
		System.out.println("Average of array element is="+avg);
		System.out.println("Maximum element in array="+max);
		int min=array[0];
		for(i=0;i<5;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		System.out.println("Minimum element of array is="+min);
		sc.close();

	}

}
