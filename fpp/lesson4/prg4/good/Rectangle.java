package lesson4.prg4.good;

/**
 * @author Erika
 *
 */
public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		return width * length;
	}

	@Override
	public int getNumberOfSlides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		return width * 2 + length * 2;
	}

}
