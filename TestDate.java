package package3;

public class TestDate {

	public static void main(String[] args) {
		//Date d1=new Date();
		//d1.display();
		
		Date d2=new Date(11,05,2021);
		d2.display();
				
		Date d3=new Date(10,05,2021);
		d3.setDate(12);
		d3.setMonth(04);
		d3.setYear(2020);
		System.out.println("Day="+d3.getDay());
		System.out.println("month="+d3.getMonth());
		System.out.println("year="+d3.getYear());
	}

}
