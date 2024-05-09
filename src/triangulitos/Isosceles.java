package triangulitos;
/**
 * A triangle with two equals sides
 */
public class Isosceles extends HeightTriangle {

	/**
	 * Constructor
	 * @param side1 > 0
	 * @param side2 > 0
	 * @param base > 0
	 * @param height > 0
	 * @throws Exception
	 */
	public Isosceles(double baseSide, double equalSides, double height) throws Exception {
		super(baseSide, equalSides, equalSides, height);	
	}
	
	@Override
	public String Classify() {
		if (side2==side3) {
			return "Triangle is isosceles";
		}
		else {
			return "Triangle is not isosceles";
		}
	}
	@Override
	public String toString() {
		return Classify();
	}

	
}
