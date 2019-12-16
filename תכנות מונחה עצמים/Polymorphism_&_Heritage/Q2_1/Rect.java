package Q2_1;

public class Rect {
	private int length = 0;
	private int width = 0;
	
	public void setLength (int length) {
		this.length = length;
	}
	public void setWidth (int width) {
		this.width = width;
	}
	
	public int getWidth () {
		return width;
	}
	
	public int area() {
		return length*width;
	}
}
