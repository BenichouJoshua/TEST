package Q1_2;

import Q1_1.Person;

public class Student extends Person {
	private int grade;
	
	public Student(int id, String name,int grade) {
		super(id, name);
		this.grade=grade;
	}

	@Override
	public String toString() {
		return getName() +" " + getId()+" " + grade;
	}

	
	
	
}
