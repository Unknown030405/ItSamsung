package figure;

public class square extends figure{

	int s;
	
	public square(int x, int y, int s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	@Override
	public double getSquare() {
		return s*s;
//		return super.getSquare();
	}
	
}
