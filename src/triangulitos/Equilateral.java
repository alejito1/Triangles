package triangulitos;

/**
 * A triangle with all the sides equals
 */
public class Equilateral extends HeightTriangle{
	/**
	 * Constructor
	 * @param side > 0
	 * @param height > 0
	 * @throws Exception
	 */
	public Equilateral(double side, double height) throws Exception{
		super(side, side, side, height);
	}
	@Override
	public String Classify() {
		if (side1==side2 && side2==side3){
			return " Triangle is Equilateral";
		}
		return "Triangle is not Equilateral";
	}
	@Override
	public String toString() {
		return Classify();
	}
	
}
