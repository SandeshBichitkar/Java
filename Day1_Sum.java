import java.util.Scanner;
public class Day1_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n,sum=0,i;
System.out.println("Enter series last number=");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	sum=sum+i;
}
System.out.println("sum is ="+sum);
sc.close();
}
}
