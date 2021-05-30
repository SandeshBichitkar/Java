import java.util.Scanner;
public class Day2_ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[] arr={1,2,3,46,7};
System.out.println("Enter number");
int n=sc.nextInt();
boolean flag=true;
int i;
for(i=0;i<arr.length;i++)
{
	if(n==arr[i])
	{
		System.out.println("Index of number is="+i);
		flag=false;
	}
}
if(flag)
{
	System.out.println("Number is not present in the index");
}


sc.close();
	}

}
