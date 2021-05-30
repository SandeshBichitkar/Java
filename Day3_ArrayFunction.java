
public class Day3_ArrayFunction {
  public static void stringArray(String[] names)
  {
	for(int i=0;i<names.length;i++)
	{
		System.out.println(names[i].toUpperCase());
		
	  
	}
  }
	
	public static void main(String[] args) {
		
      String[] arr= {"Sandesh","Raj","Ravi","Saurabh" };
	stringArray(arr);

	}
}