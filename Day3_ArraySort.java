
public class Day3_ArraySort {

	public static void main(String[] args) {
      int[] arr= {45,25,65,88,45,11,2,25,21,55,88,79,88};
System.out.println("Array elements after sorting");
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		int temp=0;
    		if(arr[i]>arr[j])
    		{
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    		
    	}
    	  System.out.print(+arr[i] +" ");

    }
  	}

}
