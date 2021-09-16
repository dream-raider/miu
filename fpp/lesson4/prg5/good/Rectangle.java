package lesson4.prg5.good;

/**
 * @author Erika
 *
 */
public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		return width * length;
	}

	@Override
	public double[] getArrayOfSides() {
		double side[] = { 3, 3, 4, 4 };
		return side;
	}

}
