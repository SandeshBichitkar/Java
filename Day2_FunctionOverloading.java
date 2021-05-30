
public class Day2_FunctionOverloading {
  public static void add()
  {
	  System.out.println("adding");
  }
  public static void add(int i,int j)
  {
	  System.out.println("Add="+(i+j));
  }
  public static void add(int i,int j,int k)
  {
	  System.out.println("Add="+(i+j+k));
  }
  public static void add(double i,int j)
  {
	  System.out.println("Add="+(i+j));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20,d=40;
double c=15.62;
add();
add(a,b);
add(a,b,d);
add(c,a);
add(10,22);
add(14.25,15);
	}

}
