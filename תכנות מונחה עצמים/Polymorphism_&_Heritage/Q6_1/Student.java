package Q6_1;

public class Student {
	private String name ;
	private int grade;
	
	public Student(String name , int grade) {
		this.name = name;
		this.grade = grade;
		
	}
	
	public String toString() {
		return name +"\n" + grade;
		
	}
	
	}
