package hashTable;

public class Student {

	private String name;
	private String rollno;
	private double cgpa;
	
	
	public Student(String name, String rollno, double cgpa) {
		
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	public String toString() {
		return "Name: "+name+" Rollno: "+rollno+" cgpa: "+cgpa;
	}
	
}
