package Q3_2;

import Q3_1.Point;

public class Circle extends Point {
	private int radius;
	
	
	public Circle(float x, float y,int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

	public String showCircle() {
		return showPoint() + "Radius : " + radius;
	}
	
	
}
