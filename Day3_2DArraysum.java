import java.util.Scanner;
public class Day3_2DArraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int [][]a;int [][] b;
System.out.println("Enter size of array");
int x=sc.nextInt();
int y=sc.nextInt();
a=new int[x][y];
b=new int [x][y];
System.out.println("Enter values of a=");
for(int i=0;i<x;i++)
{
	for(int j=0;j<y;j++)
	{
	     a [i][j]=sc.nextInt();
	}
}
System.out.println("Enter values of b=");
for(int i=0;i<x;i++)
{
	for(int j=0;j<y;j++)
	{
		b[i][j]=sc.nextInt();
	}
}
int [][] c=new int[x][y];
for(int i=0;i<x;i++)
{
	for(int j=0;j<y;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
	}
}

System.out.println("Addition of two array=");
for(int i=0;i<x;i++)
{
	for(int j=0;j<y;j++)
	{
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
sc.close();
	}

}
