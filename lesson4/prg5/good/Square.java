package lesson4.prg5.good;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;

	}

	public double computeArea() {
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] sides = { 3, 3, 3, 3 };
		return sides;
	}

}
