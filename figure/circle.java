package figure;

public class circle  extends figure{
	 int r;
	 
	 public circle(int x, int y, int r) {
		this.r = r;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getSquare() {
		System.out.println("Площадь равна: ");
		return 3.14*r*r;
//		return super.getSquare();
	}
}
