package triangulitos;

/**
 * Triangle with a right angle and an hypotenuse
 */
public class Right extends HeightTriangle {

	/**
	 * Create an instance of a right triangle
	 * @param side1
	 * @param side2
	 * @param hypotenuse
	 * @throws Exception
	 */
	public Right(double side1, double side2, double hypotenuse) throws Exception {
		super(side1, side2, hypotenuse, side1);
	}
	@Override
	public String Classify() {
		return "Triangle is a Right triangle";
	}
	@Override
	public String toString() {
		return Classify();
	}

}
