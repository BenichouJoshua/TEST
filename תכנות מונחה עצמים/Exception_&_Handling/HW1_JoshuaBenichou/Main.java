package HW1_JoshuaBenichou;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws  IllegalArgumentException, NoSuchElementException {
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		Form [] forms = new Form[6];
		int radius;
		String color;
		while (flag) {
			System.out.println("Please enter color and then radius for the first circle:");
			try {
				color = s.nextLine();
				radius = Integer.parseInt(s.nextLine());
				
				if (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("purple") 
						||color.equalsIgnoreCase("green") || color.equalsIgnoreCase("brown") ) 
					throw  new NoSuchElementException();
				Circle c1 = new Circle(color, radius);
				c1.radiusCheck();
				forms[0] = c1;
				flag = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Only integer is allowed here .. ");
			}	
			catch (NoSuchElementException e) {
				System.out.println("Illegal color : ");
			}
			catch (RadiusException e) {
				System.out.println( e.getMessage());
			}
			
		}
		
		forms[1]= new Triangle("red", 20,10);
		forms[2]= new Rect("blue", 5, 3);
		forms[3]= new Circle("yellow", 100);
		forms[4]= new Triangle("red", 2, 1);
		forms[5]= new Rect("white", 2, 6);
		
		System.out.println("Original array and areas : \n==========================");
		show(forms);
		Arrays.sort(forms);
		System.out.println("\nAfter sorting : \n==========================");
		show(forms);
		s.close();
		
	}
		
		public static void show(Form [] forms ) {
			for (int i = 0	; i < forms.length; i++) {
				System.out.println(forms[i].toString());
			}
		}
		
		

}
