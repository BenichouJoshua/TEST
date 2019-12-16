package Q2_3;

import Q2_1.Rect;
import Q2_2.Box;

public class RectMain {
	
	public static int diff(int area1, int area2) {
		return area2 - area1;
	}

	public static void main(String[] args) {
		Rect r = new Rect();
		r.setLength(10);
		r.setWidth(20);
		
		Rect r1 = new Rect();
		r1.setLength(230);
		r1.setWidth(20);
		
		
		Box b = new Box(1,2,1);
		Box b1 = new Box(34,2,9);
		
		System.out.println("Rect area : " + r.area());
		System.out.println("Box area : " + b.area());
		System.out.println("Rect1 area : " + r1.area());
		System.out.println("Box1 area : " + b1.area());
		
		System.out.println("Diff box1-rect : " + diff(r.area(), b1.area()) );
		
	}
	
	

}
