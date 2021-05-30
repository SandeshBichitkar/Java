
public class TestCustomer {

	public static void main(String[] args) {
	 
		Customer c1=new Customer();
		c1.acceptInfo();
		c1.displayInfo();
		//create second object
		Customer c2=new Customer();
		c2.acceptInfo();
		c2.setCreditLimit(50000.50);
        c2.displayInfo();
        System.out.println("New credit limit for c2 : "+c2.getCreditLimit());
        
        
	}

}
