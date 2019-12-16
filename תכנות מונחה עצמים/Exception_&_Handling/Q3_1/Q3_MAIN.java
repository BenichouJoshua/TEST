package Q3_1;

import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class Q3_MAIN {
	private final int MAX = -5, MIN = 10;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer value, in the range of -5 to 10 :");
		int num = Integer.parseInt(s.nextLine());
		

	}
	
	public static int range(int n ) throws IllegalArgumentException{
		if (n< || n>m) {
			
		}
	}
	
	public void range(int num) {
		boolean flag = true;
		while (flag) {
			try {
				if (num>-5 && num<10) {
				System.out.println(num);
				flag = false;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("The input is out of range");
			}
		}
		
	}

}
