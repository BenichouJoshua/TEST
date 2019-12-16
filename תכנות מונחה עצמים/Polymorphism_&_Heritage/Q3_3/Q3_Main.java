package Q3_3;


import Q3_2.Circle;

public class Q3_Main {

	public static void main(String[] args) {
		Circle c = new Circle(3, 4, 6);
		
		System.out.println(c.showCircle());
		
		System.out.println(c.area());
		
		
		c.setRadius(3);
		c.setX(2);
		c.setY(8);
		
		System.out.println(c.showCircle());
		
		System.out.println(c.area());
	}

}
