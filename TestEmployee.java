
public class TestEmployee {

	public static void main(String[] args) {
		//Employee e1=new Employee();
		//e1.display();
		
		Employee e2=new Employee(101,"Sandesh",15000,"pune");
		e2.display();
		e2.setEmpid(105);
		System.out.println("new empid="+e2.getEmpid());
		e2.setName("Raj");
		System.out.println("new Name="+e2.getName());
	}

}
