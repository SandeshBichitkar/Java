package package2;

public class Batch {
public int batchYear;
private int batchStudentTotal;
public Batch(int batchYear, int batchStudentTotal) {
	
	this.batchYear = batchYear;
	this.batchStudentTotal = batchStudentTotal;
}
public int getBatchYear() {
	return batchYear;
}
public void setBatchYear(int batchYear) {
	this.batchYear = batchYear;
}
public int getBatchStudentTotal() {
	return batchStudentTotal;
}
public void setBatchStudentTotal(int batchStudentTotal) {
	this.batchStudentTotal = batchStudentTotal;
}
public void display() {
	
	System.out.println("batchYear="+batchYear);
	System.out.println("batchStudentTotal="+batchStudentTotal);
}

}
