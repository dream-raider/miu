package lesson4.prg2.good;

/**
 * @author Erika
 *
 */
public class Rectangle extends ClosedCurve {
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

}
