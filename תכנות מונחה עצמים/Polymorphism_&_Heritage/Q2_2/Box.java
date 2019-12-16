package Q2_2;


import Q2_1.Rect;

public class Box extends Rect{
	private int height = 0;
	
	public Box(int height,int width ,int length) {
		this.height = height;
		setWidth(width);
		setLength(length);
	}
	public int area() {
		return 2*(getWidth()*height + getWidth()*(super.area()/getWidth()) + (super.area()/getWidth()*height)); 
	}
}
