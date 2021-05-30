import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int rollno;
String name;
int[] arr=new int[5];
arr[0]=60;
arr[1]=70;
arr[2]=75;
arr[3]=72;
arr[4]=80;
System.out.println("Enter roll no=");
rollno=sc.nextInt();
System.out.println("Roll  no="+rollno);
System.out.println("Enter Name of Student=");
name=sc.next();
System.out.println("Name="+name);
sc.close();
int i,sum=0,total=500;
float per;
for(i=0;i<5;i++)
{
	sum=sum+arr[i];
}
System.out.println("Sum of marks="+sum);
per=(sum/total)*100;
if(per>75) {
	System.out.println("Student get grade A");
}
else if(per<74&&per>60)
{
	System.out.println("Student get grade B");
	
}
else
{
	System.out.println("Student get grade C");
}
	}

}
