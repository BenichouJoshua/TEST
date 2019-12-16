package Q6_3;

import java.util.ArrayList;

import Q6_1.Student;
import Q6_2.Square;

public class Main_6 {

	public static void main(String[] args) {
		ArrayList <Object> List = new ArrayList<>() ;
		List.add(new Student("Josh", 100));
		List.add(new Square(45));
		List.add(new Student("antho", 104));
		List.add(new Square(25));
		List.add(new Student("Sharone", 106));
		List.add(new Student("Sam", 144));
		List.add(new Square(55));
		List.add(new Square(125));
		List.add(new Square(295));
		
		
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i));
		}
	}

}
