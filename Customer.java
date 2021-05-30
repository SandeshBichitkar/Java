package package3;

public class Customer {
private int cid;
private String cname;
private String cadd;
private double creditLimit;
public Customer()
{
	cid=100;
	cname="Raj";
	cadd="Solapur";
	creditLimit=20000;
}
public Customer(int cid, String cname, String cadd, double creditLimit) {
	this();
	this.cid = cid;
	this.cname = cname;
	this.cadd = cadd;
	this.creditLimit = creditLimit;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public double getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
}
public void display()
{
	System.out.println("cid="+cid);
	System.out.println("cname="+cname);
	System.out.println("cadd="+cadd);
	System.out.println("creditLimit="+creditLimit);
}

}
