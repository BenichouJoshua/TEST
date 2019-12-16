package Q1_Main_test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Q1_Student.Student;

public class Q1_MAIN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter student name ; ");
		String name = s.next();
		
		System.out.println("Please enter a student grade ; ");
		
		boolean goodGrade = true;
		while (goodGrade) {
		try {
			int grade = Integer.parseInt(s.nextInt());
			Student student = new Student(name ,grade);
			System.out.println(student);
			goodGrade = false;
		} 
		catch (InputMismatchException e) {
			System.out.println("The grade has to be an integer.");
			System.out.println("Please reenter grade");
			
		
		}
		
		
		}
		
	
	
		
	}

}
