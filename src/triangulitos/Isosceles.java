package triangulitos;
/**
 * A triangle with two equals sides
 */
public class Isosceles extends Triangle {
	private double height;
	private double base;
	/**
	 * Constructor
	 * @param side1 > 0
	 * @param side2 > 0
	 * @param base > 0
	 * @param height > 0
	 * @throws Exception
	 */
	public Isosceles(double side1, double side2, double base, double height ) throws Exception {
		super(side1, side2, base);	
		this.height = height;
		this.base = base;
	}
	
	@Override
	public String Classify() {
		if (side1==side2 || side2==side3 || side1==base) {
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
	@Override
	public double calculateArea(){
		return (base*height)/2;
	}
	
}
