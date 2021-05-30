import java.util.Arrays;

public class Day3_ArrayMerge {

	public static void main(String[] args) {
		int[] firstArray= {5,8,9,6,5,2,5};
		int[] secondArray= {11,22,55,7,8,44};
		int l=firstArray.length+secondArray.length;
		int[] mergedArray=new int[l];
		int pos=0;
		for(int element:firstArray)
		{
			mergedArray[pos]=element;
			pos++;
		}
		for(int element:secondArray)
		{
			mergedArray[pos]=element;
			pos++;
		}
		System.out.println(Arrays.toString(mergedArray));
	}

}
