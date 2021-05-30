package package3;
import java.util.Scanner;
public class TestCustomer {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.display();
	System.out.println("Enter Customer details=");
	System.out.println("Enter id=");
	int id;
	String nm,ad;
	double cl;
	id=sc.nextInt();
	System.out.println("Enter name=");
	nm=sc.next();
	System.out.println("Enter add=");
	ad=sc.next();
	System.out.println("Enter creditLimit=");
	cl=sc.nextDouble();
	Customer c2=new Customer(id,nm,ad,cl);
	c2.setCreditLimit(25000);
	c2.display();
	}

}
