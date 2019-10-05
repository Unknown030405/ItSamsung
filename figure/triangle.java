package figure;

public class triangle extends figure{
	int s;
	int h;
	
	public triangle(int x, int y, int s, int h) {
		this.s = s;
		this.x = x;
		this.y = y;
		this.h = h;
	}
	
	@Override
	public double getSquare() {
		return h*(s/2);
//		return super.getSquare();
	}

}
