
public class Day3_VarArgs {
 public static void sum(int... a)
 {
	 System.out.println("Size="+a.length);
	 int sum=0;
	 for(int i=0;i<a.length;i++)
	 {
		 sum=sum+a[i];
	 }
	 System.out.println("sum="+sum);
 }
	public static void main(String[] args) {
         int a=15;
		sum();
		sum(10,20,1,20,2,0);
        sum(a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a);
	}

}
