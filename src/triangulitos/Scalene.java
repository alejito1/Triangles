package triangulitos;
/**
 * Irregular triangle
 */
public class Scalene extends Triangle {
	private double semiPerimeter;
	/**
	 * Create an instance of a triangle scalene
	 * @param height
	 * @param base
	 * @param side2
	 * @throws Exception
	 */
	public Scalene(double height, double base, double side2) throws Exception {
		super(base, side2, height);
		semiPerimeter = (side1 + side2 + side3)/2;
	}
	@Override
	public String Classify() {
		if (side1 != side2 && side2!=side3 && side1!=side3) {
			return "Triangle is Scalene";
		}
		else {
			return "Triangle is not scalene";
		}
	}
	@Override
	public String toString() {
		return Classify();
	}
	@Override
	public double calculateArea(){
		return Math.sqrt(semiPerimeter*(semiPerimeter - side1)*(semiPerimeter - side2)*(semiPerimeter - side3));

	} 

}
