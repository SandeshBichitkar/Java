
public class Employee {
private int empid;
private String name;
private double salary;
private String add;

public Employee()
{
	System.out.println("---------------default constructor invoking---------");
}
public Employee(int empid,String name,double salary,String add)
{
	this();
	System.out.println("-------------Parameterised constructor invoking------");
	this.empid=empid;
	this.name=name;
	this.salary=salary;
	this.add=add;
	
}
public void setEmpid(int empid)
{
	this.empid=empid;
}
public int getEmpid()
{
	return empid;
}
public void setName(String name)
{
this.name=name;	
}
public String getName()
{
	return name;
}
public void setAdd(String add)
{
	this.add=add;
	
}
public String getadd()
{
	return add;
}
public void setSalary()
{
	this.salary=salary;
}
public double getSalary()
{
	return salary;
}









 public void display()
 {
	 System.out.println("empid="+empid);
	 System.out.println("name="+name);
	 System.out.println("salary="+salary);
	 System.out.println("add="+add);
 }

}
