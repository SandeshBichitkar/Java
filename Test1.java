import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee information");
		Scanner sc=new Scanner (System.in);
        int empid;
        double salary;
        String name;
        String address;
        System.out.println("Enter Empid=");
        empid=sc.nextInt();
        System.out.println("Enter salary=");
        salary=sc.nextDouble();
        System.out.println("Enter name=");
        name=sc.next();
        System.out.println("Enter address=");
        address=sc.next();
        // print value given by user
        System.out.println("Empid="+empid);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
        System.out.println("address="+address);
	}

}
