package package3;

public class Person {
private char blooodGroup;
private String add;
private String name;
private String gmail;
private int age;
private double creditLimit;

public Person()
{
name="Riya";
gmail="riya@gmail.com";
age=25;
creditLimit=20000;
}


public Person(char blooodGroup, String add, String name, String gmail, int age, double creditLimit) {
	super();
	this.blooodGroup = blooodGroup;
	this.add = add;
	this.name = name;
	this.gmail = gmail;
	this.age = age;
	this.creditLimit = creditLimit;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getCreditLimit() {
	return creditLimit;
}


public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
}


public void display()
{
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("gmail="+gmail);
	System.out.println("creditLimit="+creditLimit);
	System.out.println("bloodGroup="+blooodGroup);
	System.out.println("address="+add);
	
	}


}


