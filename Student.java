package package1;

public class Student {
public int rollNo;
public String name;
private char grade;
int totalMarks;

public Student(int rollNo,String name,char grade,int totalMarks)
{
	System.out.println("------parameterised constructir---------");
	this.rollNo=rollNo;
	this.name=name;
	this.grade=grade;
	this.totalMarks=totalMarks;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}

public int getTotalMarks() {
	return totalMarks;
}

public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}
public void display()
{
	System.out.println("rollNo="+rollNo);
	System.out.println("name="+name);
	System.out.println("grade="+grade);
	System.out.println("totalMarks="+totalMarks);
}

}
