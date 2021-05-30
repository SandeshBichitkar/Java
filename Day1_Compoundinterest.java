import java.util.Scanner;
public class Day1_Compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      int p,t;
      double r;
      System.out.println("Enter principal=");
      p=sc.nextInt();
      System.out.println("Enter rate of interest=");
      r=sc.nextDouble();
      System.out.println("Enter time of period=");
      t=sc.nextInt();
      double a;
      a=p*Math.pow(1+(r/100),t);
     System.out.println("Amount is="+a);
     double ci;
     ci=a-p;
     System.out.println("compound interest="+ci);
     sc.close();
	}

}
