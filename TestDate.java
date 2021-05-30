
public class TestDate {

	public static void main(String[] args) {
		 Date d1;//create object of class 
		 d1=new Date(); //initialize the object by giving memory on heap
		 d1.acceptInfo();//call acceptinfo method
		 d1.displayInfo();//call display method to display informatin
		 //create second object
		 Date d2=new Date();
		 d2.acceptInfo();
		 d2.displayInfo();
		 //create third object
		 Date d3=new Date();
		 d3.acceptInfo();
		 d3.setDate(15);
         d3.displayInfo();
	}

}
