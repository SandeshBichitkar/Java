import java.util.Scanner;
public class Day2_MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice");
System.out.println("1-pen");
System.out.println("2-pencil");
System.out.println("3-Notebook");
System.out.println("4-Bottle");
System.out.println("5-colorBox");
int choice,quantity,price;
boolean flag=false;
int p=10,pe=5,n=20,c=50,b=30;
while(flag!=true)
{
	System.out.println("Enter your choice=");
	choice=sc.nextInt();
	switch (choice)
	{
	case 1:
		System.out.println("Enter quantity of pen=");
		quantity=sc.nextInt();
		price=quantity*p;
		System.out.println("price of pen="+price);
		break;
	case 2:
		System.out.println("Enter quantity of pencil=");
		quantity=sc.nextInt();
		price=quantity*pe;
		System.out.println("price of pencil="+price);
		break;
	case 3:
		System.out.println("Enter quantity of notebook=");
		quantity=sc.nextInt();
		price=quantity*n;
		System.out.println("price of notebook="+price);
		break;
	case 4:
		System.out.println("Enter quantity of bottle=");
		quantity=sc.nextInt();
		price=quantity*b;
		System.out.println("price of bottle="+price);
		break;
	case 5:
		System.out.println("Enter quantity of colorbox=");
		quantity=sc.nextInt();
		price=quantity*c;
		System.out.println("price of colorbox="+price);
		break;
	case 6:
		flag=true;
		
     default:
    	 System.out.println("Please! enter valid number ");
    	 break;
	}
	
}
sc.close();
	}

}
